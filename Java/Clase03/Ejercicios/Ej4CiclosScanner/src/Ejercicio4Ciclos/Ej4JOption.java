/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, 
mostrar cuantos numeros se han introducido. 
 */
package Ejercicio4Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author juan orellana
 */
public class Ej4JOption {
    
    public static void main(String[] args) {
            
        int numero;
        int contador = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while (numero > 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Salio del programa. Usted ingreso: " + contador+ " numeros");
    }
    
}
