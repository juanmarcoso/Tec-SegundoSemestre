/*
Ejercicio 7: Pedir numeros hasta que se introduzca uno negativo y calcular la media
 */
package EjercicicioCiclos;

import java.util.Scanner;

/**
 *
 * @author juan orellana
 */
public class Ej7Scanner {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        int contador = 0;
        float promedio = 0;

        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());

        while (numero >= 0) {

            suma += numero;
            contador++;

            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        
        if (contador == 0){
            System.out.println("Error, no se puede dividir en 0");
        }
        else {
            promedio = (float) suma / contador;
        }

        System.out.println("La cantidad de numeros ingresados es: " + contador);
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La media de los numeros ingresados es: " + promedio);

    }
}
