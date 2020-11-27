package Ch03.ex03_16;

import java.lang.instrument.ClassDefinition;
import java.util.Calendar;
import java.util.Scanner;

public class TargetHeartRateCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("First name: "); // prompt
      String firstName = input.nextLine();
      System.out.print("Second name: ");
      String lastName = input.nextLine();
      System.out.print("Month of birth: ");
      int monthOfBirth = input.nextInt();
      System.out.print("Day of birth: ");
      int dayOfBirth = input.nextInt();
      System.out.print("Year of birth: ");
      int yearOfBirth = input.nextInt();

      // creates an HeartRates object called person1
      HeartRates person1 = new HeartRates(firstName, lastName, monthOfBirth, dayOfBirth, yearOfBirth);

      // displays person1 information
      System.out.println("Information heart rate");
      System.out.printf("Full Name: %s%s%n", person1.getFirstName(), person1.getLastName());
      System.out.printf("Date of birth: %d / %d / %d%n",
         person1.getMonthOfBirth(), person1.getDayOfBirth(), person1.getYearOfBirth());

      int ageInYears = person1.getAge(); // holds call to getAge in variable
      System.out.printf("Age: %d years%n", ageInYears);

      int maxHeartRate = person1.getMaxHeartRate(ageInYears); // uses variable ageInYears as parameter
      System.out.printf("Maximum heart rate: %d%n", maxHeartRate);

      String targetHeartRate = person1.getTargetHeartRate(maxHeartRate);
      System.out.printf("Target-heart-rate range: %s%n",targetHeartRate);
   }
}