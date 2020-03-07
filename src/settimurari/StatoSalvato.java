package settimurari;

import java.io.Serializable;

public class StatoSalvato implements Serializable {

    private Setto[] attualeArr;
    private Setto[] modificatoArr;

    private int attualeStage;
    private int modificatoStage;

    public StatoSalvato() {
        attualeArr = new Setto[GestoreSetti.getAttualeArr().length];
        for (int i = 0; i < attualeArr.length; i++) {
            attualeArr[i] = GestoreSetti.getAttualeArr()[i];
        }

        modificatoArr = new Setto[GestoreSetti.getModificatoArr().length];
        for (int i = 0; i < modificatoArr.length; i++) {
            modificatoArr[i] = GestoreSetti.getModificatoArr()[i];
        }

        attualeStage = GestoreSetti.getAttualeStage();
        modificatoStage = GestoreSetti.getModificatoStage();
    }

    public Setto[] getAttualeArr() {
        return attualeArr;
    }

    public Setto[] getModificatoArr() {
        return modificatoArr;
    }

    public int getAttualeStage() {
        return attualeStage;
    }

    public int getModificatoStage() {
        return modificatoStage;
    }

    public void setAttualeArr(Setto[] attualeArr) {
        this.attualeArr = attualeArr;
    }

    public void setModificatoArr(Setto[] modificatoArr) {
        this.modificatoArr = modificatoArr;
    }

    public void setAttualeStage(int attualeStage) {
        this.attualeStage = attualeStage;
    }

    public void setModificatoStage(int modificatoStage) {
        this.modificatoStage = modificatoStage;
    }

    public void stampa() {
        for (int i = 0; i < attualeArr.length; i++) {
            System.out.println(attualeArr[i]);
        }

        for (int i = 0; i < modificatoArr.length; i++) {
            System.out.println(modificatoArr[i]);
        }

        System.out.println(attualeStage);
        System.out.println(modificatoStage);

    }

}
