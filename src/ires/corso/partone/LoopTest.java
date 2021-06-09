package ires.corso.partone;

import java.util.Scanner;

public class LoopTest {

    public static void main(String[] args) {

        loopTest2();

        //1
        //2 3
        //4 5 6
        //7 8 9 10


    }

    public static void loopTest1() {

        int i, j, n;
        int incr = 1;
        Scanner in;

        in = new Scanner(System.in);

        System.out.println("Dimensione del triangolo:");

        n = in.nextInt();

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print(incr);
                incr++;
            }
            System.out.println("");
        }
    }

    public static void loopTest2() {

        int i, d;
        d = 7;

        for (i = 1; i <= d; i++) {

            printDiamondNumbers(i, d);

        }

        for (i = d - 1; i >= 1; i--) {

            printDiamondNumbers(i, d);
        }

    }

    public static void printDiamondNumbers(int indice, int d) {

        int numSpaces = d - indice;
        printNumbers(numSpaces, indice);
    }

    public static void printNumbers(int numSpaces, int i) {
        int j;

        for (j = 1; j <= numSpaces; j++) {
            System.out.print(" ");
        }
        for (j = i; j >= 1; j--) {
            System.out.print(j);
        }
        for (j = 2; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println("");
    }

}
