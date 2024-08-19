package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        
        var conteo = 0; //Inferencia de tipos
        
        while(conteo < 7) {
            System.out.println("Conteo: " + conteo);
            conteo++; // Vamos aumentando en uno la variable
        }
        
        System.out.println("");
        System.out.println("Ejercitando con DoWhile");
        
        var contador = 0;
        
        do {            
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 7);
        
        // Primero declaramos la variable
        // Luego declaramos la condicion
        // Y por ultimo le decimos que va a hacer con la variable
        System.out.println("");
        System.out.println("Ahora veremos el ciclo for");
       
        for( var contando = 0; contando < 7; contando++ ){
            System.out.println("contando = " + contando);
        }
    }
}
