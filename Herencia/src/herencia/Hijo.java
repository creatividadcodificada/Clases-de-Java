/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Creatividad Codificada
 */
public class Hijo extends Padre{
    private int edad;
    private String nombre;
    Hijo(int edad, String nombre){
        super();
        this.edad = edad;
        this.nombre = nombre;
    }
    public void mostrar_datos_personales(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Edad: "+edad);
    System.out.println("Altura: "+altura);
    System.out.println("Constitución Física: "+constitucion_fisica);
    System.out.println("Ojos: "+ojos);
    System.out.println("Piel: "+piel);
    System.out.println("Cabello: "+cabello);
    }
}
