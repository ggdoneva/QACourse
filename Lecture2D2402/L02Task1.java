package Lecture2D2402;

//Write a program to print absolute value of a number entered by user.
//Example
//Input: 1        output: 1
//Input: -1        output: 1

import java.util.Scanner;

public class L02Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inputNum = scan.nextInt();

        System.out.println(Math.abs(inputNum));

        scan.close();

    }
}
