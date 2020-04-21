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
public class Padre extends Abuelo {
    public float altura;
    public String constitucion_fisica;
    Padre(){
        super();
        altura = (float) 1.75;
        constitucion_fisica = "Delgada";
    }
}
