/*
Ejercicio 3: Leer numeros hasta que se introduzca un cero. 
Para cada uno indicar si es par o impar. 
 */
package ej3ciclosjoption;

import javax.swing.JOptionPane;

public class Ej3CiclosJoption {

    public static void main(String[] args) {
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while (numero != 0) {
            
            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es par");
            }
            else {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        }
        JOptionPane.showMessageDialog(null, "Usted eligio " + numero + " para salir del programa");
    }
    
}
