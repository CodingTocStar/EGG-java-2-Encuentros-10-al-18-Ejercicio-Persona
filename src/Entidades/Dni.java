/*
La clase Dni tendrá como atributos 
    la serie (carácter) y 
    número. 

Prueba acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Entidades;

/**
 *
 * @author MiriamNahuel
 */
public class Dni {
    //ATRIBUTOS
    private char serie;
    private int numero;
    
    //CONSTRUCTORES
    
    public Dni(){}

    public Dni(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }
    
    //GETTER & SETTER

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
