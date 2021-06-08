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

        int i,j,d;

        d = 7;

        for (i=1; i<=d; i++) {

            int numSpaces = d-i;

            for (j=1; j<= numSpaces; j++){
                System.out.print(" ");
            }

            int numStars = (2*i) -1;
            for (j =1; j<=numStars;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (i=d-1; i>=1; i--) {

            int numSpaces = d-i;

            for (j=1; j<= numSpaces; j++){
                System.out.print(" ");
            }

            int numStars = (2*i) -1;
            for (j =1; j<=numStars;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }

}
