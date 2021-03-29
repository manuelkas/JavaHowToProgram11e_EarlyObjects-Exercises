// Ejercicio 2.35: CarPoolSavingsCalculator.java
// Cree una aplicación que calcule su costo diario al conducir su automóvil,
// de modo que pueda estimar cuánto dinero puede ahorrar si comparte los viajes en automóvil,
// lo cual también tiene otras ventajas, como la reducción de las emisiones de carbono y
// la reducción de la congestión de tráfico. La aplicación debe recibir como entrada
// la siguiente información y mostrar el costo por día para el usuario por conducir al trabajo:
//   a) Total de kilómetros conducidos por día.
//   b) Costo por litro de gasolina.
//   c) Promedio de kilómetros por litro.
//   d) Cuotas de estacionamiento por día.
//   e) Peaje por día.
package Ch02.ex02_35;

import java.util.Scanner;

public class CarPoolSavingsCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Total de km conducidos por dia?: ");
        float kmDriven = input.nextFloat();
        System.out.print("Costo por litro de gasolina?: ");
        float costLGas = input.nextFloat();
        System.out.print("Promedio de km por litro?: ");
        float kmL = input.nextFloat();
        System.out.print("Cuota de estacionamiento por dia?: ");
        float parkingFees = input.nextFloat();
        System.out.print("Peaje por dia?: ");
        float toll = input.nextFloat();

        float drivingCost = kmDriven * (costLGas / kmL) + parkingFees + toll;

        System.out.printf("El costo de manejar por un dia es: %.2f%n", drivingCost);
    }
}
