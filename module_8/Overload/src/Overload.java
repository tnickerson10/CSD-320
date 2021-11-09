/* Travis Nickerson
    April 24th 2021
    Assignment 8
    Goal: Write a program with four methods for calculating the cost of a yearly auto service visit.
    The methods will be titled yearlyService. Overload the methods to add in standard service, oil
    change, tire rotation and coupon. Call the methods and test them 2x each.
 */
public class Overload {
    // declare our class variable as public for any other class if it needs

    // ***Change standardService charge here***
    public static int standardService = 20;

    public static void main(String[] args) {
        // calling yearlyService 2x with no parameters. standardService is set above and can be changed
        // above in class variables
        Overload.yearlyService();
        Overload.yearlyService();

        System.out.println();
        // calling yearlyService 2x with oil parameter
        Overload.yearlyService(20);
        Overload.yearlyService(30);

        System.out.println();
        // calling yearlyService 2x with tire and oil parameters
        Overload.yearlyService(30,40);
        Overload.yearlyService(40,50);

        System.out.println();
        // calling yearlyService 2x with tire, oil and coup parameters
        Overload.yearlyService(50, 30, 30);
        Overload.yearlyService(60, 40, 10);
    }
    // creating yearlyService method with no parameters. Prints and returns cost
    // of serviceCharge set in class variables
    public static int yearlyService(){
        System.out.println("The cost of a service charge is $" + standardService);

        return standardService;
    }
    // Overloading yearlyService with added oil change cost. Prints and returns cost
    // of oil change and standardService
    public static int yearlyService(int oil) {

        System.out.println("The cost of an oil change ($" + oil + ") and service charge " +
                "($" + standardService + ") is $" + (standardService + oil));

        return (oil + standardService);
    }
    // Overloading yearlyService with oil change cost and tire rotation cost. Prints and returns cost
    // of tire rotation, oil change and standardService
    public static int yearlyService(int tire, int oil) {

        System.out.println("The cost of a tire rotation ($" + tire + "), oil change ($" + oil +
                ") and service charge ($" +standardService + ") is $" +
                (tire + oil + standardService));

        return (tire + oil + standardService);
    }
    // Overloading yearlyService with oil change cost, tire rotation cost and subtracts coupon.
    // Prints and returns cost of tire rotation, oil change and standardService and deducts coupon
    public static int yearlyService(int tire, int oil, int coup) {

        System.out.println("The cost of a tire rotation ($" + tire + "), oil change ($" + oil +
                ") and service charge ($" + standardService + ") is $" +
                ((tire + oil + standardService) - coup) + " with a $" +
                coup + " coupon");

        return ((tire + oil + standardService) - coup);
    }
}
