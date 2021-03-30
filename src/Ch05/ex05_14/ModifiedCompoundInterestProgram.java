// Exercise 5.14: ModifiedCompoundInterestProgram.java
// Modify the compound-interest application of Fig. 5.6 to repeat its steps
// for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to vary the interest rate.
package Ch05.ex05_14;

public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount before interest
        double rate = 1.05; // interest rate, in this case 5%

        for (int i = 5; i <= 10; i++) {

            // display headers
            System.out.printf("%n%s%d%s%n", "Interest Rate: ", i, "%");
            System.out.printf("%s%20s%n", "Year", "Amount on deposit");
            // calculate amount on deposit for each of ten years
            for (int year = 1; year <= 10; ++year) {
                // calculate new amount on deposit for specified year
                double amount = principal * Math.pow(rate, year);

                // display the year and the amount
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
            // interest rate increases by one percent
            rate += 0.01;
        }

    }
}
