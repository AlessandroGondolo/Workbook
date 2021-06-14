package ires.corso.partTwo.firstClasses.Geometric;

public class Quadrato extends MasterShape {



    private double lato;

    @Override
    public double computeArea() {
        double area = this.lato * this.lato;
        System.out.println("L'area del quadrato è uguale a " + area);
        return area;
    }

    @Override
    public double computePerimeter() {
        double perimetro = this.lato * 4;
        System.out.println("Il perimetro del quadrato è uguale a " + perimetro);
        return perimetro;

    }

    // costruttore
    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }
}
