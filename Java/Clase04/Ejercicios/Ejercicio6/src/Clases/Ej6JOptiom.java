/*
Ejercicio 6: Pedir numeros hasta que se teclee un 0
mostrar la suma de todos los numeros introducidos
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author juan orellana
 */
public class Ej6JOptiom {
    public static void main(String[] args) {
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        int contador = 1;
        int suma = numero; 
        
        while (numero != 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
            suma += numero;
            contador++;
        }
        JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: " + suma);
    }
}
