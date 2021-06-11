package ires.corso.partTwo.firstClasses.Class;

public class Bottiglia {


    public static String materiale;
    public static int dimensione;
    public static boolean piena;

    public Bottiglia(String materiale, int dimensione, boolean piena){
        this.materiale = materiale;
        this.dimensione = dimensione;
        this.piena = piena;
    }

    public void prettyPrint() {
        if (this.piena) {
            System.out.printf("La bottiglia è di %s di dimensione %d ed è piena", this.materiale, this.dimensione);
        } else {
            System.out.printf("La bottiglia è di %s di dimensione %d ed è vuota", this.materiale, this.dimensione);
        }
        System.out.println("");
    }

    public static String getMateriale() {
        return materiale;
    }

    public static void setMateriale(String materiale) {
        Bottiglia.materiale = materiale;
    }

    public static double getDimensione() {
        return dimensione;
    }

    public static void setDimensione(int dimensione) {
        Bottiglia.dimensione = dimensione;
    }

    public static boolean isPiena() {
        return piena;
    }

    public static void setPiena(boolean piena) {
        Bottiglia.piena = piena;
    }



}
