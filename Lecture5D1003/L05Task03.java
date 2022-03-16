package Lecture5D1003;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Create an array with 3 elements.
//Ask and user to enter this elements.
//Now display all of the user data

public class L05Task03 {
    public static void main(String[] args) {

        int[] arr = new int[3];

        System.out.println("Enter 3 numbers:");

        System.out.println("New array: " + Arrays.toString(newArray(arr)));

    }

    public static int[] newArray (int[] arr){

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            int newEl = scan.nextInt();
            arr[i] = newEl;


        }
        scan.close();

        return arr;

    }
}
