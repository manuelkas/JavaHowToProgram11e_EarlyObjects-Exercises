// Exercise 5.18: ModifiedCompoundInterestProgram.java
// the application in Fig. 5.6 to use only integers to calculate the compound interest.
// [Hint: Treat all monetary amounts as integral numbers of pennies.
// Then break the result into its dollars and cents portions by using the division and
// remainder operations, respectively. Insert a period between the dollars and the cents portions.]
package Ch05.ex05_18;

public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {

        int principal = 100000; // initial amount before interest
        int rate = 5; // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; ++year) {
            // calculate new amount on deposit for specified year
            int amount = (principal * (100 + rate)) / 100;
            principal = amount;

            // display the year and the amount
            System.out.printf("%4d%,17d,%d%n", year, amount / 100, amount % 100);
        }
    }
}
