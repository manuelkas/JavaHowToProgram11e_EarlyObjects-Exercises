// Ejercicio 2.29: IntegerValueOfACharacter.java
// escriba una aplicación que muestre los equivalentes enteros de
// algunas letras en mayúsculas, en minúsculas, dígitos y símbolos especiales.
// Muestre los equivalentes enteros de los siguientes caracteres:
// A B C a b c 0 1 2 $ * + / y el caracter en blanco.
package Ch02.ex02_29;

import java.util.Scanner;

public class IntegerValueOfACharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("El caracter %c tiene el valor %d%n", 'A', ((int) 'A'));
        System.out.printf("El caracter %c tiene el valor %d%n", 'B', ((int) 'B'));
        System.out.printf("El caracter %c tiene el valor %d%n", 'C', ((int) 'C'));
        System.out.printf("El caracter %c tiene el valor %d%n", 'a', ((int) 'a'));
        System.out.printf("El caracter %c tiene el valor %d%n", 'b', ((int) 'b'));
        System.out.printf("El caracter %c tiene el valor %d%n", 'c', ((int) 'c'));
        System.out.printf("El caracter %c tiene el valor %d%n", '0', ((int) '0'));
        System.out.printf("El caracter %c tiene el valor %d%n", '1', ((int) '1'));
        System.out.printf("El caracter %c tiene el valor %d%n", '2', ((int) '2'));
        System.out.printf("El caracter %c tiene el valor %d%n", '$', ((int) '$'));
        System.out.printf("El caracter %c tiene el valor %d%n", '*', ((int) '*'));
        System.out.printf("El caracter %c tiene el valor %d%n", '+', ((int) '+'));
        System.out.printf("El caracter %c tiene el valor %d%n", '/', ((int) '/'));
        System.out.printf("El caracter %c tiene el valor %d%n", ' ', ((int) ' '));
    }
}
