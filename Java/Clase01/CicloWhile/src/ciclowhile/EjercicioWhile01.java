package ciclowhile;

public class EjercicioWhile01 {

    public static void main(String[] args) {

        var conteo = 0; //Inferencia de tipos

        while (conteo < 7) {

            System.out.println("conteo = " + conteo);
            conteo++; //Vamos aumentando en uno la variable
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        var contador = 0;

        do {

            System.out.println("contador = " + contador);
            contador++; //Para que no sea un ciclo infinito

        } while (contador < 7);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (var contador2 = 0; contador2 < 7; contador2++) {
            System.out.println("contador2 = " + contador2);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                
        for (var contador1 = 0; contador1 < 7; contador1++) {
            if (contador1 % 2 == 0) {
                System.out.println("contador1 = " + contador1);
                break; //En este caso llega a la posicion cero y para
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (var contador4 = 0; contador4 < 7; contador4++) {
            if (contador4 % 2 != 0) {
                continue; //Sigue a la siguiente iteracion
            }
            System.out.println("contador4 = " + contador4);
        }
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        // Uso de etiquetas Labels
        inicio: //No se recomienda la utilizacion de la misma
        for (var contador1 = 0; contador1 < 7; contador1++) {
            if (contador1 % 2 == 0) {
                System.out.println("contador1 = " + contador1);
                break inicio; //Las etiquetas no funcionan sin las palabras break y continue
            }
        }

    }

}
