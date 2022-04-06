package Lecture10D2903.Task3;

public class MainDevice {

    public static void main(String[] args) {

        Radio radio = new Radio() {};
        TV tv = new TV() {};

        radio.turnOn();
        tv.turnOff();

        System.out.printf("Is the %s turned on? - %s %n", radio, radio.isTurnedOn());

        System.out.printf("Is the %s turned on? - %s", tv, tv.isTurnedOn());

    }
}
