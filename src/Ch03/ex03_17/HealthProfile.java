package Ch03.ex03_17;

import java.util.Calendar;

public class HealthProfile {

   private String firstName, lastName, gender;
   private int monthOfBirth, dayOfBirth, yearOfBirth;
   private double heightInCm, weightInKg;

   public HealthProfile(String firstName, String lastName, String gender, int monthOfBirth,
                        int dayOfBirth, int yearOfBirth, double heightInCm, double weightInKg) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.monthOfBirth = monthOfBirth;
      this.dayOfBirth = dayOfBirth;
      this.yearOfBirth = yearOfBirth;
      this.heightInCm = heightInCm;
      this.weightInKg = weightInKg;
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

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
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

   public double getHeightInCm() {
      return heightInCm;
   }

   public void setHeightInCm(double heightInCm) {
      this.heightInCm = heightInCm;
   }

   public double getWeightInKg() {
      return weightInKg;
   }

   public void setWeightInKg(double weightInKg) {
      this.weightInKg = weightInKg;
   }

   public int getAge(){
      int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
      int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
      int currentYear = Calendar.getInstance().get(Calendar.YEAR);

      int ageInYears = currentYear - yearOfBirth;

      if (currentMonth == monthOfBirth){
         if(currentDay < dayOfBirth){
            ageInYears = ageInYears - 1;
         }
      }
      return ageInYears;
   }

   public int getMaxHeartRate(int ageInYears){
      return (220 - ageInYears);
   }

   public String getTargetHeartRate(int maxHeartRate){
      return String.format("%.2f - %.2f", maxHeartRate * 0.50, maxHeartRate * 0.85);
   }

   public double getBMI(){
      return weightInKg / ((heightInCm * heightInCm) / 10000);
   }
}
