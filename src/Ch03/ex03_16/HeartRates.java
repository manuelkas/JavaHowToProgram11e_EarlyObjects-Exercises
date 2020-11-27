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
}
