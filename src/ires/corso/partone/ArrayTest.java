package ires.corso.partone;

import java.util.Scanner;

public class ArrayTest {

    //Scrivere un metodo java che restituisce la posizione di un certo elemento
    //arrai di int che resituisce la posizione del numero o -1 se non è presente

    public static void main(String[] args) {


        System.out.println("Inserisci un array di numeri (separati da uno spazio");
        System.out.print("==>");
        Scanner in = new Scanner(System.in);
        String nl = in.nextLine();

        String[] strArr = nl.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        //System.out.println("Dimmi l'elemento da cercare all'interno dell'array");
        //int j = in.nextInt();
        //int pos = elementPos(intArr, j);
        // System.out.printf("L'elemento cercato è in posizione %d\n", pos);

        int[] result = removeDuplicates(intArr);
        for (int j : result) {

            System.out.print(j);

        }
    }
    public static int elementPos(int[] intArray, int num) {
        int i, pos = -1;

        for (i = 1; i < intArray.length; i++) {
            if (intArray[i] == num) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    // procedura rimozione duplicati
    public static int[] removeDuplicates(int[] intArray) {
        int[] result = new int[intArray.length];
        int j = 0;
        int count = 1;
        for (int value : intArray) {
            if (!isPresent(result, value)) {
                result[j++] = value;
                count++;
            }
        }
        j = 0;
        int[] result2 = new int[count];
        for (int k : intArray) {
            if (!isPresent(result2, k)) {
                result2[j++] = k;
            }
        }

        return result2;
    }

    // procedura per vedere se ho già inserito l'elemento
    public static boolean isPresent(int[] intArray, int elem) {
        for (int num : intArray) {
            if (num == elem) {
                return true;
            }

        }
        return false;
    }

}

