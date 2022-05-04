package Lecture13D1404.P04;

//Create class Person with name and age.
//Check for age property. If it is negative return an Exception
//Show the behaviour

public class Person {

    private String name;
    private int age;
    private Object message;

    //the constructor must throw exception
    public Person(String name, int age) throws IllegalArgumentException, CustomException {
        setName(name);
        setAge(age); //setAge to catch the exception
    }

    public String getName() {
        return name;
    }

    //create class for CustomException in order to use CustomException

    public void setName(String newName) throws CustomException{
        if (name.length()>1){
            name = newName;
        } else {
            throw new CustomException("Name is short");
        }

    }

    public int getAge() {
        return age;
    }

    //throw exception for negative age
    public void setAge(int newAge) throws IllegalArgumentException{
        if(age > 0) {
            age = newAge;
        } else {
            throw new IllegalArgumentException("Age is negative");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", message=" + message +
                '}';
    }
}
