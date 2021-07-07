package ires.corso.partTwo.toDoList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// GRUPPO 1:
public class ToDoList {
    // Implementa le funzionalità di visualizzazione con:
    // - ordinamento per priorità
    // - ordinamento per data
    // - ordinamento per stato
    // Si appoggia a un metodo di ToDoRepository per avere una lista (= copia dei TO-DO
    // originali) dei TO-DO attualmente a sistema, cioè un ArrayList facilmente utilizzabile

    ;


    static Comparator<ToDo> compareByStato = (ToDo t1, ToDo t2) -> t1.getStato().compareTo(t2.getStato());

    static Comparator<ToDo> compareByDate = (ToDo t1, ToDo t2) -> t1.getDataFine().compareTo(t2.getDataFine());

    static Comparator<ToDo> compareByPriority = (ToDo t1, ToDo t2) -> t1.getPriorità().compareTo(t2.getPriorità());

    public static void viewByPriority() {
        // Questa funzione è chiamata qunado l'utente sceglie di visualizzare i dati per priorità...        ;
        List<ToDo> listaDaOrdinare = ToDoRepository.getToDoRepository().getToDoList();
        Collections.sort(listaDaOrdinare, compareByPriority);
        printCOllection(listaDaOrdinare);
    }

    public static void viewByDate() {
        List<ToDo> listaDaOrdinare = ToDoRepository.getToDoRepository().getToDoList();
        Collections.sort(listaDaOrdinare, compareByDate);
        printCOllection(listaDaOrdinare);
    }

    public static void viewByState() {
        List<ToDo> listaDaOrdinare = ToDoRepository.getToDoRepository().getToDoList();
        Collections.sort(listaDaOrdinare, compareByStato);
        printCOllection(listaDaOrdinare);
    }

    public static void printCOllection(List<ToDo> l) {
        for (ToDo t : l) {
            System.out.println(t.prettyPrint());
        }
    }
}


