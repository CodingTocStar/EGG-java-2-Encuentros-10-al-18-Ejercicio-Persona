/*
Realiza un programa en donde una clase Persona tenga como atributo 
    nombre, 
    apellido y un
    objeto de clase Dni. 
 */
package Entidades;

/**
 *
 * @author MiriamNahuel
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private Dni dni;
    
    //CONSTRUCTORES
    
    public Persona(){}

    public Persona(String nombre, String apellido, Dni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    //GETTER & SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }
    
    
}
