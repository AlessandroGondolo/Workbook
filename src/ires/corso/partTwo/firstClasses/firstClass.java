package ires.corso.partTwo.firstClasses;
import ires.corso.partTwo.firstClasses.Class.Automobile;
import ires.corso.partTwo.firstClasses.Class.Bottiglia;

public class firstClass {

    public static void main(String[] args) {

        Automobile auto = new Automobile("Alfa","Giulia",1600,false, Automobile.Motore.BENZINA);
        Bottiglia borraccia = new Bottiglia("Vetro",750,true);

        auto.prettyPrint();
        borraccia.prettyPrint();

    }


}
