package Lecture3D0103;

import java.util.Scanner;

//Display the Factorial of a number
//5!=1*2*3*4*5=120
//The number should be entered from the user

public class L03Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int result = 1;

        while (n != 0){

            result *= n;
            n--;
        }

        System.out.println("Result: " + result);

        scan.close();
    }
}
