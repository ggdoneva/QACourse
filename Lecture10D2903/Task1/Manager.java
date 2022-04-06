package Lecture10D2903.Task1;

//Manager should have team that manages.

public class Manager extends Person {

    public Manager(String name, int age) {
    }

    public String work(){
        return "Working from 10 to 5.";
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
