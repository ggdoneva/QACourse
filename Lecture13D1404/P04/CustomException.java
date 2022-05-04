package Lecture13D1404.P04;

public class CustomException extends Exception {

    public CustomException(String message){

        super(message + "This is my custom exception.");
    }

}
