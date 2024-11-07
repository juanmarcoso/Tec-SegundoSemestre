
package dominio;

public class Persona {
    
    //Atributos 
    private String nombre;
    private long sueldo;
    private boolean eliminado;
    
    //Constructor
    public Persona(String nombre, long sueldo, boolean eliminado){
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
    
}
