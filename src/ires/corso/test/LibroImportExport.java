package ires.corso.test;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static ires.corso.test.Giudizio.GIUDIZIO_NON_DATO;

public class LibroImportExport {
    public static void exportToFile() throws Exception {
        // Chiuede all'utente un nome file di export...
        String fileName = "Prova.txt";
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(fileName))) {
            List<Libro> libroList = Biblioteca.getRepo().getListaLibri();
            Iterator<Libro> libri = libroList.iterator();

            while (libri.hasNext()) {
                String sLibro = convertToString(libri.next());
                outputStream.println(sLibro);
            }
        }
    }

    private static String convertToString(Libro libro) {
        String s = libro.getId() + ";" + libro.getTitolo() + ";" + libro.getAutore() + ";" + libro.getSinossi() + ";" + libro.getCodiceISBN() +
                ";" + libro.getDataDiPubblicazione() + ";" + libro.getGenere() + ";" + libro.getGiudizio() + ";" + libro.getAvanzamentoLettura();
        return s;
    }


    public static void importToFile() throws IOException {
        // Chiede all'utente un nome file di import...
        String fileName = "Prova.txt";
        ArrayList<String> fileLines = new ArrayList<>();
        int libriImported = 0;
        try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName))) {
            String l;
            while ((l = inputStream.readLine()) != null) {
                fileLines.add(l);
            }
            for (String s : fileLines) {
                String[] splitter = s.split(";");
                Libro lib = LibroConvert(splitter);
                Biblioteca.getBiblioteca().add(lib);
                libriImported++;
            }
        }
        System.out.println("Ho importato " + libriImported + "libri");
    }

    private static Libro LibroConvert(String[] splitter) {
        Long id = null;
        String titolo = null;
        String autore = null;
        String sinossi = null;
        String codiceISBN = null;
        LocalDate dataDiPubblicazione = null;
        Genere genere = null;
        Giudizio giudizio = null;
        Integer avanzamentoLettura = null;
        Libro libro = null;
        boolean errore = false;
        if (splitter[0] != null) id = Long.valueOf(splitter[0]);
        else {
            System.out.println("L'id era nullo ");
            errore = true;
        }

        if (splitter[1] != null) titolo = (splitter[1]);
        else {
            System.out.println("Il titolo era nullo ");
            errore = true;
        }

        if (splitter[2] != null) autore = (splitter[2]);
        else {
            System.out.println("L'id era nulla ");
            errore = true;
        }

        if (splitter[3] != null) sinossi = (splitter[3]);
        else {
            System.out.println("L'id era nulla ");
            errore = true;
        }

        if (splitter[4] != null) codiceISBN = (splitter[4]);
        else {
            System.out.println("L'id era nulla ");
        }

        if (splitter[5] != null) dataDiPubblicazione = LocalDate.parse((splitter[5]));
        else {
            System.out.println("L'id era nulla ");
            errore = true;
        }

        if (splitter[6] != null) genere = Genere.valueOf((splitter[6]));
        else {
            System.out.println("L'id era nulla ");
            errore = true;
        }
        if (splitter[7] != null) giudizio = Giudizio.valueOf(splitter[7]);
        {
            System.out.println("Il giudizio era nullo");
            errore = true;
        }
        if (splitter[8] != null) avanzamentoLettura = Integer.valueOf((splitter[8]));

        if (!errore) {
            libro = new Libro(id, titolo, autore, sinossi, codiceISBN, dataDiPubblicazione, genere, giudizio, avanzamentoLettura);

        }
        return libro;
    }
}
