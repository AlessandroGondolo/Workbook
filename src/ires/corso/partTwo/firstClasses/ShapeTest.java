package ires.corso.partTwo.firstClasses;


import ires.corso.partTwo.firstClasses.Geometric.MasterShape;
import ires.corso.partTwo.firstClasses.Geometric.Quadrato;
import ires.corso.partTwo.firstClasses.Geometric.Triangolo;
import ires.corso.partTwo.firstClasses.Geometric.Trapezio;


import java.util.Scanner;

public class ShapeTest {

    public static void main(String[] args) {

        // prendo in input da tastier le vare figure geomeriche

        Scanner in = new Scanner(System.in);
        MasterShape[] figure = new MasterShape[3];
        System.out.println("Inseriamo le dimensioni di 3 figure diverse");
        System.out.println("Inserisci la lunghezza lato del quadrato: ");
        double lato = in.nextDouble();
        Quadrato q1 = new Quadrato(lato);

        System.out.println("Inserisci la lunghezza del primo lato del triangolo ");
        double base = in.nextDouble();
        System.out.println("Inserisci la lungezza dell'altezza del triangolo ");
        double altezza = in.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo ");
        double lato1 = in.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo ");
        double lato2 = in.nextDouble();
        Triangolo tria1 = new Triangolo(base,altezza,lato1,lato2);

        System.out.println("Interisci la lunghezza della base maggiore del trapezio ");
        double baseMagg = in.nextDouble();
        System.out.println("Interisci la lunghezza della base minore del trapezio ");
        double baseMin = in.nextDouble();
        System.out.println("Interisci la lunghezza dell'altezza del trapezio ");
        double altezzaTrap = in.nextDouble();
        System.out.println("Interisci la lunghezza del primo lato del trapezio ");
        double lato3 = in.nextDouble();
        System.out.println("Interisci la lunghezza del secondo lato del trapezio ");
        double lato4 = in.nextDouble();
        Trapezio trap1 = new Trapezio(baseMagg,baseMin,altezzaTrap,lato3,lato4);

        figure[0] = q1;
        figure[1] = tria1;
        figure[2] = trap1;

        for (int i = 0; i < figure.length; i++) {
            figure[i].computeArea();
            figure[i].computePerimeter();
        }

        /*
        Dati di test  Quadrato Lato =5 ;

        Triangolo Lato1 = 5, Lato 2 = 4, Lato 3 = 3,   Altezza = 4;

        Trapezio Base Maggiore = 12 , Base Minore 4  , Lato 1 = 7, Lato 2 =7 ;

         */
    }
}
