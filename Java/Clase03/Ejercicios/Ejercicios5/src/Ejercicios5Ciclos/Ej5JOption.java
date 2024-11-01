/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100,
luego ir pidiendo numeros indicando "es mayor" o "es menor"
segun sea mayor o menor con respecto a N. 
El proceso termina cuando el usuario acierta y mostramos la cantidad de intentos. 
 */
package Ejercicios5Ciclos;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author juan orellana
 */
public class Ej5JOption {
    public static void main(String[] args) {
        Random random = new Random();
        
        int aleatorio = random.nextInt(101);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 100 para empezar a jugar"));
        int contador = 1;
        
        while (numero != aleatorio){
            if (numero > aleatorio){
                numero = Integer.parseInt(JOptionPane.showInputDialog("El numero es mayor. Ingrese otro numero"));
            }
            else{
                numero = Integer.parseInt(JOptionPane.showInputDialog("El numero es menor. Ingrese otro numero"));
            }
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Usted acerto en " +contador+ " intentos");
    }
}
