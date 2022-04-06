package Lecture10D2903.Task2;

public class Car extends Vehicle{

    public Car(String brand, String color, int speedF, int speedB) {
        super(brand, color, speedF, speedB);
    }

    public String moveForward(){
        return "Moving forwards with speed " + getSpeedF();
    }

    public String moveBackward(){
        return "Moving backwards with speed " + getSpeedB();
    }

    @Override
    public String toString() {
        return "Car";
    }
}
