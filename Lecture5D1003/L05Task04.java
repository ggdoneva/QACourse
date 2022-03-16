package Lecture5D1003;

//Create a method that will take the array from previous slide and show all of the duplicated numbers

import java.lang.reflect.Array;
import java.util.Arrays;

public class L05Task04 {
    public static void main(String[] args) {

        System.out.println("Enter 3 numbers:");
        int[] arr = new int[3];
        int[] newArr = Arrays.copyOf(L05Task03.newArray(arr), arr.length);
        String dups = "";

        System.out.println("Copy of array:" + Arrays.toString(newArr));

        int i;
        for (i = 0; i < newArr.length-1; i++) {

            for (int j = i+1; j < newArr.length; j++) {
                if (newArr[i] == newArr[j]) {
                    dups = dups + newArr[i] + " ";
                }
            }

        }

        System.out.println("Duplicated numbers: " + dups);
    }
}
