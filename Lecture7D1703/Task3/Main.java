package Lecture7D1703.Task3;

//Create Employee class with that will take into account first, last name and salary of the employee.
//Create 2 Employees and find their average salary. Example Data:
//Ivan Dimitrov - 1000
//Georgi Petkov - 1100
//Avg - 1050

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Chris", "Bale", 2300);
        Employee employee2 = new Employee("Tom", "Hardy", 3100);

        System.out.println("Average: " + (employee1.getSalary() + employee2.getSalary()) / 2);

    }
}
