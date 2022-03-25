package Lecture7D1703.Task2;

//Create an array of the previous class ( circle ) with 10 elements.
//Randomly generate every radius ( between 1-10)
//Print which the area of the largest circle.

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        double randomRadius;

        for (int i = 0; i < circles.length; i++) {
            randomRadius = ThreadLocalRandom.current().nextInt(1,10+1);
            circles[i] = new Circle(randomRadius);
        }

        Circle maxRadius = new Circle(0);
        for (int i = 0; i < circles.length; i++) {
            if(circles[i].getRadius() > maxRadius.getRadius()){
                maxRadius = circles[i];
            }
        }
        System.out.println("Max area:" + maxRadius.getArea());

    }
}