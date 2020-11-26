// Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
package Ch03.ex03_12;

import java.util.Scanner;

public class InvoiceTest {
   public static void main(String[] args) {
      Invoice invoice1 = new Invoice("0001", "Phillips screwdriver",3, 4.6);
      Invoice invoice2 = new Invoice("0002", "liter red paint",-3, 3.5);

      // testing getInvoiceAmount
      // with invoice1
      System.out.println("INVOCE 1 #########################################");
      System.out.println("Part Number  Description           quantity  price");
      System.out.printf("%s         %s  %d         %.2f%n",
         invoice1.getPartNumber(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getPrice());
      System.out.printf("The amount is: $%.2f%n%n", invoice1.getInvoiceAmount());

      //with invoice2
      System.out.println("INVOCE 2 ########################################");
      System.out.println("Part Number  Description           quantity  price");
      System.out.printf("%s         %s       %d        %.2f%n",
         invoice2.getPartNumber(), invoice2.getDescription(), invoice2.getQuantity(), invoice2.getPrice());
      System.out.printf("The amount is: $%.2f%n", invoice2.getInvoiceAmount());

      Scanner input = new Scanner(System.in);

      System.out.println();
      System.out.println("Enter the invoice data1");
      System.out.print("Part Number: ");
      String partNumber = input.nextLine(); // obtains user input
      invoice1.setPartNumber(partNumber); // sends it as argument to setPartNumber in invoice1

      System.out.print("Description: ");
      String description = input.nextLine(); // obtains user input
      invoice1.setDescription(description); // sends it as argument to setDescription in invoice1

      System.out.print("Quantity: ");
      int quantity = input.nextInt(); // obtains user input
      invoice1.setQuantity(quantity); // sends it as argument to setQuantity in invoice1

      System.out.print("price: ");
      double price = input.nextDouble(); // obtains user input
      invoice1.setPrice(price); // sends it as argument to setPrice in invoice1

      // print invoice1
      System.out.println("\nGenerating invoice1 again...");
      System.out.println("INVOCE 1 #########################################");
      System.out.println("Part Number  Description           quantity  price");
      System.out.printf("%s         %s    %d         %.2f%n",
         invoice1.getPartNumber(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getPrice());
      System.out.printf("The invoice1 amount is: $%.2f%n%n", invoice1.getInvoiceAmount());
   }
}