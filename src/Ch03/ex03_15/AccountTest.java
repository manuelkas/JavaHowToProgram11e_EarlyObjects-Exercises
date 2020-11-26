// In the AccountTest class of Fig. 3.9 , method main contains six statements
// (lines 11–12, 13–14, 26–27, 28–29, 38–39 and 40–41) that each display an Account object’s name and balance.
// In this exercise, you’ll define a new displayAccount method that contains one copy of that output statement.
// The method’s parameter will be an Account object and the method will output the object’s name and balance.
// You’ll then replace the six duplicated statements in main with calls to displayAccount,
// passing as an argument the specific Account object to output.
package Ch03.ex03_15;

import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args) {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53);

      // display initial balance of each object
      displayAccount(account1);
      displayAccount(account2);

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account1 balance%n%n",
         depositAmount);
      account1.deposit(depositAmount); // add to account1's balance

      // display balances
      displayAccount(account1);
      displayAccount(account2);

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n",
         depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

      // display balances
      displayAccount(account1);
      displayAccount(account2);
   }

   // method that displays name and balance
   public static void displayAccount(Account accountToDisplay) {
      System.out.printf("%s balance: $%.2f%n",
         accountToDisplay.getName(), accountToDisplay.getBalance());
   }
}