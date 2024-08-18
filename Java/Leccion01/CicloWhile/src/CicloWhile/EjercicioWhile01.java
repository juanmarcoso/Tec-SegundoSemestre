package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        
        var conteo = 0; //Inferencia de tipos
        
        while(conteo < 7) {
            System.out.println("Conteo: " + conteo);
            conteo++; // Vamos aumentando en uno la variable
        }
    }
}
