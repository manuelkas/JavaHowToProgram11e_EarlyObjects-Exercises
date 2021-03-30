// Excercise 5.17: CalculatingSales.java
// An online retailer sells five products whose retail prices are as follows:
// Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
// Write an application that reads a series of pairs of numbers as follows:
//
//      product number
//      quantity sold
//
//Your program should use a switch statement to determine the retail price for each product.
// It should calculate and display the total retail value of all products sold.
// Use a sentinel-controlled loop to determine when the program should stop looping and display the final results.
package Ch05.ex05_17;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int productNumber;
        int quantity;
        double totalRetail = 0;

        System.out.printf("%s%n%s%n %s%n %s%n %s%n %s%n %s%n%n",
                "Enter the product number.",
                "Or type any another number to stop and display the final results.",
                "1: product 1, $2.98",
                "2: product 2, $4.50",
                "3: product 3, $9.98",
                "4: product 4, $4.49",
                "5: product 5, $6.87");

        System.out.print("Product number?: ");
        productNumber = input.nextInt();

        while ((productNumber >= 1) && (productNumber <= 5)) {
            System.out.print("      Quantity?: ");
            quantity = input.nextInt();

            switch (productNumber) {
                case 1:
                    totalRetail += quantity * 2.98;
                    break;
                case 2:
                    totalRetail += quantity * 4.50;
                    break;
                case 3:
                    totalRetail += quantity * 9.98;
                    break;
                case 4:
                    totalRetail += quantity * 4.49;
                    break;
                case 5:
                    totalRetail += quantity * 6.87;
                    break;
            }
            System.out.print("\nProduct number?: ");
            productNumber = input.nextInt();
        } // end while loop

        System.out.printf("\n\t-----> Total retail: $%,.2f%n", totalRetail);
    }
}
