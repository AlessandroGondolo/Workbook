package ires.corso.partTwo.firstClasses.FightGame;

public class Vampiro implements Mostro {



    private int forza;

    public Vampiro() {
        forza = 15;
    }

    @Override
    public void azzanna() {
        forza = forza -2;
    }

    @Override
    public String getForza() {
        return "Forza rimanente al vampiroe è " + forza;
    }

}
