// Ejercicio 2.28: DiameterCircumferenceAndAreaOfACircle.java
// Escriba una aplicación que reciba del usuario el radio de un círculo como un entero,
// y que imprima el diámetro, la circunferencia y el área del círculo mediante el uso del
// valor de punto flotante 3.14159 para π. Use las técnicas que se muestran en la figura 2.7
// [nota: también puede utilizar la constante predefinida Math.PI para el valor de π.
// Esta constante es más precisa que el valor 3.14159. La clase Math se define en el paquete java.lang.
// Las clases en este paquete se importan de manera automática, por lo que no necesita importar la clase
// Math mediante la instrucción import para usarla]. Use las siguientes fórmulas (r es el radio):
//    diámetro = 2r
//    circunferencia a = 2πr
//    área a = πr2
// No almacene los resultados de cada cálculo en una variable. En vez de ello, especifique cada cálculo
// como el valor que se imprimirá en una instrucción System.out.printf.
// Los valores producidos por los cálculos del área y de la circunferencia son números de punto flotante.
// Dichos valores pueden imprimirse con el especificador de formato %f en una
// instrucción System.out.printf. En el capítulo 3 aprenderá más acerca de los números de punto flotante.


package Ch02.ex02_28;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio (como entero): ");
        int r = input.nextInt();

        System.out.printf("El diametro es: %d%n", r * 2);
        System.out.printf("La circunferencia es: %f%n", 2 * Math.PI * r);
        System.out.printf("El area es: %f%n", Math.PI * (r * r));


    }
}
