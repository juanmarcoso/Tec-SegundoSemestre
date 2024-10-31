package ciclowhile;

public class EjercicioWhile01 {

    public static void main(String[] args) {

        var conteo = 0; //Inferencia de tipos
        
        while (conteo < 7){

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
        
        for (var contador1 =0; contador1 < 7; contador1++){
            System.out.println("contador1 = " + contador1);
        }
        
    }
    
}
