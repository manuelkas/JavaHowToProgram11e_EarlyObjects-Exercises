// Exercise 6.8: ParkingCharges.java
// A parking garage charges a $2.00 minimum fee to park for up to three hours.
// The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours.
// The maximum charge for any given 24-hour period is $10.00.
// Assume that no car parks for longer than 24 hours at a time.
// Write an application that calculates and displays the parking charges for each customer
// who parked in the garage yesterday. You should enter the hours parked for each customer.
// The program should display the charge for the current customer and should calculate and
// display the running total of yesterday’s receipts.
// It should use the method calculateCharges to determine the charge for each customer.
package Ch06.ex06_08;

import java.util.Scanner;

public class ParkingCharges {
    // fees
    private static final double MINIMUM_FEE = 2.0;
    private static final double PER_HOUR_FEE = 0.5;
    private static final double MAXIMUM_CHARGE = 10.00;

    // Creates instance of the scanner object to receive data from the user
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the number of Customers that parked for Yesterday: ");
        int customers = input.nextInt();

        // stores total of yesterday’s receipts
        double total = 0.0;

        System.out.println("\nNOTE: Assume that no car parks for longer than 24 hours at a time.");

        // loops over each customer
        for (int i = 1; i <= customers; i++) {
            System.out.printf("Enter the hours parked for the customer %d: ", i);
            int hours = input.nextInt();

            // if number of hours is invalid
            if ((hours < 1) || (hours > 24)) {
                System.out.println("ERROR! Enter a valid number of hours."); // print ERROR message
                i--; // subtracts one in the cycle so that the data entered is not valid.
                continue;
            }
            // sums to the total the calculation of the current customer's charge
            total += calculateCharges(hours);
        } // end of the for loop

        System.out.printf("%n\tRunning total of yesterday’s receipts: $%.2f%n", total);
    }

    // calculates charges
    public static double calculateCharges(int hours) {

        double charge;
        if (hours <= 24 && hours >= 20) {
            charge = MAXIMUM_CHARGE;
        } else if (hours <= 19 && hours >= 4) {
            charge = MINIMUM_FEE + ((hours - 3) * PER_HOUR_FEE);
        } else {
            charge = MINIMUM_FEE;
        }
        return charge;
    }
}
