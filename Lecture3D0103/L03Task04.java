package Lecture3D0103;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Create Rock Paper Scissors Game.
//The player should choose the between 3 options.
//Once the player has chosen the computer should also generate a random number and check the result.
//Optional - Count the number of wins for the computer and for the player.

public class L03Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Game start \n" +
                        "Choose: \n" +
                        "1 for Rock; \n" +
                        "2 for Paper; \n" +
                        "3 for Scissors; \n" +
                        "0 for End game");

        int inputPlayer = scan.nextInt();
        int inputComputer;
        int playerWins = 0;
        int computerWins = 0;
        boolean isAWin = false;
        boolean isEqual = false;
        boolean isInputValid = true;

        while (inputPlayer != 0){

            switch (inputPlayer){
                case 1: //rock
                    inputComputer = ThreadLocalRandom.current().nextInt(1,3+1);
                    if (inputComputer == 1){
                        isEqual = true;
                    } else if (inputComputer == 2){
                        computerWins++;
                    } else if (inputComputer == 3){
                        isAWin = true;
                        playerWins++;
                    }
                    break;
                case 2: //paper
                    inputComputer = ThreadLocalRandom.current().nextInt(1,3+1);
                    if (inputComputer == 1){
                        isAWin = true;
                        playerWins++;
                    } else if (inputComputer == 2){
                        isEqual = true;
                    } else if (inputComputer == 3){
                        computerWins++;
                    }
                    break;
                case 3: //scissors
                    inputComputer = ThreadLocalRandom.current().nextInt(1,3+1);
                    if (inputComputer == 1){
                        computerWins++;
                    } else if (inputComputer == 2){
                        isAWin = true;
                        playerWins++;
                    } else if (inputComputer == 3){
                        isEqual = true;
                    }
                    break;
                default:
                    isInputValid = false;
                    System.out.println("The input is not valid! Try again!");
                    break;
            }

            if(!isInputValid){
                inputPlayer = scan.nextInt();
                continue;
            }

            if (isEqual) {
                System.out.println("No one wins. Try again!");
            } else if (isAWin){
                System.out.println("Congrats! You win!");
            } else if (!isAWin){
                System.out.println("You lose! Try again!");
            }

            inputPlayer = scan.nextInt();
            isEqual = false;
            isAWin = false;

        }

        System.out.println("End Game \n" +
                    "Player total wins: " + playerWins + "\n" +
                    "Computer total wins: " + computerWins);


        scan.close();
    }
}
