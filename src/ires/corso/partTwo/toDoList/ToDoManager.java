package ires.corso.partTwo.toDoList;

import java.time.LocalDate;
import java.util.Scanner;

// GRUPPO 2:
public class ToDoManager {

    public static void createNewToDo() {
        ToDo t = new ToDo();

        System.out.println("sto creando un todo");
        System.out.println("Inserisci le caratteristiche del ToDo");

        System.out.println("Titolo");
        t.setTitolo(inputScanner());

        System.out.println("Descrizione");
        t.setDescrizione(inputScanner());

        try {
            System.out.println("Data fine lavoro (yyyy-dd-mm)");
            t.setDataFine(inputScanner());
        } catch (Exception e) {
            System.out.println("La data non è stata inserita correttamente ritorno al menù precedente");
            return;
        }
        try {
            System.out.println("Priorità (ALTA,MEDIA,BASSA)");
            t.setPriorità(inputScanner());
        } catch (Exception e) {
            System.out.println("La priorità non è stata insterita correttamente ritorno al menù precedente");
            return;
        }
        try {
            System.out.println("Stato  ( DA_FARE,IN_ESECUZIONE,COMPLETATA,ANNULLATA)");
            t.setStato(inputScanner());
        } catch (Exception e) {
            System.out.println("Lo stato non è stato inserito correttamente ritorno al menù precedente");
            return;
        }

        System.out.println("Confermi di voler inserire il ToDo s/n");
        if (inputScanner().equals("s")) {
            System.out.println("aggiunge quello devi aggiungere");
            ToDoRepository._repository.add(t);
        }

    }

    public static void updateToDo() {
        // Chiede quale Id si vuole modificare
        // Si chiede un "clone" del TO-DO
        // Loop di richiesta dati da modificare
        // Salvataggio delle modifiche tramite ToDoRepository (update...)

        System.out.println("Inserisci l'id del ToDo da modificare");
        long id = Long.parseLong(inputScanner());
        if (!ToDoRepository.idContained(id)) {
            System.out.println("L'id inserito non è presente nella lista dei todo");
        }
        ToDo t = ToDoRepository.getToDoById(id);
        ToDo clone = t.cloneForUpdate();

        toDoUpdate(clone);
        System.out.println("Confermi le modifiche effettuate? s/n");
        if (inputScanner().toLowerCase().equals("s")) {
            ToDoRepository._repository.update(clone);
        }

    }

    public static void deleteTodo() {
        System.out.println("Inserisci l'Id del todo da eliminare: ");
        Long id = Long.parseLong(inputScanner());

        if (!ToDoRepository.idContained(id)) {
            System.out.println("L'id inserito non è presente nella lista dei todo");
        }

        ToDo t = ToDoRepository.getToDoById(id);
        System.out.println("Sei sicuro di voler eliminare il todo? s/n");
        if (inputScanner().toLowerCase().equals("s")) {
            ToDoRepository.delete(id);
            System.out.println("To do Eliminato");
        }

    }

    public static String inputScanner() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static void toDoUpdate(ToDo clone) {
        boolean b = true;

        while (b) {
            System.out.println("Cosa vuoi modificare del todo ");
            String s = inputScanner();
            switch (s) {
                case "Titolo": {
                    System.out.println("Inserisci il nuovo titolo");
                    clone.setTitolo(inputScanner());
                    break;
                }
                case "Descrizione": {
                    System.out.println("Inserisci la nuova descrizione");
                    clone.setDescrizione(inputScanner());
                    break;
                }
                case "Datafine": {
                    System.out.println("Inserisci la nuova data finale");
                    try {
                        clone.setDataFine(inputScanner());
                    } catch (Exception e) {
                        System.out.println("Non hai inserito una data ritorno al menù precedente");
                    }
                    break;
                }
                case "Priorità": {
                    System.out.println("Inserisci la nuova priorità");
                    try {
                        clone.setPriorità(inputScanner());
                    } catch (Exception e) {
                        System.out.println("Non hai inserito una priorità ritorno al menù precedente");
                    }
                    break;
                }
                case "Stato": {
                    System.out.println("Inserisci il nuovo stato");
                    try {
                        clone.setStato((inputScanner()));
                    } catch (Exception e) {
                        System.out.println("Non hai inserito uno stato ritorno al menù precedente");
                    }
                    break;
                }
            }
            System.out.println("Vuoi fare altre modifiche s/n");
            if (!(inputScanner().toLowerCase().equals("s"))) {
                b = false;
            }
        }

    }


}