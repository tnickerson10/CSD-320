/* Travis Nickerson
   Module 2 assignment
   March 24th 2021
   Goal: To ask the user for weight of water in kg, starting temperature and ending temperature
   and then calculate the amount of energy it will take to heat the amount of water given
   input parameters
 */
import java.util.Scanner;

public class EnergyToHeatWater {
    public static void main(String[] args) {
        // create a scanner class
        Scanner input = new Scanner(System.in);
        // ask user for the weight of water to heat in kg
        System.out.println("Please enter the amount of water you want to heat in Kg: ");
        float waterMass = input.nextFloat();
        // ask user for the starting water temperature
        System.out.println("Please enter the starting temperature of the water in Celsius: ");
        float initialTemp = input.nextFloat();
        // ask user for the final water temperature
        System.out.println("Please enter the final temperature you want to heat the water to in Celsius: ");
        float finalTemp = input.nextFloat();
        // calculate energy in joules required to heat from initialTemp to finalTemp
        float energyToHeat = waterMass * (finalTemp - initialTemp) * 4184;
        // output the calculation in a string to properly read data
        System.out.println("It will take " + energyToHeat + " Joules to heat " + waterMass + "Kg of water " +
                "from " + initialTemp + " Celsius to " + finalTemp + " Celsius!" );

    }
}
