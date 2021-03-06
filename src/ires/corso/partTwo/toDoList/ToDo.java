package ires.corso.partTwo.toDoList;

import java.io.Serializable;
import java.time.LocalDate;

import static ires.corso.partTwo.toDoList.ToDoRepository.getNewId;
import static sun.misc.VM.getState;

public class ToDo implements Serializable,Cloneable {
    private long id;
    private String titolo;
    private String descrizione;
    private LocalDate dataInserimento;
    protected LocalDate dataFine;
    protected Priorità priorità;
    protected Stato stato;

    public void setId(long id) {
        this.id = id;
    }

    public ToDo(long id, String titolo, String descrizione, LocalDate dataInserimento, LocalDate dataFine, Priorità priorità, Stato stato) {
        this.id = id;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.dataInserimento = dataInserimento;
        this.dataFine = dataFine;
        this.priorità = priorità;
        this.stato = stato;
    }

    public ToDo() {
        this.dataInserimento = LocalDate.now();
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

    public void setDataFine(String dataFine) {
        this.dataFine = LocalDate.parse(dataFine);
    }

    public Priorità getPriorità() {
        return priorità;
    }

    public void setPriorità(String priorità) {
        this.priorità = Priorità.valueOf(priorità);
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = Stato.valueOf(stato);
    }

    public LocalDate getDataInserimento() {
        return dataInserimento;
    }

// classe principale

    // ...costruttore con ID incrementale...

    public ToDo cloneForUpdate() {
        // fabbrica una copia esatta del To-Do (compreso l'ID)
        ToDo copia = new ToDo();
        try {
            copia.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copia;
    }

    public void setDataInserimento(LocalDate dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public String prettyPrint() {
        String s = String.format(" ID: %d \n TITOLO: %s \n DESCRIZIONE: %s \n CREATO IL: %s \n CON SCADENZA IL: %s \n CON PRIORITà: %s \n CON STATO: %s",
                getId(), getTitolo(), getDescrizione(), getDataInserimento(), getDataFine(), getPriorità().toString(), getStato().toString());
        return s;
    }


}