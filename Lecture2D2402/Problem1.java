package Lecture2D2402;

import java.util.concurrent.ThreadLocalRandom;

public class Problem1 {
    public static void main(String[] args) {

        int min = -100;
        int max = 100;

        int randomNum = ThreadLocalRandom.current().nextInt(min,max+1);
        System.out.println(randomNum);

        if(randomNum > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        String result = randomNum>0 ? "number is positive" : "number is negative";
        System.out.println(result);

    }


}
