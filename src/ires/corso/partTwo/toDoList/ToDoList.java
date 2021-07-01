package ires.corso.partTwo.toDoList;

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

    public static void viewByPriority() {
        // Questa funzione è chiamata qunado l'utente sceglie di visualizzare i dati per priorità...
        ToDoRepository tdr = ToDoRepository.getToDoRepository();
        Collections.sort(ToDoRepository.getToDoList(), new SortByPriority());
        System.out.println("Lista ordinata");
    }

    public static void viewByDate() {
        System.out.printf("La lista ordinata per data");
        Collections.sort(ToDoRepository.getToDoList(), new SortByDate());
        System.out.println("Lista ordinata");
    }

    public static void viewByState() {
        System.out.printf("La lista ordinata per stato");
        Collections.sort(ToDoRepository.getToDoList(), new SortByState());
        System.out.println("Lista ordinata");
    }

}

class SortByPriority implements Comparator<ToDo> {
    @Override
    public int compare(ToDo o1, ToDo o2) {
        return o1.getPriorità().compareTo(o2.getPriorità());
    }
}

class SortByDate implements Comparator<ToDo> {
    @Override
    public int compare(ToDo o1, ToDo o2) {
        return o1.getDataFine().compareTo(o2.getDataFine());
    }
}

class SortByState implements Comparator<ToDo> {
    @Override
    public int compare(ToDo o1, ToDo o2) {
        return o1.getStato().compareTo(o2.getStato());
    }
}
