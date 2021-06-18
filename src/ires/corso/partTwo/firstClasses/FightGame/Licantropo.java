package ires.corso.partTwo.firstClasses.FightGame;

public class Licantropo implements Mostro,Umano{
    private boolean isUomo;
    private int forzaUomo, forzaMostro;

    public Licantropo (boolean luna) {
         isUomo = !luna;

         if (luna) {
            forzaMostro = 15;
        } else {
             forzaUomo = 10;
         }
    }
    @Override
    public void azzanna() {
        if (!isUomo) {
            forzaMostro = forzaMostro - 2;
        }
    }

    @Override
    public String getForza() {
        return "Forza rimanente come umano " + forzaUomo +
                " Forza rimanente come mostro " +forzaMostro;
    }

    @Override
    public void combatti() {
        if (isUomo)
        forzaUomo = forzaUomo -3;
    }
}
