package Lecture11D0504.Task1;

//Use Geometry Project from previous lectures and create a List of a few figures:
//Rectangle - 5 , 6
//Circle - 3
//Rectangle - 4, 7
//Find the one with the largest area.

import java.util.ArrayList;

public class MainGeometry {

    public static void main(String[] args) {

        ArrayList<Geometry> figuresList = new ArrayList<>();
        figuresList.add(new Rectangle(5,6));
        figuresList.add(new Circle(3));
        figuresList.add(new Rectangle(4, 7));

        System.out.println("Full list: " + figuresList);

        double maxArea = 0;

        for (Geometry figure: figuresList) {
            System.out.println("Figure: " + figure + "; Area: " + figure.getArea());

            double currentArea = figure.getArea();
            if(currentArea > maxArea){
                maxArea = currentArea;
            }
        }

        System.out.println("Max area: " + maxArea);

    }
}
