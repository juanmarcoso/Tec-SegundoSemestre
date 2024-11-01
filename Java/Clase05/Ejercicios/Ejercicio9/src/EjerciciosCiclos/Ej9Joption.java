/*
Ejercicio 9: Pedir dia, mes y año de una fecha o indicar si la fecha es correcta.
suponiendo que todos los meses son de 30 dias
 */
package EjerciciosCiclos;

import javax.swing.JOptionPane;

/**
 *
 * @author juan orellana
 */
public class Ej9Joption {

    public static void main(String[] args) {
        //Declaro las variables
        int dia, mes, anio;

        //Le damos valor a las variables
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de un dia entre 1 y 30"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de un mes"));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de un año"));

        //Comprobamos si estan bien las fechas
        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((anio != 0) && (anio <= 2024)) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia incorrecto");
        }
        JOptionPane.showMessageDialog(null, "Fin del programa");
    }
}
