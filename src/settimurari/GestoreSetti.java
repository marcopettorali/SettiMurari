package settimurari;

import java.io.*;
import java.text.DecimalFormat;

public class GestoreSetti {

    private static Setto[] attualeArr;
    private static Setto[] modificatoArr;

    private static int attualeStage;
    private static int modificatoStage;

    private static double vAttuale;
    private static double vModificato;

    private static double dAttuale;
    private static double dModificato;

    private static double kAttuale;
    private static double kModificato;

    private static int iAttuale;
    private static int iModificato;

    static {
        attualeStage = 0;
        modificatoStage = 0;
    }

    public static void reset() {
        attualeArr = null;
        modificatoArr = null;
        attualeStage = 0;
        modificatoStage = 0;
    }

    public static Setto[] getAttualeArr() {
        return attualeArr;
    }

    public static Setto[] getModificatoArr() {
        return modificatoArr;
    }

    public static void buildAttualeArr(int i) {
        attualeArr = new Setto[i];
    }

    public static void buildModificatoArr(int i) {
        modificatoArr = new Setto[i];
    }

    public static boolean attualeCompletato() {
        return attualeArr.length == attualeStage;
    }

    public static boolean modificatoCompletato() {
        return modificatoArr.length == modificatoStage;
    }

    public static void incrementaAttualeStage() {
        attualeStage++;
    }

    public static void incrementaModificatoStage() {
        modificatoStage++;
    }

    public static int getAttualeStage() {
        return attualeStage;
    }

    public static int getModificatoStage() {
        return modificatoStage;
    }

    public static void aggiungiSetto(Setto s) {
        if (!attualeCompletato()) {
            attualeArr[getAttualeStage()] = s;
            incrementaAttualeStage();
        } else if (!modificatoCompletato()) {
            modificatoArr[getModificatoStage()] = s;
            incrementaModificatoStage();
        }
    }

    public static void aggiornaSetto(Setto s, int numero, String attMod) {
        if (attMod.equals("Attuale")) {
            attualeArr[numero] = s;
        } else if (attMod.equals("Modificato")) {
            modificatoArr[numero] = s;
        } else {
            System.err.println("ERRORE");
        }
    }

    public static boolean calcolaStatoVerificato() {
        dAttuale = attualeArr[0].getDu();
        iAttuale = 0;
        for (int i = 0; i < attualeArr.length; i++) {
            Setto s = attualeArr[i];
            if (dAttuale < s.getDu()) {
                iAttuale = i;
                dAttuale = s.getDu();
            }
        }

        dModificato = modificatoArr[0].getDu();
        iModificato = 0;
        for (int i = 0; i < modificatoArr.length; i++) {
            Setto s = modificatoArr[i];
            if (dModificato < s.getDu()) {
                iModificato = i;
                dModificato = s.getDu();
            }
        }

        vAttuale = 0;
        kAttuale = 0;
        for (Setto s : attualeArr) {
            vAttuale += s.getK() * dAttuale;
            kAttuale += s.getK();
        }

        vModificato = 0;
        kModificato = 0;
        for (Setto s : modificatoArr) {
            vModificato += s.getK() * dModificato;
            kModificato += s.getK();
        }

        if (vModificato >= vAttuale && dModificato >= dAttuale && 0.85 * kAttuale <= kModificato && kModificato <= 1.15 * kAttuale) {
            return true;
        } else {
            return false;
        }
    }

    public static String getConclusioniAttuale() {
        return ""
                + "δu = " + new DecimalFormat("0.000").format(dAttuale) + " cm --> Setto n. " + (iAttuale+1) + "\n"
                + "Vt dei setti = " + new DecimalFormat("0.000").format(vAttuale) + " daN" + "\n"
                + "K dei setti = " + new DecimalFormat("0.000").format(kAttuale) + " daN/cm";
    }
    
    public static String getConclusioniModificato() {
        return ""
                + "δu = " + new DecimalFormat("0.000").format(dModificato) + " cm --> Setto n. " + (iModificato+1) + "\n"
                + "Vt dei setti = " + new DecimalFormat("0.000").format(vModificato) + " daN" + "\n"
                + "K dei setti = " + new DecimalFormat("0.000").format(kModificato) + " daN/cm";
    }

    public static String getStageLog() {
        if (!attualeCompletato()) {
            return "STATO ATTUALE: inserire setto " + (getAttualeStage() + 1);

        } else if (!modificatoCompletato()) {
            return "STATO MODIFICATO: inserire setto " + (getModificatoStage() + 1);
        }

        return "Input terminato correttamente.";
    }

    public static void caricaStatoSalvato(StatoSalvato s) {
        reset();
        buildAttualeArr(s.getAttualeArr().length);
        buildModificatoArr(s.getModificatoArr().length);
        for (int i = 0; i < s.getAttualeStage(); i++) {
            aggiungiSetto(s.getAttualeArr()[i]);
        }
        for (int i = 0; i < s.getModificatoStage(); i++) {
            aggiungiSetto(s.getModificatoArr()[i]);
        }
    }
}
