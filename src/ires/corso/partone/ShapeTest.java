package ires.corso.partone;

import ires.corso.partone.geometric.Quadrato;
import ires.corso.partone.geometric.Trapezio;
import ires.corso.partone.geometric.Triangolo;

import java.util.Scanner;

public class ShapeTest {


    public static void main(String[] args) {

        Scanner in;

        in = new Scanner(System.in);

        System.out.println("Decidi la figura di cui vuoi calcolare l'area");
        String a = in.next();
        switch (a) {
            case "quadrato":
                Quadrato.computeArea();
                break;
            case "triangolo":
                Triangolo.computeArea();
                break;
            case "trapezio":
                Trapezio.computeArea();
                break;
        }


    }
}
