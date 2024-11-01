
package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
    //Metodos
    public void sumarNumeros(){ //void tipo de retorno vacio
        
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        
    }
    
    public int sumarConRetorno(){
        // Aca solo vamos a devolver un valor entero
        return a + b;        
    }
    
    //El argumento es la informacion que va a recibir el metodo
    public int sumarConArgumentos(int arg1, int arg2){
        
        this.a = arg1; //El argumento arg1 se asigna al atributo this.a
        this.b = arg2; //La utilizacion del this es opcional
        //return a + b;
        return sumarConRetorno(); //Esto no es aconsejable como buena practica
        
    }
}
