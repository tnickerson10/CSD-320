public class Overloading {

    public static void main(String[] args) {
        System.out.println("The cost of a service charge is $" + Overloading.yearlyService());
        System.out.println("The cost of a service charge is $" + Overloading.yearlyService());
        System.out.println("The cost of an oil change with service charge is $" + Overloading.yearlyService(40));
        System.out.println("The cost of an oil change with service charge is $" + Overloading.yearlyService(50));
        System.out.println("The cost of a tire rotation and oil change with service fee is $" +
                Overloading.yearlyService(50, 60));
        System.out.println("The cost of a tire rotation and oil change with service fee is $" +
                Overloading.yearlyService(30, 50));
        System.out.println("The cost of a tire rotation, oil change, and service charge with a coupon is $"
                + Overloading.yearlyService(60,60,10));
        System.out.println("The cost of a tire rotation, oil change, and service charge with a coupon is $"
                + Overloading.yearlyService(50,50,30));
    }
    public static double yearlyService() {
        double standardService = 10;
        return standardService;
    }
    public static double yearlyService(double oil) {
        double oilChange = oil;
        return (oilChange + Overloading.yearlyService());

    }
    public  static double yearlyService(double oil, double tire) {
        double tireChange = tire;
        return (tireChange + Overloading.yearlyService(oil));
    }
    public  static double yearlyService(double oil, double tire, double coup) {
        double coupon = coup;
        return ((Overloading.yearlyService(oil) + Overloading.yearlyService(tire)) - Overloading.yearlyService(coup));
    }

}
