/*
Crear otro objeto de Tipo Persona, asignar valores de manera inicial e imprimir,
luego modificar sus valores y volver a imprimir
 */
package dominio;

public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Osvaldo", 57000, false);
        Persona persona2 = new Persona("Romina", 120000, true);
        
        System.out.println("persona1 su nombre es "+ persona1.getNombre());
        
        //Modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        
        System.out.println("persona1 con su nombre modificado: "+ persona1.getNombre());
        System.out.println("persona1 el resultado para su sueldo: "+ persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+ persona1.isEliminado());
        
        //Mostrando los valores del objeto2
        System.out.println("El nombre del objeto2 es: " + persona2.getNombre());
        System.out.println("El sueldo del objeto2 es: " + persona2.getSueldo());
        System.out.println("El booleano del objeto2 es: " + persona2.isEliminado());
        
        //Modificamos los valores del objeto2
        persona2.setNombre("Olivia");
        persona2.setSueldo(135000);
        persona2.setEliminado(false);
        
        //Imprimimos los nuevos valores del objeto2
        System.out.println("El nombre nuevo del objeto2 es: " + persona2.getNombre());
        System.out.println("El sueldo nuevo del objeto2 es: " + persona2.getSueldo());
        System.out.println("El booleano nuevo del objeto2 es: " + persona2.isEliminado());
        
        //Llamamos al metodo toString()
        System.out.println("persona1 = " + persona1.toString());
        System.out.println("persona2 = " + persona2);
    }
}
