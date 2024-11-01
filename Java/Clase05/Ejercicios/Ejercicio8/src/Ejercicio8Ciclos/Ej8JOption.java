/*
Ejercicio 8: Pedir un numero N, y mostrar todos los numeros del 1 al N
 */
package Ejercicio8Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author juan orellana
 */
public class Ej8JOption {
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        for (int i = 1; i <= numero; i++){
            
            JOptionPane.showMessageDialog(null, "i = "+ i);
            
        }
        JOptionPane.showMessageDialog(null, "Fin del programa");
    }
}
