package ires.corso.partTwo.collections.biblioteca;

import java.util.*;

public class testBiblio {

    public static void main(String[] args) {

        Libro l1 = new Libro("Harry Potter", "J. K. Rowling", "1997", "Bloomsbury", 2000, 7, 20);
        Libro l2 = new Libro("Il Signore Degli Anelli", " J. R. R. Tolkien", "1955", "Bloomsbury 2", 1432, 3, 30);
        Libro l3 = new Libro("Hunger Games", "Suzanne Collins", "2009", "Mondadori", 1200, 4, 40);
        Libro l4 = new Libro("Shogun", "James Clavell", "1950", "Bompiani", 300, 1, 12);
        Libro l5 = new Libro("Cress", "Marissa Mayer", "1989", "Feltrinelli", 250, 1, 10);
        Libro l6 = new Libro("Il Decameron", "Boccaccio", "1500", "Mondadori", 1000, 1, 10);
        Libro l7 = new Libro("20.000 Leghe Sotto I Mari", "Jules Verne", "1957", "Einaudi", 99, 2, 50);
        Libro l8 = new Libro("Assassinio Sull'Orient Express", "Aghata Christie", "1935", "Newton", 469, 6, 60);


        Categoria c1 = new Categoria("Fantasy", "Libro Fantasy");
        Categoria c2 = new Categoria("Giallo", "Libro Giallo");
        Categoria c3 = new Categoria("Classici", "Romanzo Classico");
        Categoria c4 = new Categoria("Avventura", "Romanzo di avventura");
        Categoria c5 = new Categoria("Poesia", "Racconti");


        Utente u1 = new Utente("Alessandro", "Gondolo", "2");
        Utente u2 = new Utente("Federico", "Chiesa", "234");
        Utente u3 = new Utente("Matteo", "Pessina", "45");

        //do le categorie a ogni libro

        ArrayList<Categoria> l1Cat = new ArrayList<>(Arrays.asList(c1,c4));
        ArrayList<Categoria> l2Cat = new ArrayList<>(Arrays.asList(c2,c4));
        ArrayList<Categoria> l3Cat = new ArrayList<>(Arrays.asList(c1));
        ArrayList<Categoria> l4Cat = new ArrayList<>(Arrays.asList(c3,c4));
        ArrayList<Categoria> l5Cat = new ArrayList<>(Arrays.asList(c3,c4));
        ArrayList<Categoria> l6Cat = new ArrayList<>(Arrays.asList(c1,c3));
        ArrayList<Categoria> l7Cat = new ArrayList<>(Arrays.asList(c1));
        ArrayList<Categoria> l8Cat = new ArrayList<>(Arrays.asList(c1,c5));

        HashMap<Libro,ArrayList<Categoria>> libroCategoria = new HashMap<>();

        // assegno le rispettive categorie ai libri
        libroCategoria.put (l1,l1Cat);
        libroCategoria.put (l2,l2Cat);
        libroCategoria.put (l3,l3Cat);
        libroCategoria.put (l4,l4Cat);
        libroCategoria.put (l5,l5Cat);
        libroCategoria.put (l6,l6Cat);
        libroCategoria.put (l7,l7Cat);
        libroCategoria.put (l8,l8Cat);
        //qui posso facilmente verificare le categorie dei vari libri

        //creo la lista dei prestiti che andrò a mappare con l'utente creato in precedenza

        ArrayList<Libro> u1Prestito = new ArrayList<Libro>(Arrays.asList(l2,l3,l4));
        ArrayList<Libro> u2Prestito = new ArrayList<Libro>(Arrays.asList(l5,l1,l7));
        ArrayList<Libro> u3Prestito = new ArrayList<Libro>(Arrays.asList(l6,l8));

        HashMap<Utente,ArrayList<Libro>> listaPrestiti = new HashMap<>();
        listaPrestiti.put(u1,u1Prestito);
        listaPrestiti.put(u2,u2Prestito);
        listaPrestiti.put(u3,u3Prestito);
        //qui posso facilmente verificare la lista dei prestiti di ogni utente
        //assegno un valore integer alle varie categorie per verificare quanti prestiti sono stati effettuati



        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        HashMap<Categoria,Integer> categorieCont  = new HashMap<>();
        categorieCont.put(c1,count1);
        categorieCont.put(c2,count2);
        categorieCont.put(c3,count3);
        categorieCont.put(c4,count4);
        categorieCont.put(c5,count5);

        for(Map.Entry<Utente,ArrayList<Libro>> utenteLibro : listaPrestiti.entrySet()) {
            for (Libro b : utenteLibro.getValue()) {
                for (Categoria cat : libroCategoria.get(b)) {
                    Integer conProvv = categorieCont.get(cat);
                    conProvv++;
                    categorieCont.replace (cat,conProvv);
                }
            }
        }
        //stampo i valori richiesti

        for (Map.Entry<Categoria,Integer> prestiti : categorieCont.entrySet()) {
            System.out.printf("Categoria %s: %d\n", prestiti.getKey().getTitolo(), prestiti.getValue());
        }
    }


    }





