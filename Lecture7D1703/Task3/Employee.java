package Lecture7D1703.Task3;

////Create Employee class with that will take into account first, last name and salary of the employee.
////Create 2 Employees and find their average salary. Example Data:
////Ivan Dimitrov - 1000
////Georgi Petkov - 1100
////Avg - 1050

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
