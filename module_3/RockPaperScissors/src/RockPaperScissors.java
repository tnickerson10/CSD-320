/*
Travis Nickerson
April 1st 2021
Module 3 assignment
Goal: To create a rock paper scissors game and have the user enter a value
representing rock paper or scissors and then generating a random outcome
from computer and display the winner
 */
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // generate a random number of 1 - 3
        int randNum = ((int)(Math.random() * 3 + 1));
        // Create a scanner and ask user to chose a number for rock, paper or scissors
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1 for Rock, 2 for Paper, 3 for Scissors: ");
        int userPick = input.nextInt();
        // switch the randNum to represent rock paper or scissors
        switch(randNum) {
            case 1:
                System.out.println("The computer chose Rock!");
                break;
            case 2:
                System.out.println("The computer chose Paper!");
                break;
            case 3:
                System.out.println("The computer chose Scissors!");
        }
        // switch the users input from a number to rock paper or scissors
        switch(userPick) {
            case 1:
                System.out.println("You chose Rock!");
                break;
            case 2:
                System.out.println("You chose Paper!");
                break;
            case 3:
                System.out.println("You chose Scissors!");
        }
        // compare results, display them and the winner or draw
        if ((randNum == 1 && userPick == 3) || (randNum == 2 && userPick == 1) || (randNum == 3 && userPick == 2)) {
            System.out.println("The computer won!");
        } else if (randNum == userPick ) {
            System.out.println("It is a draw!");
        } else {
            System.out.println("You WON!!!");
        }


    }

}
