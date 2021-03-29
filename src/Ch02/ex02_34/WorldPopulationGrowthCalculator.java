// Ejercicio 2.34: WorldPopulationGrowthCalculator.java
// Use Web para determinar la población mundial actual y la tasa de crecimiento anual de la población mundial.
// Escriba una aplicación que reciba estos valores como entrada y luego muestre la población mundial
// estimada después de uno, dos, tres, cuatro y cinco años.

package Ch02.ex02_34;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la poblacion mundial actual: ");
        double p = input.nextDouble();

        System.out.print("Ingrese la tasa de crecimiento anual de la poblacion mundial (%): ");
        double r = input.nextDouble() * 0.01;
        r = 1 + r;

        System.out.printf("La poblacion a un agno sera: %.0f%n", p * r);
        System.out.printf("La poblacion a dos agnos sera: %.0f%n", p * r * r);
        System.out.printf("La poblacion a tres agnos sera: %.0f%n", p * r * r * r);
        System.out.printf("La poblacion a cuatro agnos sera: %.0f%n", p * r * r * r * r);
        System.out.printf("La poblacion a cinco agnos sera: %.0f%n", p * r * r * r * r * r);
    }
}