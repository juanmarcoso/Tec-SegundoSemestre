
package test;

import domain.Persona;

public class PersonaPrueba {
    
    private int contador;
    
    public static void main(String[] args) {
        
        //Objetos
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Javier");
        
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        
        imprimir(persona1);
        imprimir(persona2);
        
        //this.contador = 10; //No se puede referenciar desde un contexto estatico
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println("personaP1 = " + personaP1.getContador());
        
    }
    //Armamos un metodo de forma dinamica
    public static void imprimir(Persona persona){ //Tenemos que colocar static para poder trabajar algo dinamico dentro de una clase estatica
        System.out.println("persona = " + persona); //Imprimimos el objeto al que apunta la clase Persona
    }
    
    public int getContador(){ //Con este metodo podemos invocar la variable contador
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
    
}
