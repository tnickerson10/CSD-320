/*
Travis Nickerson
April 1st, 2021
Module 4 assignment
Goal: To have a user input two strings and to check if string 1 is a substring
of string two or if string two is a substring of string 1.
 */
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        // Ask user to enter a random string and create a new Scanner
        System.out.print("Please enter a random string of characters: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();

        // Ask the user to enter a second string
        System.out.print("Please enter another string of characters: ");
        String s2 = input.nextLine();

        // Check if there is a substring index of each string(if none exists it return -1)
        int subOfS1 = s2.indexOf(s1);
        int subOfS2 = s1.indexOf(s2);

        // Print the results if string 1 is a substring of string 2
        if (subOfS1 >= 0) {
            System.out.println("String 1 is a substring of String 2! Your substring starts" +
                    " at the index of " + subOfS1 + "!");
        } else {
            System.out.println("String 1 is not a substring of String 2!");
        }

        // Print the results if string 2 is a substring of string 1
        if (subOfS2 >= 0) {
            System.out.println("String 2 is a substring of String 1! Your substring starts" +
                    " at the index of " + subOfS2 + "!");
        } else  {
            System.out.println("String 2 is not a substring of String 1!");
        }

    }
}
