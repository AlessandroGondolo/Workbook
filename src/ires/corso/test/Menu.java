package ires.corso.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.util.Scanner;

//non sono riuscito a sistemarlo graficamente, dovrebbe essere tutto funzionante tranne un problema sull'id incrementale
public class Menu {

    public static void main(String[] args) throws Exception {
        final String fileIniziale = "repo.ser";
        Biblioteca.init(fileIniziale);
        Biblioteca repo = Biblioteca.getRepo();
        biblioApp();
        repo.writeToFile(fileIniziale);
    }

    public static void biblioApp() throws Exception {
        boolean b = true;

        while (b) {
            System.out.println("Benvenuto nell'applicazione che implementa una biblioteca");
            System.out.println("Che operazione vuoi effettuare?");
            System.out.println("a) Visualizzazione volumi esistenti, b)Aggiunta Volume, c)Modifica di un volume, d) Eliminazione di un volume, e)Avanzamento lettura, f)Giudizio personale, g) Import/export, h) Uscita dal programma");
            String s = askForInput();
            switch (s) {
                case "a": {
                    BibliotecaManager.visualizzaLibri();
                    break;
                }
                case "b": {
                    BibliotecaManager.addLibro();
                    break;
                }
                case "c": {
                    BibliotecaManager.updateLibro();
                    break;
                }
                case "d": {
                    BibliotecaManager.deleteLibro();
                    break;
                }
                case "e": {
                    BibliotecaManager.AvanzamentoLettura();
                    break;
                }
                case "f": {
                    BibliotecaManager.GiudizioPersonale();
                    break;
                }
                case "g": {
                    importexportMenu();
                }
                case "h": {
                    System.out.println("Sei sicuro di voler uscire dal programma? s/n");
                    String conferma = askForInput();
                    if (conferma.equals("s")) {
                        b = false;
                        System.out.println("Uscita");
                        break;
                    }
                    break;
                }
                default:
                    System.out.println("Hai scritto qualcosa di sbagliato riprova");
            }


        }

    }

    private static void importexportMenu() throws Exception {

        boolean b = true;
        while (b) {
            System.out.println("Menu ImportExport");
            System.out.println("a)Importare lista libri da file, b)Salvare lista libri su file, c) Menu precedente )");
            String s = askForInput();
            switch (s) {
                case "a": {
                    LibroImportExport.importToFile();
                    break;
                }
                case "b": {
                    LibroImportExport.exportToFile();
                    break;
                }
                case "c": {
                    System.out.println("Menù precedente");
                    b = false;
                    break;
                }
            }
        }

    }

    public static String askForInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
}
