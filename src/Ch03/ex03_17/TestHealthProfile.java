// Computerazation of Health Records
// In this exercise, you’ll design a “starter” HealthProfile class for a person.
// The class attributes should include the person’s first name, last name, gender,
// date of birth (consisting of separate attributes for the month,
// day and year of birth), height (in cm) and weight (in kg).
// Your class should have a constructor that receives this data.
// For each attribute, provide set and get methods.
// The class also should include methods that calculate and return
// the user’s age in years, maximum heart rate and target-heart-rate range (see Exercise 3.16 ),
// and body mass index (BMI; see Exercise 2.33 ).
// Write a Java app that prompts for the person’s information,
// instantiates an object of class HealthProfile for that person and prints the information
// from that object—including the person’s first name, last name, gender, date of birth,
// height and weight—then calculates and prints the person’s age in years,
// BMI, maximum heart rate and target-heart-rate range.
// It should also display the BMI values chart from Exercise 2.33 .
package Ch03.ex03_17;

import java.util.Scanner;

public class TestHealthProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First name: "); // prompt
        String firstName = input.nextLine();
        System.out.print("Second name: ");
        String lastName = input.nextLine();
        System.out.print("Gender: ");
        String gender = input.nextLine();
        System.out.print("Month of birth: ");
        int monthOfBirth = input.nextInt();
        System.out.print("Day of birth: ");
        int dayOfBirth = input.nextInt();
        System.out.print("Year of birth: ");
        int yearOfBirth = input.nextInt();
        System.out.print("Height (in cm): ");
        double heightInCm = input.nextDouble();
        System.out.print("Weight (in kg): ");
        double weightInKg = input.nextDouble();
        System.out.println();

        // creates person1
        HealthProfile person1 = new HealthProfile(firstName, lastName, gender,
                monthOfBirth, dayOfBirth, yearOfBirth, heightInCm, weightInKg);

        // displays person1 information
        System.out.println("======== Personal Information ========");
        System.out.printf("Full Name: %s %s%n", person1.getFirstName(), person1.getLastName());
        System.out.printf("Gender: %s%n", person1.getGender());
        System.out.printf("Date of birth: %d/%d/%d%n",
                person1.getMonthOfBirth(), person1.getDayOfBirth(), person1.getYearOfBirth());
        System.out.printf("Height: %.0f cm%n", person1.getHeightInCm());
        System.out.printf("Weight: %.1f kg%n", person1.getWeightInKg());
        System.out.println();

        System.out.println("====== More personal Information ======");
        int ageInYears = person1.getAge(); // holds call to getAge in variable
        System.out.printf("Age: %d years%n", ageInYears);
        System.out.printf("BMI: %.2f%n", person1.getBMI());

        int maxHeartRate = person1.getMaxHeartRate(ageInYears); // uses variable ageInYears as parameter
        System.out.printf("Maximum heart rate: %d%n", maxHeartRate);

        String targetHeartRate = person1.getTargetHeartRate(maxHeartRate);
        System.out.printf("Target-heart-rate range: %s%n", targetHeartRate);
        System.out.println("\nBMI Categories -----------------\r\n" + "Underweight =< 18.5\r\n" +
                "Normal weight = 18.5–24.9\r\n" + "Overweight = 25–29.9\r\n" + "Obesity = BMI of 30 or greater");
    }
}