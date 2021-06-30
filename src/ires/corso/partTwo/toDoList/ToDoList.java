package ires.corso.partTwo.toDoList;

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
        System.out.printf("La lista ordinata per priorità:");
    }
    public static void viewByDate() {
        System.out.printf("La lista ordinata per data");
    }
    public static void viewByState() {
        System.out.printf("La lista ordinata per stato");
    }

    public static void orderedToDoListByPriority() {

        List<ToDo> sortedList = ToDoRepository.getToDoList();

    }
}