package ires.corso.partTwo.toDoList;

import java.io.Serializable;
import java.time.LocalDate;

public class ToDo implements Serializable
{
    protected long id;
    protected String titolo;
    protected String descrizione;
    protected LocalDate dataInserimento;
    protected LocalDate dataFine;
    protected Priorità priorità;
    protected Stato stato;

    public ToDo(String titolo, String descrizione, LocalDate dataFine, Priorità priorità, Stato stato) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.dataInserimento = java.time.LocalDate.now();
        this.dataFine = dataFine;
        this.priorità = priorità;
        this.stato = stato;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }

    public Priorità getPriorità() {
        return priorità;
    }

    public void setPriorità(Priorità priorità) {
        this.priorità = priorità;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }


// classe principale

    // ...costruttore con ID incrementale...

    public ToDo cloneForUpdate() {
        // fabbrica una copia esatta del To-Do (compreso l'ID)
        return null;
    }
}