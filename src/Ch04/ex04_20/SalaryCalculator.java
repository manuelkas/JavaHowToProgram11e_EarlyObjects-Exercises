// Exercise 4.20: SalaryCalculator.java
// Develop a Java application that determines the gross pay for each of three employees.
// The company pays straight time for the first 40 hours worked by each employee and time
// and a half for all hours worked in excess of 40. You’re given a list of the employees,
// their number of hours worked last week and their hourly rates.
// Your program should input this information for each employee,
// then determine and display the employee’s gross pay. Use class Scanner to input the data.
package Ch04.ex04_20;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 1;

        while (n <= 3) {

            System.out.print("Enter hourly wage rate: ");
            double rate = input.nextDouble();

            System.out.printf("Enter the number of hours worked by the employee%d: ", n);
            int hours = input.nextInt();

            System.out.printf("the employee%d's salary is: ", n);

            if (hours <= 40) {
                System.out.printf("Total earnings: $%.2f%n", hours * rate);
            } else {
                System.out.printf("Total earnings: $%.2f%n", (40 * rate) + ((hours - 40) * (rate * 1.5)));
            }

            n++;
            System.out.println();
        }
    }
}