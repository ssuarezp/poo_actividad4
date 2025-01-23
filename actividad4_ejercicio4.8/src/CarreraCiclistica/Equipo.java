/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;
import java.util.*;
/**
 *
 * @author EstudianteAuxiliar
 */
public class Equipo {

    private String nombre; /* Atributo que define el nombre del equipo 
    de ciclismo */
    private static double totalTiempo; /* Atributo que define el tiempo 
    total obtenido por el equipo */
    private String pais; /* Atributo que define el país al que pertenece el 
    equipo */
    Vector listaCiclistas; // Atributo que define un vector de objetos ciclista
    /**
    * Constructor de la clase Equipo
    * @param nombre Parámetro que define el nombre del equipo
    * @param país Parámetro que define el país del equipo
    */
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
        listaCiclistas = new Vector(); /* Se crea el vector de ciclistas que 
        conforma el equipo */
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String getPais() {
        return pais;
    }
    
    
    private void setPais(String pais) {
        this.pais = pais;
    }
    
    void anadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
    }
    
    void listarEquipo() {
    /* Se recorre el vector de ciclistas y para cada elemento se 
    imprime el nombre del ciclista */
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se aplica 
        casting para extraer el elemento */
            System.out.println(c.getNombre());
        }
    }
    
    void buscarCiclista() {
    Scanner sc = new Scanner(System.in); /* Se solicita texto 
    ingresado por teclado */
    String nombreCiclista = sc.next();
    for (int i = 0; i < listaCiclistas.size(); i++) { /* Se recorre el vector 
        de ciclistas */
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se obtiene 
        un elemento del vector */
        if (c.getNombre().equals(nombreCiclista)) { /* Si el nombre 
            ingresado se encuentra */
                System.out.println(c.getNombre());
            }
        }
    }
    
    void calcularTotalTiempo() {
    for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el vector
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se obtiene 
        un elemento del vector */
        // Se acumula el tiempo del ciclista en el tiempo del equipo
        totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }   
    }

  void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }  
    
  
}
