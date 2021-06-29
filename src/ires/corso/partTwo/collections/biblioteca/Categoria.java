package ires.corso.partTwo.collections.biblioteca;

public class Categoria {
    //    - Categoria (titolo, descrizione)

    private final String titolo;
    private final String descrizione;


    public Categoria(String titolo, String descrizione) {
        this.titolo = titolo;
        this.descrizione = descrizione;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
