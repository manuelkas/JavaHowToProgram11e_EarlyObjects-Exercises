// Exercise 5.20: CalculatingTheValueOfPI.java
// Calculate the value of from the infinite series
//  π=4−(4/3)+(4/5)−(4/7)+(4/9)−(4/11)+⋯
package Ch05.ex05_20;

public class CalculatingTheValueOfPI {
    public static void main(String[] args) {

        double pi = 4; // initial estimate value of PI
        byte op = 0; // operation
        int count = 0; // count terms
        int x = 1;
        int firstFound = 0;

        for(int i = 3; i <= 400000; i += 2){

            if (op == 0 ){
                pi -= 4 / (double)i;
                op++;
                count++;
            }
            else {
                pi += 4 / (double)i;
                op--;
                count++;
            }

            if ( Math.abs(pi - 3.14159) <= 0.000005) // Closest to 3.14159
            {
                while (x > 0)
                {
                    firstFound = count;
                    x--;
                }
            }

            System.out.printf("%f  ", pi);

            // jump to the next line
            if (count % 16 == 0){
                System.out.println();
            }
        }

        System.out.printf("%n%nThe first term where the value is 3.14159 is %d%n", firstFound);
    }
}
