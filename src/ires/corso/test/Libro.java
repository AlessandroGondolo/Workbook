package ires.corso.test;

import java.io.Serializable;
import java.time.LocalDate;

import static ires.corso.test.Giudizio.GIUDIZIO_NON_DATO;

public class Libro implements Serializable, Cloneable {

    private Long id;
    private String titolo;
    private String autore;
    private String sinossi;
    private String codiceISBN;
    private LocalDate dataDiPubblicazione;
    private Genere genere;
    private Giudizio giudizio = GIUDIZIO_NON_DATO;
    private Integer avanzamentoLettura = 0;

    public Libro() {

    }

    public Libro(String titolo, String autore, String sinossi, String codiceISBN, LocalDate dataDiPubblicazione, Genere genere) {
        this.titolo = titolo;
        this.autore = autore;
        this.sinossi = sinossi;
        this.codiceISBN = codiceISBN;
        this.dataDiPubblicazione = dataDiPubblicazione;
        this.genere = genere;
    }

    public Libro(Long id, String titolo, String autore, String sinossi, String codiceISBN, LocalDate dataDiPubblicazione, Genere genere, Giudizio giudizio, Integer avanzamentoLettura) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.sinossi = sinossi;
        this.codiceISBN = codiceISBN;
        this.dataDiPubblicazione = dataDiPubblicazione;
        this.genere = genere;
        this.giudizio = giudizio;
        this.avanzamentoLettura = avanzamentoLettura;
    }

    public String getTitolo() {
        return titolo;
    }

    public Long getId() {
        return id;
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

    public String getSinossi() {
        return sinossi;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSinossi(String sinossi) {
        this.sinossi = sinossi;
    }

    public String getCodiceISBN() {
        return codiceISBN;
    }

    public void setCodiceISBN(String codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public LocalDate getDataDiPubblicazione() {
        return dataDiPubblicazione;
    }

    public void setDataDiPubblicazione(LocalDate dataDiPubblicazione) {
        this.dataDiPubblicazione = dataDiPubblicazione;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Giudizio getGiudizio() {

        return giudizio;
    }

    public void setGiudizio(Giudizio giudizio) {
        this.giudizio = giudizio;
    }

    public Integer getAvanzamentoLettura() {
        return avanzamentoLettura;
    }

    public void setAvanzamentoLettura(Integer avanzamentoLettura) {
        this.avanzamentoLettura = avanzamentoLettura;
    }

    public Libro cloneForUpdate() {
        Libro l = new Libro();
        l.id = id;
        l.titolo = titolo;
        l.autore = autore;
        l.sinossi = sinossi;
        l.codiceISBN = codiceISBN;
        l.dataDiPubblicazione = dataDiPubblicazione;
        l.genere = genere;
        l.giudizio = giudizio;
        l.avanzamentoLettura = avanzamentoLettura;
        return l;
    }

    public String prettyPrint() {
        String s = String.format(" ID: %d \n TITOLO: %s \n Autore: %s \n Sinossi: %s \n Codice ISBN: %s \n Data Pubblicazione: %s \n Genere: %s \n Giudizio personale:%s \n Avanzamento nelle lettura :%d",
                getId(), getTitolo(), getAutore(), getSinossi(), getCodiceISBN(), getDataDiPubblicazione().toString(), getGenere().toString(), getGiudizio().toString(), getAvanzamentoLettura());
        return s;
    }
}
