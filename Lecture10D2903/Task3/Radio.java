package Lecture10D2903.Task3;

public abstract class Radio implements ElectricDevice{

    public Radio() {
    }

    boolean isTurnedOn = true;

    public void turnOn() {
        System.out.println("Radio: Turn on");
    }

    public void turnOff() {
        isTurnedOn = false;
        System.out.println("Radio: Turn off");
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public String toString() {
        return "Radio";
    }
}
