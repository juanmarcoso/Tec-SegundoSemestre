/*
Ejercicio 7: Pedir numeros hasta que se introduzca uno negativo y calcular la media
 */
package EjercicicioCiclos;

import javax.swing.JOptionPane;

/**
 *
 * @author juan orellana
 */
public class Ej7JOption {
    public static void main(String[] args) {
        
        int numero, suma = 0;
        int  contador = 0;
        float promedio = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while (numero >= 0) {
            
            suma += numero;
            contador++;
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }
        
        if (contador == 0){
            JOptionPane.showMessageDialog(null, "Error, no se puede dividir en 0");
        }
        else {
            promedio = (float) suma / contador;
        }
        
        JOptionPane.showMessageDialog(null, "El promedio de los numeros ingresados es: " + promedio);
    }
}
