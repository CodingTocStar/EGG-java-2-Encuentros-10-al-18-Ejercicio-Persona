/*
Realiza un programa en donde una clase Persona tenga como atributo 
    nombre, 
    apellido y un
    objeto de clase Dni. 

La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Main;

import Entidades.Dni;
import Entidades.Persona;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros10Al18EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creas el objeto dni
        Dni dni = new Dni('A', 12345);
        
        //creas la persona
        Persona persona = new Persona("juan", "gabriel", dni);

        //accedes a los datos mediante la clase persona que esta linkeada a dni
        
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        int numero = persona.getDni().getNumero();
        char serie = persona.getDni().getSerie();
        
        System.out.println("La persona con nombre " + nombre);
        System.out.println("Y de apellido " + apellido);
        System.out.println("Tiene DNI " + numero);
        System.out.println("Y de serie " + serie);
        /*
        ¿Que aprendi?
        Al crear un objeto dentro de otro podes acceder a sus atributos desde una misma clase.
        */
    }
    
}
