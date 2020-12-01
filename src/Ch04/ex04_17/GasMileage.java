// Exercise 4.17: GasMileage.java
// Drivers are concerned with the mileage their automobiles get. One driver has kept track of
// several trips by recording the miles driven and gallons used for each tankful.
// Develop a Java application that will input the miles driven and gallons used (both as integers)
// for each trip. The program should calculate and display the miles per gallon obtained for each
// trip and print the combined miles per gallon obtained for all trips up to this point.
// All averaging calculations should produce floating-point results.
// Use class Scanner and sentinel-controlled iteration to obtain the data from the user.
package Ch04.ex04_17;

import java.util.Scanner;

public class GasMileage {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int totalMiles = 0;
      int totalGallons = 0;

      System.out.print("Enter miles for trip or -1 to quit: ");
      int miles = input.nextInt();

      while (miles != -1){

         totalMiles += miles;
         System.out.print("Enter gallons of gas: ");
         int gallons = input.nextInt();
         totalGallons += gallons;

         System.out.printf("Miles per gallon on this trip: %.2f%n", (double) miles / gallons);
         System.out.printf("Combined miles per gallon driven so far: %.2f%n%n", (double) totalMiles / totalGallons);

         System.out.print("Enter miles for trip or -1 to quit: ");
         miles = input.nextInt();
      }
   }
}