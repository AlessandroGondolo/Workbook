package ires.corso.partTwo.toDoList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// GRUPPO 4:
public class ToDoRepository implements Serializable
{
    /* GESTORE DELL'ARCHIVIO DEI TO-DO == DATABASE */

    // Contiene una HashMap di tutti i TO-DO a sistema:
    // - implementa il metodo di salvataggio su file
    // - implementa il metodo di caricamento da file
    // - metodi per individuare, aggiungere, eliminare un TO-DO
    // - restituisce una copia di tutti i TO-DO come ArrayList, da
    //   usare per le visualizzazioni di ToDoList

    // Serializzabile con la funzione writeObject()

    public static long idSeed;
    public static ToDoRepository loadFromFile(String fileName) {
        // Individua il file e lo deserializza con readObject
        // _repository = ...
        return _repository;
    }
    private static ToDoRepository _repository = null;

    public static ToDoRepository getToDoRepository() {
        return _repository;
    }

    public static long getNewId(){
        return ++idSeed;
    }
    Map<Long, ToDo> _data = new HashMap<>();

    public static void delete(Long ID) {
        _repository._data.remove(ID);
    };

    public static void add(ToDo t) {
        // si deve entrare nell'oggetto t e leggere il suo ID
        // per poi salvarlo nella mappa correttamente (con put(ID, t))
        long Id = t.getId();
        _repository._data.put(Id,t);
    }

    public static void update(ToDo t) {
        // si prende l'ID dall'oggetto t
        // si recupera dalla mappa il TO-DO corrispondente con get(t), per controllo
        // si sostituisce con put(ID, t)
        long id = t.getId();
        _repository._data.put(id, t) ;
    }

    public static boolean idContained(long id) {
        return _repository._data.containsKey(id);
    }

    public static ToDo getToDoById(long id) {
        return _repository._data.get(id);
    }

    public static List<ToDo> getToDoList() {

        return new ArrayList<ToDo>(_repository._data.values());
    }

    public void writeToFile(String fileName) {

    }


}