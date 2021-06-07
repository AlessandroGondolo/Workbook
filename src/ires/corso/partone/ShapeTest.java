package ires.corso.partone;

import ires.corso.partone.geometric.Quadrato;
import ires.corso.partone.geometric.Trapezio;
import ires.corso.partone.geometric.Triangolo;

import java.util.Scanner;

public class ShapeTest {



    public static void main(String[] args) {

        Scanner in ;

        in = new Scanner(System.in);

        System.out.println("Decidi la figura di cui vuoi calcolare l'area");
        String a = in.next();
        switch (a) {
            case "quadrato":

                System.out.println("Interisci la lunghezza del lato");
                int l = in.nextInt();
                double aQuad = Quadrato.computeArea(l);
                System.out.println("L'area del triangolo è " + aQuad);
                break;
            case "triangolo":


                System.out.println("Inserisci la lunghezza della base");
                int base = in.nextInt();
                System.out.println("Interisci la lunghezza dell'altezza");
                int altezza = in.nextInt();
                double aTriang = Triangolo.computeArea(base, altezza);

                System.out.println("L'area del triangolo è " + aTriang);
                break;
            case "trapezio":

                System.out.println("Inserisci la lunghezza della base Maggiore");
                int bMag = in.nextInt();
                System.out.println("Inserisci la lunghezza della base Minore ");
                int bMin = in.nextInt();
                System.out.println("Interisci la lunghezza dell'altezza");
                altezza = in.nextInt();
                double aTrap = Trapezio.computeArea(0,0,0);
                System.out.println("L'area del triangolo è " + aTrap);
                break;
        }



    }
}
