package Lecture13D1404.P04;

//Add a custom Exception that will handle incorrect name.
//Throw this custom exception every time that we try to create a name with 1 or less symbols.
//Create a list of 3 Persons and handle the exceptions.



import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CustomException {

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Ted", 20));
        personList.add(new Person("A", 30));
        personList.add(new Person("Jack", -25));

        System.out.println(personList);

        for (Person onePerson: personList){
            System.out.println(onePerson);

            try {
                System.out.println(onePerson.getName());
                System.out.println(onePerson.getAge());
            } catch (IllegalArgumentException e) {
                System.out.println("Illegal Exception");
            } catch (CustomException e){
              System.out.println(e.getMessage());
              e.printStackTrace();
            }
        }


    }
}
