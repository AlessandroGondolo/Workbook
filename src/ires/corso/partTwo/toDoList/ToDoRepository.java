package ires.corso.partTwo.toDoList;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// GRUPPO 4:
public class ToDoRepository implements Serializable {


    public static long idSeed;
    public static boolean _init = false;
    private static String _fileName;
    protected static ToDoRepository _repository = null;

    public static boolean init(String fileName) {
        try {
            Path p = Paths.get(fileName);
            _fileName = p.toString();
            _init = true;
        } catch (InvalidPathException ipe) {
            System.out.println(ipe.getMessage());
        }
        return _init;
    }

    public static ToDoRepository getRepo() throws Exception {
        if (!_init) {
            throw new Exception("ToDo Repository non è stato inizializzato");
        }
        if (_repository == null) {
            if (!Files.exists(Paths.get(_fileName)))
                _repository = new ToDoRepository();
            else
                loadFromFile();
        }

        return _repository;
    }


    public static void loadFromFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream(_fileName);
             ObjectInputStream in = new ObjectInputStream(file);) {
            _repository = (ToDoRepository) in.readObject();
        }

    }

      public static ToDoRepository getToDoRepository() {
        if(_repository==null)
            _repository = new ToDoRepository();
        return _repository;
    }

    public static long getNewId() {
        return ++idSeed;
    }

    public Map<Long, ToDo> _data = new HashMap<>();

    public static void delete(Long ID) {
        _repository._data.remove(ID);
    }

    ;

    public static void add(ToDo t) {
        Long newId = getNewId();
        t.setId(newId);
        _repository._data.put(newId, t);
    }

    public static void update(ToDo t) {
        // si prende l'ID dall'oggetto t
        // si recupera dalla mappa il TO-DO corrispondente con get(t), per controllo
        // si sostituisce con put(ID, t)
        long id = t.getId();
        _repository._data.put(id, t);
    }

    public static boolean idContained(long id) {
        return _repository._data.containsKey(id);
    }

    public static ToDo getToDoById(long id) {
        return _repository._data.get(id);
    }

    public static List<ToDo> getToDoList() {
        ArrayList<ToDo> prova = new ArrayList<>();
        prova.addAll(_repository._data.values());
        return prova;
    }

    public void writeToFile(String fileName) throws IOException {
        try (FileOutputStream file = new FileOutputStream(_fileName);
             ObjectOutputStream out = new ObjectOutputStream(file)) {
             out.writeObject(_repository);
        }
    }


}