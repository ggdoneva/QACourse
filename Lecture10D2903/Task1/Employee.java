package Lecture10D2903.Task1;

//Employee should have property salary and team.

public class Employee extends Person {

    public Employee(String name, int age) {
    }

    public String work(){
        return "Working from 9 to 6.";
    }

    @Override
    public String toString() {
        return "Employee";
    }


}
