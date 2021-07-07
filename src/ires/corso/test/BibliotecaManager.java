package ires.corso.test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BibliotecaManager {

    /*
        Visualizza i Libri
        Aggiungi un Libro


     */
    static Comparator<Libro> compareByTitolo = (Libro t1, Libro t2) -> t1.getTitolo().compareTo(t2.getTitolo());

    public static void visualizzaLibri() {
        //ordina i libri per titolo e ritorna la lista dei libri
        ArrayList<Libro> libriOrdinati = Biblioteca.getBiblioteca().getListaLibri();
        Collections.sort(libriOrdinati, compareByTitolo);
        printListaLibri(libriOrdinati);
    }

    public static void addLibro() {
        Libro l = new Libro();

        System.out.println("Inserisci le caratteristiche del libro che devi aggiungere");
        System.out.println("Titolo:");
        l.setTitolo(Menu.askForInput());

        System.out.println("Autore:");
        l.setAutore(Menu.askForInput());

        System.out.println("Sinossi:");
        l.setSinossi(Menu.askForInput());

        System.out.println("CodiceIsbn:");
        l.setCodiceISBN(Menu.askForInput());

        System.out.println("DataPubblicazione:");
        try {
            l.setDataDiPubblicazione(LocalDate.parse(Menu.askForInput()));
        } catch (Exception e) {
            System.out.println("INPUT INSERITO NON CORRETTO TORNO AL MENU PRECEDENTE ");
            return;
        }
        System.out.println("Genere:");
        try {
            l.setGenere(Genere.valueOf(Menu.askForInput()));
        } catch (Exception e) {
            System.out.println("Input INSERITO NON CORRETTO TORNO AL MENU PRECEDENTE");
            return;
        }

        System.out.println("Confermi di voler inserire il libro s/n");
        if (Menu.askForInput().toLowerCase().equals("s")) {
            Biblioteca._biblioteca.add(l);
        }

    }

    public static void updateLibro() {
        // verifica che sia presente un libro, chiedi cosa modificare e modifica il libro
        System.out.println("Inserisci l'id del libro da modificare");
        long id = Long.parseLong(Menu.askForInput());
        if (!Biblioteca._biblioteca.isContained(id)) {
            System.out.println("L'id del libro non è contenuto");
        }
        Libro l = Biblioteca.getLibroById(id);
        Libro clone = l.cloneForUpdate();
        clone = updateClone(clone);
        System.out.println("Confermi le modifiche effettuate? s/n");
        if (Menu.askForInput().toLowerCase().equals("s")) {
            Biblioteca._biblioteca.update(clone);
        }
    }

    private static Libro updateClone(Libro clone) {

        boolean b = true;
        System.out.println("Cosa vuoi modificare del libro ");
        System.out.println("a) Titolo,b) Autore,c) Sinossi,d) Codice ISBN,e) Data Pubblicazione ,f) Genere");
        while (b) {

            String s = Menu.askForInput();
            switch (s) {
                case "a": {
                    System.out.println("Inserisci il nuovo titolo");
                    clone.setTitolo(Menu.askForInput());
                    break;
                }
                case "b": {
                    System.out.println("Inserisci il nuovo autore");
                    clone.setAutore(Menu.askForInput());
                    break;
                }
                case "c": {
                    System.out.println("Inserisci la nuova sinossi");

                    clone.setSinossi(Menu.askForInput());

                    break;
                }
                case "d": {
                    System.out.println("Inserisci il nuovo codice ISBN");
                    clone.setSinossi(Menu.askForInput());

                    break;
                }
                case "e": {
                    System.out.println("Inserisci la nuova data di pubblicazione");
                    clone.setDataDiPubblicazione(LocalDate.parse(Menu.askForInput()));
                    break;
                }
                case "f": {
                    System.out.println("Inserisci il nuovo genere ");
                    clone.setGenere(Genere.valueOf(Menu.askForInput()));
                    break;
                }

            }
            System.out.println("Vuoi fare altre modifiche s/n");
            if (!(Menu.askForInput().toLowerCase().equals("s"))) {
                b = false;
            }
        }
        return clone;
    }

    public static void deleteLibro() {
        // verifica che sia presente l'id del libro e cancellalo dalla lista
        System.out.println("Inserisci l'id del libro da cancellare");
        Long id = Long.parseLong(Menu.askForInput());

        if (!Biblioteca.getBiblioteca().isContained(id)) {
            System.out.println("L'id inserito non è presente nella lista");
        }
        Libro l = Biblioteca.getLibroById(id);
        System.out.println("Sei sicuro di voler eliminare il libro:");
        System.out.println(l.prettyPrint());
        if (Menu.askForInput().toLowerCase().equals("s")) {
            Biblioteca.delete(id);
            System.out.println("Libro eliminato");
        }
    }

    public static void AvanzamentoLettura() {
        // dai l'id del libro a cui vuoi e lo imposti, se è uguale a 100 non si può più modificare
        System.out.println("Inserisci l'id del libro a cui vuoi modifica l'avanzamento della lettura");
        Long id = Long.valueOf(Menu.askForInput());
        Libro l = Biblioteca.getLibroById(id);
        if (!(l.getAvanzamentoLettura() == 100)) {
            System.out.println("Inserisci l'avanzamento lettura : ");
            l.setAvanzamentoLettura(Integer.valueOf(Menu.askForInput()));
            Biblioteca.update(l);
        } else {
            System.out.println("Non si può modificare la percentuale di letture perchè hai già finito il libro");
        }

    }

    public static void GiudizioPersonale() {
        System.out.println("Inserisci l'id del libro a cui modificare il giudizio personale");
        Long id = Long.valueOf(Menu.askForInput());
        Libro l = Biblioteca.getLibroById(id);
        if (l.getAvanzamentoLettura() == 100) {
            System.out.println("Inserisci il giudizio sul libro letto: ");
            l.setGiudizio(Giudizio.valueOf(Menu.askForInput()));
            Biblioteca.update(l);
        } else {
            System.out.println("Non hai ancora finito il libro non puoi valutarlo");
        }
        //dai l'id del libro a cui vuoi dare un giudizio, si può chiamare solo se avanzamento lettura è uguale a 100
    }


    public static void printListaLibri(ArrayList<Libro> libri) {
        for (Libro l : libri) {
            System.out.println(l.prettyPrint());
        }
    }

}
