/* Travis Nickerson
    April 29th 2021
    Assignment 9
    Write a program that reads and fills an array with 20 integers. Then, using the array elements,
     calculate the data to find and display:

        The highest value entered.
        The lowest value entered.
        The average of the numbers entered.
        The sum of the numbers entered.
    Display this information in a readable display making the data easy to understand.
 */
public class Arrays {
    public static void main(String[] args) {
        // Initialize an array of 20 ints
        int [] arrayOfInts = {2,4,6,8,10,12,14,16,1,20,22,24,26,28,30,32,99,36,38,40};
        // set smallest number to 0
        int smallest = arrayOfInts[0];
        // set largest number to 0
        int largest = arrayOfInts[0];
        // set sum to 0
        int sum = 0;
        // initiate a for loop and iterate over array
        for (int i = 0; i < arrayOfInts.length; i++ ) {
            // keep track and store new smallest number
            if (arrayOfInts[i] < smallest) smallest = arrayOfInts[i];
            // keep track and store new largest number
            if (arrayOfInts[i] > largest) largest = arrayOfInts[i];
            // add each int from array to previous total to store sum
            sum += arrayOfInts[i];
        }
        // print statements
        System.out.println("The smallest number in the array is: " + smallest);
        System.out.println("The largest number in the array is: " + largest);
        System.out.println("The sum of the array is: " + sum);
        // print and calculate average
        System.out.println("The average of the array is: " + (sum/arrayOfInts.length));
    }
}
