package ires.corso.partTwo.firstClasses.FightGame;

public class Prova {

    public static void main(String[] args) {
        Eroe hero = new Eroe();
        Licantropo warwick = new Licantropo(true);
        Vampiro vampire = new Vampiro();

        for (int i = 0; i < 3; i++) {
            hero.combatti();
        }
        vampire.azzanna();
        warwick.combatti();
        warwick.azzanna();

        System.out.println(hero.getForza());
        System.out.println(vampire.getForza());
        System.out.println(warwick.getForza());


    }
}
