package ires.corso.partone;

import sun.security.x509.OtherName;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner in;

        in = new Scanner(System.in);

        System.out.println("Inserisci 3 numeri interi da confrontare: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max;
        int order;
        if ((a == b) || (c == a)) {
            System.out.println("I 3 numeri sono uguali");
        } else {
            if (a > b) {
                max = a;
                order = 1;
            } else {
                max = b;
                order = 2;
            }


            if (c > max) {
                max = c;
                order = 3;
            }

            System.out.println("Il numero maggiore è:" + max); //esercizio 1

            System.out.println("Il numero maggiore è il " + order + "° numero inserito ed è: " + max); // esercizio 2

        }
    }
}
