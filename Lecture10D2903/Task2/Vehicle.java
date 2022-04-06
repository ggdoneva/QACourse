package Lecture10D2903.Task2;

public abstract class Vehicle implements VehicleInterface{

    private String brand;
    private String color;
    private int speedF;
    private int speedB;

    public Vehicle(String brand, String color, int speedF, int speedB) {
        this.brand = brand;
        this.color = color;
        this.speedF = speedF;
        this.speedB = speedB;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeedF() {
        return speedF;
    }

    public void setSpeedF(int speedF) {
        this.speedF = speedF;
    }

    public int getSpeedB() {
        return speedB;
    }

    public void setSpeedB(int speedB) {
        this.speedB = speedB;
    }

}
