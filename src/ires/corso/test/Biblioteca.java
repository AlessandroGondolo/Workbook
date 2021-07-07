package ires.corso.test;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca implements Serializable {

    // repository, da serializzare
    public static long idSeed;
    protected static Biblioteca _biblioteca = null;
    private static String _fileName;
    public static boolean _init = false;

    public Map<Long, Libro> _data = new HashMap<>();

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

    public static Biblioteca getRepo() throws Exception {
        if (!_init) {
            throw new Exception("ToDo Repository non è stato inizializzato");
        }
        if (_biblioteca == null) {
            if (!Files.exists(Paths.get(_fileName)))
                _biblioteca = new Biblioteca();
            else
                loadFromFile();
        }

        return _biblioteca;
    }
    public static Biblioteca getBiblioteca() {
        if (_biblioteca == null)
            _biblioteca = new Biblioteca();
        return _biblioteca;
    }

    public static void loadFromFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream(_fileName);
             ObjectInputStream in = new ObjectInputStream(file);) {
            _biblioteca = (Biblioteca) in.readObject();
        }

    }


    public static long getNewID() {
        return ++idSeed;
    }

    public static void add(Libro l) {
        Long newId = getNewID();
        l.setId(newId);
        _biblioteca._data.put(newId, l);
    }

    public static void update(Libro l) {
        long id = l.getId();
        _biblioteca._data.put(id, l);
    }

    public static void delete(Long id) {
        _biblioteca._data.remove(id);
    }

    public boolean isContained(long id) {
        return _biblioteca._data.containsKey(id);
    }

    public static Libro getLibroById(long id) {
        return _biblioteca._data.get(id);
    }

    public static ArrayList<Libro> getListaLibri() {
        ArrayList<Libro> libri = new ArrayList<>();
        libri.addAll(_biblioteca._data.values());
        return libri;
    }

    public void writeToFile(String fileName) throws IOException {
        try (FileOutputStream file = new FileOutputStream(_fileName);
             ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(_biblioteca);
        }
    }
}
