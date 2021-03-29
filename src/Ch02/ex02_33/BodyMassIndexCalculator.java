// Ejercicio 2.33: BodyMassIndexCalculator.java
// Cree una calculadora del BMI que lea el peso del usuario en kilogramos y la altura
// en metros, para que luego calcule y muestre el índice de masa corporal del usuario.
// Muestre además la siguiente información del Departamento de Salud y
// Servicios Humanos/Instituto Nacional de Salud para que el usuario pueda evaluar su BMI:
//
//    VALORES DE BMI
//    Bajo peso: menos de 18.5
//    Normal: entre 18.5 y 24.9
//    Sobrepeso: entre 25 y 29.9
//    Obeso: 30 o más
//
// [Nota: en este capítulo aprendió a usar el tipo int para representar números enteros.
// Cuando se realizan los cálculos del BMI con valores int, se producen resultados en números enteros.
// En el capítulo 3 aprenderá a usar el tipo double para representar a los números con puntos decimales.
// Cuando se realizan los cálculos del BMI con valores double, producen números con puntos decimales;
// a éstos se les conoce como números de “punto flotante”].

package Ch02.ex02_33;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el peso en kg: ");
        int weightInKilograms = input.nextInt();

        System.out.print("Ingrese la altura en metros: ");
        double heightInMeters = input.nextDouble();

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("%nSu indice de masa corporal es %f%n", bmi);
        System.out.printf("%nVALORES DE BMI%n" +
                "Bajo peso: menos de 18.5%n" +
                "Normal: entre 18.5 y 24.9%n" +
                "Sobrepeso: entre 25 y 29.9%n" +
                "Obeso: 30 o más");
    }
}
