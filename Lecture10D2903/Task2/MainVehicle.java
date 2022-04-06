package Lecture10D2903.Task2;

public class MainVehicle {

    public static void main(String[] args) {

        Vehicle vehicleOne = new Car("Saab", "grey", 80, 10);
        Vehicle vehicleTwo = new Cycle("Cross", "blue", 20, 0);

        System.out.printf("%s: %s %n", vehicleOne, vehicleOne.moveForward());
        System.out.printf("%s: %s %n", vehicleOne, vehicleOne.moveBackward());

        System.out.printf("%s: %s %n", vehicleTwo, vehicleTwo.moveForward());
        System.out.printf("%s: %s %n", vehicleTwo, vehicleTwo.moveBackward());


    }
}
