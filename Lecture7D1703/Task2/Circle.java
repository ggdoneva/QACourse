package Lecture7D1703.Task2;

public class Circle {
    private double radius;

    //Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    //Get and Set methods
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius > 0){
            this.radius = radius;
        }
    }

    //rest of code
     double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return  radius * 2 * Math.PI;
    }
}
