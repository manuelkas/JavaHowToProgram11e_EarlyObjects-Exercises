// Exercise 4.19: SalesCommissionCalculator.java
// A large company pays its salespeople on a commission basis. The salespeople receive
// $200 per week plus 9% of their gross sales for that week. For example, a salesperson
// who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000,
// or a total of $650. You’ve been supplied with a list of the items sold by each salesperson.
// The values of these items are shown in Fig. 4.33 .
// Develop a Java application that inputs one salesperson’s items sold for last week and calculates
// and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
package Ch04.ex04_19;

import java.util.Scanner;

public class SalesCommissionCalculator {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int item = 1;

      System.out.printf("Enter -1 to quit or the value of item %d: ", item);
      double itemValue = input.nextDouble();
      double earnings = 200.0; // fixed earnings

      while (itemValue != -1){

         earnings += itemValue * 0.09;
         item++;
         System.out.printf("Enter -1 to quit or the value of item %d: ", item);
         itemValue = input.nextDouble();
      }

      System.out.printf("Salesperson's earnings last week: %.2f%n", earnings);
   }
}
