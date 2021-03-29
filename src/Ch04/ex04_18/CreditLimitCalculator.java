// Exercise 4.18: CreditLimitCalculator.java
// Develop a Java application that determines whether any of several department-store
// customers has exceeded the credit limit on a charge account.
// For each customer, the following facts are available:
//
//    account number
//    balance at the beginning of the month
//    total of all items charged by the customer this month
//    total of all credits applied to the customer’s account this month
//    allowed credit limit.
//
// The program should input all these facts as integers, calculate the new balance
// (= beginning balance + charges – credits), display the new balance and determine
// whether the new balance exceeds the customer’s credit limit.
// For those customers whose credit limit is exceeded, the program should display the message
// "Credit limit exceeded".
package Ch04.ex04_18;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer account information");
        System.out.print("Account number or -1 to quit: ");
        int accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.print("Balance at the beginning of the month: $");
            int initialBalance = input.nextInt();
            System.out.print("Total of items charged this month: $");
            int totalCharged = input.nextInt();
            System.out.print("Total of credits applied this month: $");
            int totalCredits = input.nextInt();
            System.out.print("Allowed credit limit: $");
            int creditLimit = input.nextInt();

            int newBalance = initialBalance + totalCharged - totalCredits;

            System.out.printf("The new balance is: $%d%n ", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println("Enter customer account information");
            System.out.print("Account number or -1 to quit: ");
            accountNumber = input.nextInt();
        }
    }
}
