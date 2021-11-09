/* Travis Nickerson
    May 6th 2021
    Assignment 10
    Goal: Write four overloaded methods that return the average of an array with the following headers:

    public static short average(short [] array)
    public static int average(int [] array)
    public static long average(long [] array)
    public static double average(double [] array)

    Write a test program that invokes each of these methods and then displays the average value returned along
    with a display of the original array elements. Ensure the display is easy to read and understandable. Lastly,
    each array sent into the methods must be of different sizes to ensure the method code is correctly written.
 */
public class ArrayOverload {
    // declare and initialize count for storing array totals
    private static short count1 = 0;
    private static int count2 = 0;
    private static long count3 = 0;
    private static double count4 = 0;

    public static void main(String[] args) {
        // calling each array with various lengths
        ArrayOverload.average(new short[]{1, 2, 3, 6});
        ArrayOverload.average(new int[]{1, 3, 4, 5, 6, 5});
        ArrayOverload.average(new long[]{3, 5, 2, 5, 8, 30, 10, 20, 2, 15});
        ArrayOverload.average(new double[]{23, 16, 12});

    }
    // short array method
    public static short[] average(short[] array) {
        System.out.println("The original array is: ");
        // for loop for iterating over the array and displaying each array element
        for (short i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
            // storing the new total of each iteration of the array
            count1+= array[i];
        }
        // printing the average of the array
        System.out.println("\nThe average of the short array is : " + ((short)count1/ (short)array.length));
        System.out.println();
        return array;

    }
    // int array method
    public static int[] average(int [] array) {
        System.out.println("The original array is: ");
        // for loop for iterating over the array and displaying each array element
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
            // storing the new total of each iteration of the array
            count2+= array[i];
        }
        // printing the average of the array
        System.out.println("\nThe average of the int array is : " + ((int)count2/ (int)array.length));
        System.out.println();
        return array;

    }
    // long array method
    public static long[] average(long [] array) {
        System.out.println("The original array is: ");
        // for loop for iterating over the array and displaying each array element
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
            // storing the new total of each iteration of the array
            count3+= array[i];
        }
        // printing the average of the array
        System.out.println("\nThe average of the long array is : " + ((long)count3/ (long)array.length));
        System.out.println();
        return array;

    }
    // double array method
    public static double[] average(double [] array) {
        System.out.println("The original array is: ");
        // for loop for iterating over the array and displaying each array element
        for (int i = 0; i < array.length; i++) {
            System.out.print((int)array[i] + "  ");
            // storing the new total of each iteration of the array
            count4+= array[i];
        }
        // printing the average of the array
        System.out.println("\nThe average of the double array is : " + ((double)count4/ (double)array.length));
        System.out.println();
        return array;

    }
}
