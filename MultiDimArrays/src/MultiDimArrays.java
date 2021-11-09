/* Travis Nickerson
    May 13th 2021
    Assignment 11
    Goal: Write methods using the following headers that returns the location of the largest element in the array
    passed to the method returning a one-dimensional array that contains two location elements.
    public static int [] locateLargest (double [][] arrayParam)
    public static int [] locateLargest (int [][] arrayParam)
    Then, write methods using the following headers that returns the location of the smallest element in the array
    passed to the method returning a one-dimensional array that contains two location elements.
    public static int [] locateSmallest (double [][] arrayParam)
    public static int [] locateSmallest (int [][] arrayParam)
 */
public class MultiDimArrays {
    // initialize and set class variables
    public static int [] locationOfLargest1 = {0,0};
    public static double largestNum1;
    public static int [] locationOfLargest2 = {0,0};
    public static int largestNum2;
    public static int [] locationOfSmallest1 = {0,0};
    public static double smallestNum1 = 9;
    public static int [] locationOfSmallest2 = {0,0};
    public static int smallestNum2 = 9;


    public static void main(String[] args) {
        // call methods of various 2D arrays sizes
        MultiDimArrays.locateLargest(new double[3][3]);
        MultiDimArrays.locateLargest(new int[4][4]);
        MultiDimArrays.locateSmallest(new double[5][5]);
        MultiDimArrays.locateSmallest(new int[6][6]);
    }
    // method to locate largest number and location in array as double
    public static int[] locateLargest(double [][] arrayParam) {
        // set largest num to first num in array
        largestNum1 = arrayParam[0][0];
        // create an array with random numbers (1-9)
        for (int i = 0; i < arrayParam.length; i++ ) {
            for (int j = 0; j < arrayParam[i].length; j++){
                arrayParam[i][j] = (int)(Math.random() * 10);
                // print 2d array
                System.out.print(arrayParam[i][j] + " ");
                // set new largest num in array
                if (largestNum1 < arrayParam[i][j]) {
                    largestNum1 = arrayParam[i][j];
                    // set and update location of largest num
                    locationOfLargest1[0] = i;
                    locationOfLargest1[1] = j;
                }
            }
            System.out.println();
        }
        // print statements for largest num in array and location
        System.out.println("The Largest Number in the Array is: " + largestNum1);
        System.out.println("The location (first appearance) of the Largest Number in " +
                "the Array is:" + java.util.Arrays.toString(locationOfLargest1));
        System.out.println();
        // return location as single array
        return locationOfLargest1;
    }
    // method to locate largest number and location in array as int
    public static int[] locateLargest(int [][] arrayParam) {
        // set largest num to first num in array
        largestNum2 = arrayParam[0][0];
        // create an array with random numbers (1 -9)
        for (int i = 0; i < arrayParam.length; i++ ) {
            for (int j = 0; j < arrayParam[i].length; j++){
                arrayParam[i][j] = (int)(Math.random() * 10);
                // print 2d array
                System.out.print(arrayParam[i][j] + " ");
                // set new largest num in array
                if (largestNum2 < arrayParam[i][j]) {
                    largestNum2 = arrayParam[i][j];
                    // set and update location of largest num
                    locationOfLargest2[0] = i;
                    locationOfLargest2[1] = j;
                }
            }
            System.out.println();
        }
        System.out.println("The Largest Number in the Array is: " + largestNum2);
        System.out.println("The location (first appearance) of the Largest Number in " +
                "the Array is:" + java.util.Arrays.toString(locationOfLargest2));
        System.out.println();
        // return largest num location as single array
        return locationOfLargest2;
    }
    // method to locate smallest number and location in array as double
    public static int[] locateSmallest(double [][] arrayParam) {
        // create an array with random numbers (1-9)
        for (int i = 0; i < arrayParam.length; i++ ) {
            for (int j = 0; j < arrayParam[i].length; j++){
                arrayParam[i][j] = (int)(Math.random() * 10);
                // print 2d array
                System.out.print(arrayParam[i][j] + " ");
                // set new smallest num in array
                if (smallestNum1 > arrayParam[i][j]) {
                    smallestNum1 = arrayParam[i][j];
                    // update location of smallest num in array
                    locationOfSmallest1[0] = i;
                    locationOfSmallest1[1] = j;
                }
            }
            System.out.println();
        }
        // print statements for smallest num in array and location
        System.out.println("The Smallest Number in the Array is: " + smallestNum1);
        System.out.println("The location (first appearance) of the Smallest Number in " +
                "the Array is:" + java.util.Arrays.toString(locationOfSmallest1));
        System.out.println();
        // return smallest num location as single array
        return locationOfSmallest1;
    }
    // method to locate smallest number and location in array as int
    public static int[] locateSmallest(int [][] arrayParam) {
        // create an array with random numbers (1-9)
        for (int i = 0; i < arrayParam.length; i++ ) {
            for (int j = 0; j < arrayParam[i].length; j++){
                arrayParam[i][j] = (int)(Math.random() * 10);
                // print 2d array
                System.out.print(arrayParam[i][j] + " ");
                // update smallest num in array
                if (smallestNum2 > arrayParam[i][j]) {
                    smallestNum2 = arrayParam[i][j];
                    // update location of smallest num in array
                    locationOfSmallest2[0] = i;
                    locationOfSmallest2[1] = j;
                }
            }
            System.out.println();
        }
        // print statements for smallest num in array and location
        System.out.println("The Smallest Number in the Array is: " + smallestNum2);
        System.out.println("The location (first appearance) of the Smallest Number in " +
                "the Array is:" + java.util.Arrays.toString(locationOfSmallest2));
        System.out.println();
        // return smallest num location as single array
        return locationOfSmallest2;
    }


}
