/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100,
luego ir pidiendo numeros indicando "es mayor" o "es menor"
segun sea mayor o menor con respecto a N. 
El proceso termina cuando el usuario acierta y mostramos la cantidad de intentos. 
 */
package Ejercicios5Ciclos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juan orellana
 */
public class Ej5Scanner {

    public static void main(String[] args) {
        //Necesito importar el aleatorio
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int aleatorio = random.nextInt(101);
        int numero;
        int contador = 1; // La inicializo en 1 para tomar la primera desicion del usuario

        System.out.println("Ingrese un numero para empezar a jugar que este entre 0 y 100");
        numero = Integer.parseInt(entrada.nextLine());

        while (numero != aleatorio) {
            if (numero > aleatorio) {
                System.out.println("El numero ingresado es mayor. Ingrese otro: ");
                numero = Integer.parseInt(entrada.nextLine());
            }
            else{
                System.out.println("El numero ingresado es mas chico. Siga intentando: ");
                numero = Integer.parseInt(entrada.nextLine());
            }
            contador++;
        }
        System.out.println("Usted acerto despues de " +contador + " intentos2" );
    }

}
