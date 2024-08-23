/*
Ejercicios 2: Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un cero.
 */
package Ciclos02;

import javax.swing.JOptionPane; //Importo la clase a utilizar

public class Ejercicio02 {
    public static void main(String[] args) {
        
        int num, negativo, positivo; //Defino las variables
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (num != 0) {
            if (num > 0){
                System.out.println("El numero es positivo");
            } else{
                System.out.println("El numero es negativo");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        System.out.println("Salio del sistema");
    }
}
