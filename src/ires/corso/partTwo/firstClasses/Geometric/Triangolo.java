package ires.corso.partTwo.firstClasses.Geometric;

public class Triangolo extends MasterShape {

    public double base;
    public double altezza;
    public double lato1;
    public double lato2;


    @Override
    public double computeArea() {
        double area = (this.base* this.altezza)/2;
        System.out.println("L'area  del trapezio è uguale a " + area);
        return area;
    }

    @Override
    public double computePerimeter() {
        double perimetro =(this.base + this.lato1 + this.lato2);
        System.out.println("Il perimetro del triangolo è uguale a " + perimetro);
        return perimetro;
    }


    public Triangolo(double base, double altezza, double lato1, double lato2) {
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

}
