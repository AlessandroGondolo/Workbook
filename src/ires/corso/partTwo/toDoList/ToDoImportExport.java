package ires.corso.partTwo.toDoList;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// GRUPPO 3:
public class ToDoImportExport {

    public static void exportToFile() throws Exception {
        // Chiuede all'utente un nome file di export...
        String fileName = "Prova.txt";
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(fileName))) {
            List<ToDo> toDoList = ToDoRepository.getRepo().getToDoList();
            Iterator<ToDo> tdi = toDoList.iterator();

            while (tdi.hasNext()) {
                String sToDo = convertToString(tdi.next());
                outputStream.println(sToDo);
            }
        }
    }
    private static String convertToString(ToDo t) {
        String s = t.getId() + ";" + t.getTitolo() + ";" + t.getDescrizione() + ";" + t.getDataInserimento() + ";" + t.getDataFine() + ";" + t.getPriorità() + ";" + t.getStato();
        return s;
    }


    public static void importToFile() throws IOException {
        // Chiede all'utente un nome file di import...
        String fileName = "Prova.txt";
        ArrayList<String> fileLines = new ArrayList<>();
        int toDoImported = 0;
        try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName))) {
            String l;
            while ((l = inputStream.readLine()) != null) {
                fileLines.add(l);
            }
            for (String s : fileLines) {
                String[] splitter = s.split(";");
                ToDo t = toDoConvert(splitter);
                ToDoRepository.getToDoRepository().add(t);
                toDoImported++;
            }
        }
    }

    private static ToDo toDoConvert(String[] splitter) {
        Long id = null;
        String titolo = null;
        String descrizione = null;
        LocalDate dataCreazione = null;
        LocalDate dataFine = null;
        Priorità priorità = null;
        Stato stato = null;
        ToDo td = null;
        boolean errore = true;
        if (splitter[0] != null) id = Long.valueOf(splitter[0]);
        else {
            System.out.println("L'id era nullo ");
            errore = false;
        }

        if (splitter[1] != null) titolo = (splitter[1]);
        else {
            System.out.println("Il titolo era nullo ");
            errore = false;
        }

        if (splitter[2] != null) descrizione = (splitter[2]);
        else {
            System.out.println("L'id era nulla ");
            errore = false;
        }

        if (splitter[3] != null) dataCreazione = LocalDate.parse((splitter[3]));
        else {
            System.out.println("L'id era nulla ");
            errore = false;
        }

        if (splitter[4] != null) dataFine = LocalDate.parse((splitter[4]));
        else {
            System.out.println("L'id era nulla ");
        }

        if (splitter[5] != null) priorità = Priorità.valueOf((splitter[5]));
        else {
            System.out.println("L'id era nulla ");
            errore = false;
        }

        if (splitter[6] != null) stato = Stato.valueOf((splitter[6]));
        else {
            System.out.println("L'id era nulla ");
            errore = false;
        }
        if (errore) {
            td = new ToDo(id, titolo, descrizione, dataCreazione, dataFine, priorità, stato);
        }
        return td;

        // Loop di conversione da stringhe (linne file) a oggetti TO-DO
        // 1: conversione da linea del file a array di stringhe
        // 2: loop in cui:
        //    - si validano i campi (es. titolo non nullo, descriizone non nulla...)
        //    - si invoca il costruttore di ToDo passando i dati
        //     - Repository.add()
        // 3. Se qualcosa va male ==> output su schermop ("Ho saltato una riga per nome nullo...")
        // 4. alla fine: ho importato XYZ nuovi TOOD
    }
}