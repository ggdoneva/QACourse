package Lecture7D1703.Task1;

import java.util.Arrays;

//Create a classes that represent the firm explained in the next few lines:
//There is a company called Momo, and it has 5 employees.
//Every employee is part of a team and also every employee has salary and a name.
//The company has an ability to list all employees in a team and all employees.
//Try to represent all above relationships. Create as many classes and methods as needed.
//And then create a main class and main method and run all methods with examples.
public class Main {

    public static void main(String[] args) {

    Employee Tom = new Employee("Alpha", 8000, "Tom");
    Employee Bob = new Employee("Beta", 1000, "Bob");
    Employee Marley = new Employee("Beta", 1500, "Marley");
    Employee David = new Employee("Beta", 1200, "David");
    Employee Ann = new Employee("Alpha", 9000, "Ann");

    Company momo = new Company();
    momo.setName("Momo");
    momo.addEmployee(Tom);
    momo.addEmployee(Bob);
    momo.addEmployee(Marley);
    momo.addEmployee(David);
    momo.addEmployee(Ann);

    System.out.println(Arrays.toString(momo.getEmployees()));

    System.out.println(Arrays.toString(momo.employeesFromTeam("Alpha")));
    }

}
