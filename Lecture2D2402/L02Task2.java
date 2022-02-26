package Lecture2D2402;

import java.util.Scanner;

//A student will not be allowed to sit in exam if his/her attendance is less than 75%. Take following input from user :
//Number of classes held
//Number of classes attended
//And print percentage of class attended and if the student is allowed to sit in exam or not
//Input: Classes - 30 Attendance - 28 Output: 93 % You are able to attend
//Input: Classes - 30 Attendance - 20 Output: 67 % You are not able to attend

public class L02Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double classes = scan.nextDouble();
        double classesAttended = scan.nextDouble();

        double percentage = (classesAttended / classes) * 100;
        //System.out.println(percentage);

        if(percentage >= 75){
            System.out.println("You are able to attend");
        } else {
            System.out.println("You are not able to attend");
        }

       scan.close();

    }

}
