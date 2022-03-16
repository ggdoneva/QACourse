package Lecture5D1003;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
//Write a method in java.
//The methods should take an integer number.
//Then should create an array with random numbers between 1 and 10 and return it.

public class L05Task02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of an array:");
        int len = scan.nextInt();

        int[] arr = new int[len];

        System.out.println("Random array: " + Arrays.toString(randomArr(arr)));

        scan.close();

    }

    public static int[] randomArr (int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int randomNum= ThreadLocalRandom.current().nextInt(1,10+1);
            arr[i] = randomNum;

        }

        return arr;

       }

    }

