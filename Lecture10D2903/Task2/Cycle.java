package Lecture10D2903.Task2;

public class Cycle extends Vehicle{

    public Cycle(String brand, String color, int speedF, int speedB) {
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
        return "Cycle";
    }
}
