/*
Ejercicio 8: Pedir un numero N, y mostrar todos los numeros del 1 al N
 */
package Ejercicio8Ciclos;

import java.util.Scanner;

/**
 *
 * @author juan orellana
 */
public class Ej8Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        numero = Integer.parseInt(entrada.nextLine());
        
        if (numero > 0) {
            for (int i = 0; i <= numero; i++) {
                System.out.println("i = " + i);
            }
        }
        
    }
}
