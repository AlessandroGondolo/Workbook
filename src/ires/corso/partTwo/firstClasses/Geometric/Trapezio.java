package ires.corso.partTwo.firstClasses.Geometric;

public class Trapezio extends MasterShape {


    public double baseMag;
    public double baseMin;
    public double altezza;
    public double lato1;
    public double lato2;


    @Override
    public double computePerimeter() {
        return this.baseMag + this.baseMin + this.lato1 + this.lato2;
    }

    @Override
    public double computeArea() {
        return ((this.baseMag + this.baseMin) * this.altezza) / 2;
    }

    public Trapezio(double baseMag, double baseMin, double altezza, double lato1, double lato2) {
        this.baseMag = baseMag;
        this.baseMin = baseMin;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
    }



    public double getBaseMag() {
        return baseMag;
    }

    public void setBaseMag(double baseMag) {
        this.baseMag = baseMag;
    }

    public double getBaseMin() {
        return baseMin;
    }

    public void setBaseMin(double baseMin) {
        this.baseMin = baseMin;
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
