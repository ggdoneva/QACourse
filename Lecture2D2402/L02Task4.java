package Lecture2D2402;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Get a random number between 1 and 100
//Check if the number is odd or even
//Print the information on the console

public class L02Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 1;
        int max = 100;

        int randomNum = ThreadLocalRandom.current().nextInt(min,max+1);
        System.out.println("The random number is: " + randomNum);

        if (randomNum % 2 == 0){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        scan.close();
    }
}
