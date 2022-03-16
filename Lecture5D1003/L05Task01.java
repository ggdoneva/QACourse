package Lecture5D1003;

//Create 2 methods that will find the max and the min number on an array of integers.
//The input should be the array and the output the smallest/largest number.

public class L05Task01 {
    public static void main(String[] args) {

        int[] arr = {4,6,2,96,3,93,756,1};

        System.out.println("Min number of the array: " + min(arr));
        System.out.println("Max number of the array:" + max(arr));

    }

    public static int min (int arr[]) {

        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < minNum){
                minNum = arr[i];
            }
        }

        return minNum;
    }

    public static int max (int arr[]) {

        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }

        return maxNum;
    }
}
