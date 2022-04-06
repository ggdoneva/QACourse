package Lecture10D2903.Task1;

//Create a method that will find the average age of all employees and manager in the firm.
//For simplicity choose a small number of employees - for example 3
////Use the previous classes and create a new one CEO.
//Give a restriction to this person to be at least 50 years old.
//Show in the main method - how we couldn't create person for CEO that is 40 years old.

public class Main {

    public static void main(String[] args) {

        Person person1 = new Employee("Bobby", 29);
        Person person2 = new Manager("Kelly", 45);

        System.out.println(person1 + ": " + person1.work());
        System.out.println(person2 + ": " + person2.work());
    }

}
