package ires.corso.partone.geometric;

public class Trapezio {

    // (Base maggiore + Base Minore * altezza) /2

    public static double computeArea(double bMag, double bMin, double altezza) {
        double area;
        area = ((bMag+bMin)*altezza)/2;
        return area;
    }
}
