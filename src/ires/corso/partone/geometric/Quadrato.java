package ires.corso.partone.geometric;

import com.sun.corba.se.impl.encoding.CDRInputObject;

import java.util.Scanner;

public class Quadrato {
    //Versione con gli input interni alla classe quadrato

    public static void computeArea () {
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Inserisci il lato del quadrato");
        double l = in.nextDouble();
        double area = l * l;
        System.out.println("L'area del quadrato è " + area);



    }

}
