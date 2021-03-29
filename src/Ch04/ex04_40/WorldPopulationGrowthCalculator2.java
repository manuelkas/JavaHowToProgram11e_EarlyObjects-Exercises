// Exercise 4.40: WorldPopulationGrowthCalculator.java
// Write a program that calculates world population growth each year for the next 75 years, 
// using the simplifying assumption that the current growth rate will stay constant. 
// Print the results in a table. The first column should display the year from year 1 to year 75. 
// The second column should display the anticipated world population at the end of that year. 
// The third column should display the numerical increase in the world population that would occur that year. 
// Using your results, determine the year in which the population would be double what it is today, 
// if this year’s growth rate were to persist.
package Ch04.ex04_40;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        double p = input.nextDouble();
        double initialP = p;
        double nextP;

        System.out.print("Enter the annual world population growth rate (%): ");
        double r = input.nextDouble() * 0.01;
        r = 1 + r;
        short acc = 1;

        System.out.println("\nAP = Anticipated population at the end of year.");
        System.out.println("NI = Numerical increase.\n");
        System.out.println("Year\t AP\t\t\t\t NI\n");
        short twice = 0;
        String twiceMessage = "";

        while (acc <= 75) {
            nextP = p * r;
            double numericalIncrease = nextP - p;
            System.out.printf("%3d %15.0f %12.0f%n", acc, nextP, numericalIncrease);
            p = nextP;
            acc++;

            if (nextP >= initialP * 2) {
                twice++;

                if (twice == 1) {
                    twiceMessage = "\nThe year in which the population size will be double that of today's will be " + (2021 + acc);
                }
            }
        }
        System.out.println(twiceMessage);
    }
}
