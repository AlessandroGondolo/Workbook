package ires.corso.partTwo.firstClasses.FightGame;

public class Eroe implements Umano{

    private int forza;

    public Eroe () {
        forza = 10;
    }
    @Override
    public String getForza() {
        return "La forza rimanente dell'eroe è uguale a " + forza;
    }

    @Override
    public void combatti() {
        forza = forza - 3 ;
    }
}
