package ires.corso.partTwo.toDoList;

import java.time.LocalDate;
import java.util.Scanner;

// GRUPPO 2:
public class ToDoManager {
    // Classe responsabile per le operazioni sull'insieme dei TO-DO:
    // - metodi per creazione nuovo TO-DO
    // - metodi per la modifica, la rimozione
    // - gestisce input utente (cioè loop di richiesta di quali campi devono essere modificati)
    // - ha al suo interno funzioni di controllo sull'input utente

    public static void createNewToDo() {
        ToDo t = new ToDo();

        System.out.println("sto creando un todo");
        System.out.println("Inserisci le caratteristiche del ToDo");

        System.out.println("Titolo");
        t.setTitolo(inputScanner());

        System.out.println("Descrizione");
        t.setDescrizione(inputScanner());

        System.out.println("Data fine lavoro");
        t.setDataFine(inputScanner());

        System.out.println("Priorità");
        t.setPriorità(inputScanner());

        System.out.println("Stato ");
        t.setStato(inputScanner());

        t.setDataInserimento(LocalDate.now());
        System.out.println("Confermi di voler inserire il ToDo s/n");
        if (inputScanner().toLowerCase().equals('s')) {
            System.out.println("aggiunge quello devi aggiungere");
            ToDoRepository.add(t);
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
        if (inputScanner().toLowerCase().equals('s')) {
            ToDoRepository.update(clone);
        }

    }

    public static void deleteTodo() {
        System.out.println("Inserisci l'Id del todo da eliminare: ");
        Long id = Long.valueOf(inputScanner());

        if (!ToDoRepository.idContained(id)) {
            System.out.println("L'id inserito non è presente nella lista dei todo");
        }

        ToDo t = ToDoRepository.getToDoById(id);
        System.out.println("Sei sicuro di voler eliminare il todo? s/n");
        if (inputScanner().toLowerCase().equals('s')) {
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
            System.out.println("Cosa vuoi modificare del todo");
            String s = inputScanner();
            switch (s) {
                case "Titolo": {
                    System.out.println("Inserisci il nuovo titolo");
                    clone.setDescrizione(inputScanner());
                    break;
                }
                case "Descrizione": {
                    System.out.println("Inserisci la nuova descrizione");
                    clone.setDescrizione(inputScanner());
                    break;
                }
                case "Datafine": {
                    System.out.println("Inserisci la nuova data finale");
                    clone.setDataFine(inputScanner());
                    break;
                }
                case "Priorità": {
                    System.out.println("Inserisci la nuova priorità");
                    clone.setPriorità(inputScanner());
                }
                case "Stato": {
                    System.out.println("Inserisci il nuovo stato");
                    clone.setStato((inputScanner()));
                    break;
                }
            }
            System.out.println("Vuoi fare altre modifiche s/n");
            if (!(inputScanner().toLowerCase().equals('s'))) {
                b = false;
            }
        }

    }
}