package Lecture9D2403.Task1;

//Create a method that will find the average age of all employees and manager in the firm.
//For simplicity choose a small number of employees - for example 3
////Use the previous classes and create a new one CEO.
//Give a restriction to this person to be at least 50 years old.
//Show in the main method - how we couldn't create person for CEO that is 40 years old.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person[] arrayPerson = new Person[4];
        arrayPerson[0] = new Employee("Bruno", 23, 1100, "Alpha");
        arrayPerson[1] = new Employee("Argos", 28, 2000, "Beta");
        arrayPerson[2] = new Manager("Kaya", 35, "Alpha");

        int ageCeo = 0;
        String nameCeo = "";

        arrayPerson[3] = new CEO(nameCeo, ageCeo);

        System.out.println("Average age: " + averageAge(arrayPerson));

        for (int i = 0; i < arrayPerson.length; i++) {
            if (arrayPerson[i] instanceof CEO){
                System.out.println("Enter CEO's age:");
                ageCeo = scan.nextInt();
                while(ageCeo < 50){
                    System.out.println("CEO's age should be 50 or older. Enter new age:");
                    ageCeo = scan.nextInt();
                }
                System.out.println("Enter CEO's name:");
                nameCeo = scan.next();
                arrayPerson[i].setAge(ageCeo);
                arrayPerson[i].setName(nameCeo);
                System.out.printf("CEO is %s, %d years old", arrayPerson[i].getName(), arrayPerson[i].getAge());
                break;
            }
        }

        scan.close();
    }


    private static int averageAge(Person[] arrayPerson){
        int average = 0;

        for (int i = 0; i < arrayPerson.length; i++) {
            average += arrayPerson[i].getAge();
            System.out.println(arrayPerson[i].getAge());
        }

        average /= arrayPerson.length;

        return average;
    }
}
