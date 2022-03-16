package Lecture4D0803;

import java.util.Scanner;
//Find an area of the Rectangle in a method
//What should be the parameters?
//The output should be the area of the rectangle.

public class L04Task02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 2 sides of a rectangle:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Area: " + area(a, b));
        scan.close();

    }

    public static int area (int x, int z) {

        int area = x * z;

        return area;
    }
}
