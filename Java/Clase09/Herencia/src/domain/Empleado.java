
package domain;

public class Empleado extends Persona{ //Solo hay herencia simple en Java
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; //Es para áincrementar
    
    //Constructor
    public Empleado(String nombre ,double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado; //Contexto estatico
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", ").append(super.toString());
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
}
