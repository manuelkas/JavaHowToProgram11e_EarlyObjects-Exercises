// Ejercicio 2.31: TableOfSquaresAndCubes.java
// Utilizando sólo las técnicas de programación que aprendió en este capítulo,
// escriba una aplicación que calcule los cuadrados y cubos de los números del 0 al 10,
// y que imprima los valores resultantes en formato de tabla, como se muestra a continuación.
// número   cuadrado   cubo
// 0        0          0
// 1        1          1
// 2        4          8
// 3        9          27
// 4        16         64
// 5        25         125
// 6        36         216
// 7        49         343
// 8        64         512
// 9        81         729
//10        100        1000

package Ch02.ex02_31;

public class TableOfSquaresAndCubes {
    public static void main(String[] args) {
        System.out.printf("numero   cuadrado   cubo%n");
        System.out.printf("%d        %d          %d%n", 0, 0 * 0, 0 * 0 * 0);
        System.out.printf("%d        %d          %d%n", 1, 1 * 1, 1 * 1 * 1);
        System.out.printf("%d        %d          %d%n", 2, 2 * 2, 2 * 2 * 2);
        System.out.printf("%d        %d          %d%n", 3, 3 * 3, 3 * 3 * 3);
        System.out.printf("%d        %d         %d%n", 4, 4 * 4, 4 * 4 * 4);
        System.out.printf("%d        %d         %d%n", 5, 5 * 5, 5 * 5 * 5);
        System.out.printf("%d        %d         %d%n", 6, 6 * 6, 6 * 6 * 6);
        System.out.printf("%d        %d         %d%n", 7, 7 * 7, 7 * 7 * 7);
        System.out.printf("%d        %d         %d%n", 8, 8 * 8, 8 * 8 * 8);
        System.out.printf("%d        %d         %d%n", 9, 9 * 9, 9 * 9 * 9);
        System.out.printf("%d       %d        %d%n", 10, 10 * 10, 10 * 10 * 10);
    }
}