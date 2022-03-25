package Lecture6D1503.Lecture6Task1;

//Create a coin class
//Create an object out of this coin.
//Create method to flip it

public class Main {

    public static void main(String[] args) {

        Coin result = new Coin();

        if(result.Flip() == 1){
            System.out.println("Head");
        } else {
            System.out.println("Tails");
        }

    }

}
