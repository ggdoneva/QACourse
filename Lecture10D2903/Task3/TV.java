package Lecture10D2903.Task3;

public abstract class TV implements ElectricDevice{

    public TV() {
    }

    boolean isTurnedOn = true;

    public void turnOn() {
        System.out.println("TV: Turn on");
    }

    public void turnOff() {
        isTurnedOn = false;
        System.out.println("TV: Turn off");
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public String toString() {
        return "TV";
    }
}
