package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Creacion de objeto
        Aritmetica aritmetica1 = new Aritmetica();
        //Asignamos valor a los atributos del objeto
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        //Llamamos al metodo del objeto
        aritmetica1.sumarNumeros();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 16);
        System.out.println("resultado = " + resultado);
    }
}
