package Lecture3D0103;

import java.util.Scanner;

//Find min and max of numbers
//The user first should be asked how many numbers he will enter.
//After this we should ask him for every single number
//And finally - display the min and max on the screen

public class L03Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {

            int inputN = scan.nextInt();
            if(inputN < min){
                min = inputN;
            }
            if(inputN > max) {
                max = inputN;
            }

        }
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);

        scan.close();
    }
}
