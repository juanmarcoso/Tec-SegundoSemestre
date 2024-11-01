/*
Ejercicio 6: Pedir numeros hasta que se teclee un 0
mostrar la suma de todos los numeros introducidos
*/
package Clases;

import java.util.Scanner;

/**
 *
 * @author juan orellana
 */
public class Ej6Scanner {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 1;

        System.out.println("Ingresar numeros hasta que se teclee un 0");
        numero = Integer.parseInt(entrada.nextLine());
        int suma = numero;
        while (numero != 0) {
            
            System.out.println("Ingrese otro numero hasta que se teclee 0");
            numero = Integer.parseInt(entrada.nextLine());

            suma += numero;
            contador++;
        }
        
        System.out.println("Usted ingreso " + contador + " numeros");
        System.out.println("La suma de los mismos es: " + suma);
        
    }
}
