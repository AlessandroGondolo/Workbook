package ires.corso.partTwo.toDoList;

import java.time.LocalDate;
import java.util.Scanner;

// GRUPPO 3/4:
public class ToDoApplication {
    // 1. Deserializza il repository da file (carica i dati dell'ultimo salvataggio)
    //    creando una classe Repository
    // 2. Gestione del MENU principale con un loop e due switch
    // 3. In corrispondenza di una scelta dell'utente (ramo dello switch) chiama
    //    le classi necessarie per svolgere l'azione
    // 4. Chiede conferma e serializza in uscita
    // 5. Fornisce anche i metodi della classe "lettore" di quiz... askForInput , display
    public static void main(String[] args) {
         appMenu();

    }

    public static void appMenu() {
        Scanner sc = new Scanner(System.in);
        boolean b = true;

        while (b) {
            System.out.println("BENVENUTO NELL'APP PER CREARE O MODIFICARE UNA TODO LIST");
            System.out.println("CHE OPERAZIONE VUOI FARE? ");
            System.out.println("01. Visualizza, 02. Aggiungi, Rimuovi, Modifica, 03. Import/Export, 04 Uscita dal Programma");

            String s = sc.nextLine();
            switch (s) {
                case "01": {
                    System.out.println("Menù visualizza");
                    visualizzaTOdo();
                    break;
                }
                case "02": {
                    System.out.println("Menù Modifica");
                    updateToDoMenu();
                    break;
                }
                case "03": {
                    System.out.println("Menù Import/Export");
                    importExport();
                    break;
                }
                case "04": {
                    System.out.println("Uscita");
                    b = false;
                    break;
                }
            }

        }

    }

    public static void visualizzaTOdo() {
        Scanner sc = new Scanner(System.in);


        boolean b = true;
        while (b) {
            System.out.println("Per cosa vuoi ordinare la todo List?");
            System.out.println("01. Per priorità, 02. Per data , 03. Per stato, 04 Menù prcedente");
            String s = sc.nextLine();
            switch (s) {
                case "01": {
                    ToDoList.viewByPriority();
                    System.out.println("todo ordinato per priorià");
                    break;
                }
                case "02": {
                    System.out.println("todo ordinato per data");
                    ToDoList.viewByDate();
                    break;
                }
                case "03": {
                    System.out.println("todo list ordinata per stato");
                    ToDoList.viewByState();
                    break;
                }
                case "04": {
                    System.out.println("Menù Precedente");
                    b = false;
                    break;
                }
            }
        }
    }

    public static void updateToDoMenu() {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("Che operazione vuoi fare?");
            System.out.println("01. Aggiungi, 02. Modifica , 03. Rimuovi, 04 per il Menù prcedente");
            String s = sc.nextLine();
            switch (s) {
                case "01": {
                    System.out.println("Sto aggiungendo un todo");
                    ToDoManager.createNewToDo();
                    break;
                }
                case "02": {
                    System.out.println("Sto modificando un todo");
                    ToDoManager.updateToDo();
                    break;
                }
                case "03": {
                    System.out.println("Sto cancellando un todo");
                    ToDoManager.deleteTodo();
                    break;
                }
                case "04": {
                    System.out.println("Menù Precedente");
                    b = false;
                    break;
                }
            }
        }
    }


    public static void importExport() {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("Che operazioen vuoi fare sulla todo list?");
            System.out.println("Import (se vuoi importare una nuova todolist), Export(se vuoi salvare la lista) ");
            String s = sc.nextLine();
            switch (s) {
                case "01": {
                    System.out.println("todo ordinato per priorià");
                    break;
                }
                case "02": {
                    System.out.println("todo ordinato per data");
                    break;
                }
                case "03": {
                    System.out.println("Menù precedente ");
                    b = false;
                }

            }

        }
    }
}
