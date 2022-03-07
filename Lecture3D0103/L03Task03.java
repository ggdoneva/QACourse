package Lecture3D0103;

import java.util.Scanner;

//Display Fibonacci sequence on the console.
//Get the limit from the user

public class L03Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int limit = scan.nextInt();
        int previousN = 0;
        int nextN = 1;
        int tempN = 0;
        String output = previousN + " ";

        while (nextN <= limit){

            output += nextN + " ";
            tempN = previousN + nextN;
            previousN = nextN;
            nextN = tempN;

        }

        System.out.println(output);

        scan.close();
    }
}
