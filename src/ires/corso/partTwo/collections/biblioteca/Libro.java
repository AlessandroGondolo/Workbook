package ires.corso.partTwo.collections.biblioteca;

import java.util.Date;

public class Libro {

    //    - Libro (titolo, autore, data pubblicazione, num. pagine, num. volumi, num. capitoli)

    private  String titolo;
    private String autore;
    private  Date dataPubblicazione;
    private int numPag;
    private int numVolumi;
    private int numcapitoli;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Date getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(Date dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getNumVolumi() {
        return numVolumi;
    }

    public void setNumVolumi(int numVolumi) {
        this.numVolumi = numVolumi;
    }

    public int getNumcapitoli() {
        return numcapitoli;
    }

    public void setNumcapitoli(int numcapitoli) {
        this.numcapitoli = numcapitoli;
    }
}
