// Ejercicio 2.34: WorldPopulationGrowthCalculator
// Use Web para determinar la población mundial actual y la tasa de crecimiento anual de la población mundial.
// Escriba una aplicación que reciba estos valores como entrada y luego muestre la población mundial
// estimada después de uno, dos, tres, cuatro y cinco años.

package Ch02.ex02_34;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Ingrese la poblacion mundial actual: ");
      double p0 = input.nextDouble();

      System.out.print("Ingrese la tasa de crecimiento anual de la poblacion mundial: ");
      double r = input.nextDouble() * 0.01;

      int agnos = 0; // años transcurridos

      // fórmula tasa de crecimiento poblacional compuesto Pn = P0 ( 1 + r )^n.
      double p1 = p0 * Math.pow((1 + r), 1); // población a un año después
      double p2 = p0 * Math.pow((1 + r), 2); // población a dos años después
      double p3 = p0 * Math.pow((1 + r), 3); // población a tres años después
      double p4 = p0 * Math.pow((1 + r), 4); // población a cuatro años después
      double p5 = p0 * Math.pow((1 + r), 5); // población a cinco años después

      System.out.printf("La poblacion a un agno sera: %.0f%n", p1);
      System.out.printf("La poblacion a dos agnos sera: %.0f%n", p2);
      System.out.printf("La poblacion a tres agnos sera: %.0f%n", p3);
      System.out.printf("La poblacion a cuatro agnos sera: %.0f%n", p4);
      System.out.printf("La poblacion a cinco agnos sera: %.0f%n", p5);
   }
}