// Exercise 4.19: SalesCommissionCalculator.java
// A large company pays its salespeople on a commission basis.
// The salespeople receive $200 per week plus 9% of their gross sales for that week.
// For example, a salesperson who sells $5,000 worth of merchandise in a week receives $200
// plus 9% of $5,000, or a total of $650. You’ve been supplied with a list of the items sold
// by each salesperson. The values of these items are shown in Fig. 4.33 .
// Develop a Java application that inputs one salesperson’s items sold for last week and
// calculates and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
package Ch04.ex04_19;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;

        while (counter != -1){
            double earnings = 200; // initial value of salesperson earnings
            System.out.print("Enter how many items 1 was sold: ");
            int item1Quantity = input.nextInt();
            earnings += item1Quantity * 239.99 * .09; //adds the 9% of item value  * quantity of item to earnings
            System.out.print("Enter how many items 2 was sold: ");
            int item2Quantity = input.nextInt();
            earnings += item2Quantity * 129.75 * .09; //adds the 9% of item value  * quantity of item to earnings
            System.out.print("Enter how many items 3 was sold: ");
            int item3Quantity = input.nextInt();
            earnings += item3Quantity * 99.95 * .09; //adds the 9% of item value  * quantity of item to earnings
            System.out.print("Enter how many items 4 was sold: ");
            int item4Quantity = input.nextInt();
            earnings += item4Quantity * 350.89 * .09; //adds the 9% of item value  * quantity of item to earnings

            System.out.printf("The salesperson’s earnings for the week are: $%.2f%n%n", earnings);

            System.out.print("Enter 1 to calculate more earnings or -1 to quit: ");
            counter = input.nextInt();
        }
    }
}
