package settimurari;

public class GestoreSetti {

    private static Setto[] attualeArr;
    private static Setto[] modificatoArr;

    private static int attualeStage;
    private static int modificatoStage;

    static {
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
    
    public static void aggiungiSetto(Setto s){
        if(!attualeCompletato()){
            attualeArr[getAttualeStage()] = s;
            incrementaAttualeStage();
        }else if(!modificatoCompletato()){
            modificatoArr[getModificatoStage()] = s;
            incrementaModificatoStage();
        }
    }
    
    public static boolean calcolaStatoVerificato(){
        return true;
    }
    
    public static String getStageLog(){
        if(!attualeCompletato()){
            return "STATO ATTUALE: inserire setto " + (getAttualeStage() + 1);
            
        }else if(!modificatoCompletato()){
            return "STATO MODIFICATO: inserire setto " + (getModificatoStage() + 1);
        }
        
        return "Input terminato correttamente.";
    }

}
