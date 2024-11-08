package domain;

/**
 * Representa una persona con atributos básicos.
 */
public class Persona {

    // Atributos
    private int idPersona; // Identificador único de la persona
    private static int contadorPersona; // Contador de personas creadas
    private String nombre; // Nombre de la persona

    /**
     * Constructor para crear una nueva persona.
     * 
     * @param nombre Nombre de la persona.
     */
    public Persona(String nombre) {
        this.nombre = nombre; //El this se utiliza para los atributos que no son estaticos
        // Incrementar contador por cada objeto nuevo creado
        Persona.contadorPersona++;
        
        // Asignar nuevo valor a idPersona
        this.idPersona = Persona.contadorPersona;
    }

    /**
     * Obtiene el contador de personas creadas.
     * 
     * @return Contador de personas.
     */
    public static int getContadorPersona() {
        return contadorPersona;
    }

    /**
     * Establece el contador de personas.
     * 
     * @param contadorPersona Nuevo valor del contador.
     */
    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    /**
     * Obtiene el identificador de la persona.
     * 
     * @return Identificador de la persona.
     */
    public int getIdPersona() {
        return this.idPersona;
    }

    /**
     * Establece el identificador de la persona.
     * 
     * @param idPersona Nuevo identificador.
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    /**
     * Representación en cadena de la persona.
     * 
     * @return Cadena con datos de la persona.
     */
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}