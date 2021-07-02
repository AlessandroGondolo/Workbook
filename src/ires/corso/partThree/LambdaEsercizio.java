package ires.corso.partThree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaEsercizio {

    // 1. Data una lista di nomi:
    //    - Agnese Stefano, Niki, Veronica, GabrieleM, Davide, GabrieleG, Alessandor, Albnerto, Fabiola, Alessio, Daniele
    //    - ...partire con un ArrayList che li contiene;
    //    - trasformarlo in stream
    //    - filtrare (escludendoli) i nomi che hanno lunghezza < 5 lettere
    //    - trasformare con UPPERCASE i rimanenti
    //    - stamparli su schermo
    //    ...concatenando il più possibile le varie operazioni



    public static void main(String[] args) {

        filterNames();
        filterNames2();
        transformNumbers();
    }




    // 2. Fare un programma Java che:
    //    - chiede all'utente una lista di numeri (separati da virgola) <== RIUSATE IL CODICE DEL SORTING GAME
    //    - li trasforma in stream
    //    - filtra i duplicati (HINT: guardate bene i metodi dell'interfaccia Stream...)
    //    - eleva al quadrato i numeri filtrati
    //    - calcola la media (HINT: operazione terminale chiamata "average": https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/stream/IntStream.html#average())

    public static void filterNames() {
        ArrayList<String> classe1 = new ArrayList<>();
        classe1.addAll(Arrays.asList("Agnese","Stefano","Niki","Veronica","GabrieleM","Davide","GabrieleG","Alessandro","Alberto","Fabiola","Alessio","Daniele"));

        classe1.stream().filter(s -> s.length()>5).map(s -> s.toUpperCase()).forEach(System.out::println);

    }

    public static void filterNames2() {
        ArrayList<String> classe1 = new ArrayList<>();
        classe1.addAll(Arrays.asList("Agnese","Stefano","Niki","Veronica","GabrieleM","Davide","GabrieleG","Alessandro","Alberto","Fabiola","Alessio","Daniele"));

        System.out.println(classe1.stream().filter(s -> s.length() > 5).map(s -> s.toUpperCase()).collect(Collectors.toList()));

    }

    public static void transformNumbers(){
        ArrayList<Integer> numeri = insertNumber();

        System.out.println(numeri.stream().distinct().map(s -> s * s).mapToInt(Integer::intValue).average().getAsDouble());


    }

    public static ArrayList<Integer> insertNumber(){
        System.out.print("Inserisci la sequenza di numeri separandoli con uno spazio: ");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        String[] stringArray = inputString.split(" ");
        ArrayList<Integer> intArray = new ArrayList<>();

        // la funzione parseInt da errore se non rileva un int
        for (int i = 0; i < stringArray.length; i++) {
            try {
                intArray.add(i,Integer.parseInt(stringArray[i]));
            } catch (Exception e) {
                System.out.println("Attenzione! Hai inserito un carattere non numerico");
            }

        }
        return intArray;
    }
}


