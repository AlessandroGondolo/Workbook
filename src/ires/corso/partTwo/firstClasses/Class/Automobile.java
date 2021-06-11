package ires.corso.partTwo.firstClasses.Class;

public class Automobile {

    public static String marca;
    public static String modello;
    public static int cilindrataMotore;
    public static boolean secondaMano;
    Motore carburante;


    public Automobile(String marca, String modello, int cilindrataMotore, boolean secondaMano, Motore carburante) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrataMotore = cilindrataMotore;
        this.secondaMano = secondaMano;
        this.carburante = carburante;
    }

    public void prettyPrint() {

        if (this.secondaMano) {
            System.out.printf("La macchina è una %s modello %s, il motore ha cilindrata %d, è alimentata a %s ed è di Seconda mano\n", this.marca, this.modello, this.cilindrataMotore, this.carburante);
        } else {
            System.out.printf("La macchina è una %s modello %s, il motore ha cilindrata %d, è alimentata a %s ed è nuova\n", this.marca, this.modello, this.cilindrataMotore, this.carburante);
        }

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

    public enum Motore {
        ELETTRICO,
        BENZINA,
        DIESEL,
        METANO
    }
}
