/*
Travis Nickerson
April 24th, 2021
Assignment 7
Goal: write a method for a password check with the guidelines of:
    password must be at least 8 characters, at least one number,
    at least one capital and at least one lowercase letter
 */
import java.util.Scanner;

public class ValidatedPassword {
    public static void main(String[] args) {
        // initialize while loop to check if there is a valid password
        while (true) {
            // create scanner
            Scanner input = new Scanner(System.in);
            System.out.print("Please Enter Your Password: ");
            // get input of users password
            String password = input.next();
            // if password is not valid (from isValid method), loop will re-prompt user for a valid password
            if (isValid(password) == true){
                break;
            }
        }
    }

    public static boolean isValid (String password) {
        // initialize variables
        boolean hasNum = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        char c;
        // create for loop to iterate over users password and check parameters
        for (int i = 0; i < password.length(); i++) {
            // sets variable c to current iteration over user password
            c = password.charAt(i);
            // checks if there is a number in user password, uppercase letter and lowercase letter
            // and updates variables if true
            if (Character.isDigit(c)) {
                hasNum = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            // checks if all parameters of user password are true and displays Successful Login and
            // returns it to isValid
            if (hasNum && hasUpper && hasLower && password.length() >= 8) {
                System.out.println("LOGIN SUCCESSFUL");
                return true;
            }
        }
        // display message if any parameters for user password are still false and returns it to isValid
        System.out.println("LOGIN FAILED. PLEASE TRY AGAIN");
        return false;

    }
}
