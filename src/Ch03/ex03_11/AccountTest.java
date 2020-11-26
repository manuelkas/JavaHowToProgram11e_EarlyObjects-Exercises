// Exercise 3.11: Account.java
// Modify class Account (Fig. 3.8 ) to provide a method called withdraw that withdraws
// money from an Account. Ensure that the withdrawal amount does not exceed the Account’s balance.
// If it does, the balance should be left unchanged and the method should print a message
// indicating "Withdrawal amount exceeded account balance."
// Modify class AccountTest (Fig. 3.9 ) to test method withdraw.
package Ch03.ex03_11;

import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args) {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53);

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance());

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account1 balance%n%n",
         depositAmount);
      account1.deposit(depositAmount); // add to account1's balance

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance());

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n",
         depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance());

      System.out.print("Enter withdraw amount for account1: "); // prompt
      double withdrawAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nsubtracting %.2f to account1 balance%n%n",
         withdrawAmount);
      account1.withdraw(withdrawAmount); // add to account1's balance

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance());

      System.out.print("Enter withdraw amount for account2: "); // prompt
      withdrawAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nsubtracting %.2f to account2 balance%n%n",
         withdrawAmount);
      account2.withdraw(withdrawAmount); // add to account2's balance

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance());
   }
}