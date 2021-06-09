package ires.corso.partone;

import java.util.Scanner;

public class ArrayTest {

    //Scrivere un metodo java che restituisce la posizione di un certo elemento
    //arrai di int che resituisce la posizione del numero o -1 se non è presente

    public static void main (String[] args){


        System.out.println("Inserisci un array di numeri (separati da uno spazio");
        System.out.print("==>");
        Scanner in = new Scanner(System.in);
        String nl = in.nextLine();

        String[] strArr = nl.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length ; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println("Dimmi l'elemento da cercare all'interno dell'array");
        int j = in.nextInt();
        int pos = elementPos(intArr,j);

        System.out.printf("L'elemento cercato è in posizione %d\n", pos);
    }

    public static int elementPos(int[] intArray,int num){
        int i,pos = -1;

        for (i=1;i< intArray.length; i++){
            if (intArray[i] == num) {
                pos = i;
            }
        }
        return pos;
    }
}

