package ires.corso.partone.geometric;

import java.util.Scanner;

public class Trapezio {

    // (Base maggiore + Base Minore * altezza) /2

    public static void computeArea() {
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza della base Maggiore");

        double bMag = in.nextDouble();
        System.out.println("Inserisci la lunghezza della base Minore ");
        double bMin = in.nextDouble();
        System.out.println("Interisci la lunghezza dell'altezza");
        double altezza = in.nextDouble();
        double aTrap = ((bMag+bMin)* altezza) /2 ;

        System.out.println("L'area del triangolo è " + aTrap);
    }
}
