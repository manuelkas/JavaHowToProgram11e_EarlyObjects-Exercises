// Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
// Create two Employee objects and display each object’s yearly salary.
// Then give each Employee a 10% raise and display each Employee’s yearly salary again.
package Ch03.ex03_13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Manuel", "Castro", 1000);
        Employee employee2 = new Employee("Yira", "Pérez", 4980);

        // display yearly salary of each object
        System.out.printf("%s %s's yearly salary is: $ %.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("%s %s's yearly salary is: $ %.2f%n%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);

        // raised monthly salary by 10%
        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10);

        // display new yearly salaries
        System.out.println("Salaries have been raised 10%.");
        System.out.printf("%s %s's yearly salary is: $ %.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("%s %s's yearly salary is: $ %.2f%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);
    }
}
