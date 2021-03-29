// exercise 3.16: TargetHeartRateCalculator
// Create a class called HeartRates. The class attributes should include
// the person’s first name, last name and date of birth
// (consisting of separate attributes for the month, day and year of birth).
// Your class should have a constructor that receives this data as parameters.
// For each attribute provide set and get methods.
// The class also should include a method that calculates and returns the person’s age (in years),
// a method that calculates and returns the person’s maximum heart rate and a method that calculates
// and returns the person’s target heart rate.
// Write a Java app that prompts for the person’s information, instantiates an object
// of class HeartRates and prints the information from that object—including the person’s
// first name, last name and date of birth—then calculates and prints the person’s age in (years),
// maximum heart rate and target-heart-rate range.
package Ch03.ex03_16;

import java.util.Calendar;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;

    public HeartRates(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge() {
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        int ageInYears = currentYear - yearOfBirth;

        if (currentMonth == monthOfBirth) {
            if (currentDay < dayOfBirth) {
                ageInYears = ageInYears - 1;
            }
        }
        return ageInYears;
    }

    public int getMaxHeartRate(int ageInYears) {
        return (220 - ageInYears);
    }

    public String getTargetHeartRate(int maxHeartRate) {
        return String.format("%.2f - %.2f", maxHeartRate * 0.50, maxHeartRate * 0.85);
    }
}
