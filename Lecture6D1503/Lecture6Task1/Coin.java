package Lecture6D1503.Lecture6Task1;

import java.util.concurrent.ThreadLocalRandom;

public class Coin {

    public int Flip (){

        //1 for Head
        //2 for Tails

        int num = ThreadLocalRandom.current().nextInt(1,2+1);

        return num;

    }
}
