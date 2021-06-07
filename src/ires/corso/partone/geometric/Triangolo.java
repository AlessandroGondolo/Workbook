package ires.corso.partone.geometric;

import java.util.Scanner;

public class Triangolo {

    public static void computeArea() {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Inserisci la lunghezza della base");
        double base = in.nextDouble();
        System.out.println("Interisci la lunghezza dell'altezza");
        double altezza = in.nextDouble();
        double aTriang = (base * altezza) / 2;
        System.out.println("L'area del triangolo è " + aTriang);
    }

}
