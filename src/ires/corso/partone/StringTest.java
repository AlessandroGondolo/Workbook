package ires.corso.partone;

public class StringTest {

    //Scrivere un programma che accetta in input 3 stringhe da riga di comando.
    //Verifica che siano effettivamente 3
    //Calcola la lunghezza delle 3 stringhe
    //Trova il carattere finale iniziale e finale di ogni stringa
    //Per tutte le stringhe scrive un report : "La Stringa " "  ha lunghezza " " inizia per " " e finisce per " "

    public static void main(String[] args) {

        if (args.length == 3) {

            for (int i = 0; i < 3; i++) {

                String word = (args[i]);
                int l = word.length();
                char first = word.charAt(0);
                char last = word.charAt(l - 1);

                String report = String.format("La Stringa %S ha lunghezza %d e inzia per %c e finisce per %c", word, l, first, last);
                System.out.println(report);
            }

        } else
            System.out.println("Il numero di stringhe è inferiore a 3");


    }
}
