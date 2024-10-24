package Persona;

public class Persona {
    private String nombre;
    private String ciudad;

    // Constructor with parameters
    public Persona(String nombre, String ciudad) {
        this.nombre = nombre; // Use '=' for assignment
        this.ciudad = ciudad; // Use '=' for assignment
    }

    // Default constructor
    public Persona() {
        this.nombre = null;
        this.ciudad = null;
    }

    // Getter for nombre
    public String getNombre() {
        return nombre;
    }

    // Setter for nombre
    public void setNombre(String nombre) {
        this.nombre = nombre; // Use '=' for assignment
    }

    // Getter for ciudad
    public String getCiudad() {
        return ciudad;
    }

    // Setter for ciudad
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad; // Use '=' for assignment
    }
}
