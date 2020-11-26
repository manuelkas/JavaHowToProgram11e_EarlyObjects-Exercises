// 3.13 (Employee Class) Create a class called Employee that includes three instance variables
// —a first name (type String), a last name (type String) and a monthly salary (double).
// Provide a constructor that initializes the three instance variables.
// Provide a set and a get method for each instance variable.
// If the monthly salary is not positive, do not set its value.
// Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
// Create two Employee objects and display each object’s yearly salary.
// Then give each Employee a 10% raise and display each Employee’s yearly salary again.

package Ch03.ex03_13;

public class Employee {
   private String firstName;  // instance variable
   private String lastName;  // instance variable
   private double monthlySalary;  // instance variable

   // Employee constructor that receives three parameters
   public Employee(String firstName, String lastName, double monthlySalary) {
      this.firstName = firstName; // asigns firstName to instance variable firstName
      this.lastName = lastName; // asigns lastName to instance variable lastName

      // validate that the monthlySalary is greater than 0.0; if it's not,
      // instance variable monthly don't set its value.
      if (monthlySalary > 0.0){
         this.monthlySalary = monthlySalary;
      }
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

   public double getMonthlySalary() {
      return monthlySalary;
   }

   public void setMonthlySalary(double monthlySalary) {
      // validate that the monthlySalary is greater than 0.0; if it's not,
      // instance variable monthly don't set its value.
      if (monthlySalary > 0.0){
         this.monthlySalary = monthlySalary;
      }
   }
}