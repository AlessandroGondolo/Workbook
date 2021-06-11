package ires.corso.partTwo.firstClasses.Class;

public class Automobile {

    public static String marca;
    public static String modello;
    public static int cilindrataMotore;
    public static boolean secondaMano;


    public Automobile(String marca, String modello, int cilindrataMotore, boolean secondaMano) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrataMotore = cilindrataMotore;
        this.secondaMano = secondaMano;
    }

    public void prettyPrint() {

        if (this.secondaMano) {
            System.out.printf("La macchina è una %s modello %s, il motore ha cilindrata %d ed è di Seconda mano", this.marca, this.modello, this.cilindrataMotore);
        } else {
            System.out.printf("La macchina è una %s modello %s, il motore ha cilindrata %d ed è nuova", this.marca, this.modello, this.cilindrataMotore);
        }
        System.out.println("");

    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Automobile.marca = marca;
    }

    public static String getModello() {
        return modello;
    }

    public static void setModello(String modello) {
        Automobile.modello = modello;
    }

    public static int getCilindrataMotore() {
        return cilindrataMotore;
    }

    public static void setCilindrataMotore(int cilindrataMotore) {
        Automobile.cilindrataMotore = cilindrataMotore;
    }

    public static boolean isSecondaMano() {
        return secondaMano;
    }

    public static void setSecondaMano(boolean secondaMano) {
        Automobile.secondaMano = secondaMano;
    }


}
