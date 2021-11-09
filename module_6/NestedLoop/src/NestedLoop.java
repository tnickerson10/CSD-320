/*
    Travis Nickerson
    April 15th, 2021
    Assignment 6.2
    Goal: Create a nested loop with a pyramid structure and the desired output of assignment 6.2
 */
public class NestedLoop {
    public static void main(String[] args) {
        // initialize descending numbers
        int descendingNum = 0;
        // initialize number of rows
        int rows = 6;
        // set up for loop
        for (int i = 1; i <= 64; i *= 2) {
            // Display white space before numbers
            for (int j = 0; j < rows; j++) {
                System.out.print("    ");
            }
            // Display incremented numbers
            for (int k = 1; k <= i; k *= 2) {
                System.out.printf("%4d", (k));
            }
            // Display descending numbers
            for (int l = descendingNum; l > 0 ; l /= 2 ) {
                System.out.printf("%4d", (l));
            }
            // add whitespaces after descending numbers
            for (int j = 0; j < rows; j++) {
                System.out.print("    ");
            }
            // add @ at end of descending whitespace in equal interval as whitespace before ascending numbers
            System.out.println(" @");
            System.out.println();
            // Decrement rows
            rows--;
            // assign i to descendingNum
            descendingNum = i;
        }
    }
}
