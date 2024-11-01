/*
Ejercicio 3: Leer numeros hasta que se introduzca un cero. 
Para cada uno indicar si es par o impar. 
 */
package ej3cicloscanner;

import java.util.Scanner;

public class Ej3CicloScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(entrada.nextLine());

        while (numero != 0) {

            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par");
                System.out.println("Ingrese otro numero");
                numero = Integer.parseInt(entrada.nextLine());
            } else {
                System.out.println("El numero " + numero + " es impar");
                System.out.println("Ingrese otro numero");
                numero = Integer.parseInt(entrada.nextLine());
            }
        }
        System.out.println("Usted ingreso " + numero + " para salir del programa");
    }

}
