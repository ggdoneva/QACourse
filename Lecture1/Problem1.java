package Lecture1;

import java.util.concurrent.ThreadLocalRandom;

public class Problem1 {
    public static void main(String[] args) {


        int randomNum= ThreadLocalRandom.current().nextInt(1,10+1);
        System.out.println(randomNum);

        if(randomNum > 5){
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is not greater than 5.");
        }


    }
}
