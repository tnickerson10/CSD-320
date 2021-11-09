/* Travis Nickerson
    April 8th, 2021
    Module 5 Assignment
    Goal: to create a while loop that displays fractions with the denominator incremented
    by 2 starting with 1/3 and ending with 1/99. Then reverse the order and print both answers
 */
// import decimal format module to control answer output
import java.text.DecimalFormat;

public class whileLoops {
    public static void main(String[] args) {
        // set variables
        double numerator = 1;
        double denominator = 3;
        double sum = 0;
        double sum2 = 0;
        DecimalFormat df = new DecimalFormat(".00000000");


        // create while loop that increments denominator by 2 starting at 3 and stops at 100
        while (denominator < 100) {
            System.out.print((int)numerator + "/" + (int)denominator + " + ");
            if (denominator == 99) {
                System.out.print((int)numerator + "/" + (int)denominator + "=");
            }
            sum += 1/denominator;
            denominator += 2;
        }

        System.out.println("\nThe answer to the above equation is: " + df.format(sum));
        System.out.println("\n --REVERSED ORDER--\n");

        // set denominator to 99 in order to start the descending pattern of the denominator
        denominator = 99;

        // create while loop that decrements denominator by 2 starting at 99 and stops at 3
        while (denominator >= 3 ) {
            System.out.print((int)numerator + "/" + (int)denominator + " + ");
            if (denominator == 3) {
                System.out.print((int)numerator + "/" + (int)denominator + "=");
            }
            sum2 += 1/denominator;
            denominator -= 2;
        }
        System.out.println("\nThe answer to the above equation is: " + df.format(sum2));
    }
}
