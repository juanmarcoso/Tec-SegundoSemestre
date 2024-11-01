/*
Ejercicio 9: Pedir dia, mes y año de una fecha o indicar si la fecha es correcta.
suponiendo que todos los meses son de 30 dias
 */
package EjerciciosCiclos;

import java.util.Scanner;

/**
 *
 * @author juan orellana
 */
public class Ej9Scanner {

    public static void main(String[] args) {
        //Declaro las variables
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio = 0;

        //Le damos valor a las variables
        System.out.println("Ingrese un dia en numero entre 1 y 30: ");
        dia = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese un mes en numero: ");
        mes = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese un año en numero: ");
        anio = Integer.parseInt(entrada.nextLine());

        //Comprobamos si estan bien las fechas
        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((anio != 0) && (anio <= 2024)) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                } else {
                    System.out.println("Fecha incorrecta, año incorrecto");
                }
            } else {
                System.out.println("Fecha incorrecta, mes incorrecto");
            }
        } else {
            System.out.println("Fecha incorrecta, dia incorrecto");
        }
    }
}
