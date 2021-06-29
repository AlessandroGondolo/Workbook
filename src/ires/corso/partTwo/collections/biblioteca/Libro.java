package ires.corso.partTwo.collections.biblioteca;

public class Libro {

    //    - Libro (titolo, autore, data pubblicazione, num. pagine, num. volumi, num. capitoli)

    private final String titolo;
    private final String autore;
    private final String pubblicazione;
    private final String data;
    private final int numPag;
    private final int numVolumi;
    private final int numcapitoli;

    public Libro(String titolo, String autore, String data, String pubblicazione, int numPag, int numVolumi, int numcapitoli) {
        this.titolo = titolo;
        this.autore = autore;
        this.data = data;
        this.pubblicazione = pubblicazione;
        this.numPag = numPag;
        this.numVolumi = numVolumi;
        this.numcapitoli = numcapitoli;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getPubblicazione() {
        return pubblicazione;
    }

    public int getNumPag() {
        return numPag;
    }

    public int getNumVolumi() {
        return numVolumi;
    }

    public int getNumcapitoli() {
        return numcapitoli;
    }
}
