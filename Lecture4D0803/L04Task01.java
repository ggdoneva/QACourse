package Lecture4D0803;

import java.util.Scanner;
//Find an area of a square in a method.
//The input of the method ( parameters) should be the side of the square.
//The output should be the area.

public class L04Task01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side of a square:");
        int x = scan.nextInt();

        System.out.println("Area: " + area(x));

        scan.close();
    }

    public static int area (int z) {

        int area = z * z;

        return area;
    }
}
