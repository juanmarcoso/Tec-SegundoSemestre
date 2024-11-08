
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    
    public static void main(String[] args) {
        //Creamos el objeto Empleado
        Empleado empleado1 = new Empleado("Juan", 75000.00);
        Date fecha1 = new Date();
        Cliente cliente1 = new Cliente(fecha1, true, "Bety", 'F', 32, "9 de Julio 1413");
        // Imprimimos objeto
        System.out.println("empleado1 = " + empleado1);
        System.out.println("cliente1 = " + cliente1);
        
    }
}
