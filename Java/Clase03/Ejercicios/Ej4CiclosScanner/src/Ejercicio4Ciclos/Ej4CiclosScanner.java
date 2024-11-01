/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, 
mostrar cuantos numeros se han introducido. 
 */
package Ejercicio4Ciclos;

import java.util.Scanner;

/**
 *
 * @author Juan Orellana
 */
public class Ej4CiclosScanner {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int contador = 0;
        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(entrada.nextLine());
        
        while (numero > 0) {
            System.out.println("Ingrese otro numero. Sale con un numero negativo: ");
            numero = Integer.parseInt(entrada.nextLine());
            contador++;
        }
        System.out.println("Usted ingreso " + contador + " numeros");
    }
    
}
