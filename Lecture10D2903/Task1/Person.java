package Lecture10D2903.Task1;

//Create an interface of the last time homework.
//Change the person class to an interface.

public abstract class Person implements PersonInterface{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
