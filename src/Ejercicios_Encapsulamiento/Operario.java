/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Encapsulamiento;

/**
 *
 * @author Luis Alonso Ballena Garcia
 */
public class Operario {
    
    private String nombre;
    
    private double sueldo;
    
    private Maquina m1;
    
    private Maquina m2;

    public Operario(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        m1 = new Maquina();
        m1.setProduccion(200);
        m2 = new Maquina();
        m2.setProduccion(150);
    }
    
    public double pagoTotal(){
        return sueldo+((m1.utilidadTotal()*5)/100)+(m2.utilidadTotal()*5/100);
    }

    /** GETTERS AND SETTERS **/
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    
    
}
