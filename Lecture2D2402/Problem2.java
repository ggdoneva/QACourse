package Lecture2D2402;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        if(grade == 2){
            System.out.println("Poor 2");
        } else if (grade == 3){
            System.out.println("Medium 3");
        } else if (grade == 4){
            System.out.println("Good 4");
        } else if (grade == 5){
            System.out.println("Very good 5");
        } else if (grade == 6){
            System.out.println("Excellent 6");
        } else {
            System.out.println("error");
        }

        scan.close();

    }

}
