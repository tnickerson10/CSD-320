/* Travis Nickerson
    April 8th, 2021
    Module 5 Assignment
    Goal: to create a while loop that displays fractions with the denominator incremented
    by 2 starting with 1/3 and ending with 1/99. Then reverse the order
 */
// import decimal format module to control answer output
import java.text.DecimalFormat;

public class whileLoop {
    public static void main(String[] args) {
        // set global variables
        double numerator = 1;
        double denominator = 3;
        DecimalFormat df = new DecimalFormat(".0000");

        System.out.println("\n-- VERSION 1 --\n");
        // create while loop that increments denominator by 2 starting at 3 and stops at 100
        while (denominator < 100) {
            System.out.print((int)numerator + "/" + (int)denominator + " = " + df.format(numerator/denominator) + " , ");
            denominator += 2;
        }

        System.out.println("\n --REVERSED ORDER--");


        // set denominator to 99 in order to start the descending pattern of the denominator
        denominator = 99;

        // create while loop that decrements denominator by 2 starting at 99 and stops at 3
        while (denominator >= 3 ) {
            System.out.print((int)numerator + "/" + (int)denominator + " = " + df.format(numerator/denominator) + " , ");
            denominator -= 2;
        }
        System.out.println();
        System.out.print("\n -- VERSION 2 -- \n");
        System.out.println();

        // create while loop that increments denominator by 2 starting at 3 and stops at 100
        while (denominator < 100) {
            System.out.print((int)numerator + "/" + (int)denominator + " + ");
            denominator += 2;
        }

        System.out.println("\n --REVERSED ORDER--");

        // set denominator to 99 in order to start the descending pattern of the denominator
        denominator = 99;

        // create while loop that decrements denominator by 2 starting at 99 and stops at 3
        while (denominator >= 3 ) {
            System.out.print((int)numerator + "/" + (int)denominator + " + ");
            denominator -= 2;
        }
    }
}
