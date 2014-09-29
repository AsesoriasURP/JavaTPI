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
public class Software {
    private String nombre;
    
    private int tipo;
    
    private int num;
    
    private double obtenerPrecio(int tipo ,int cantidad){
        double precio=0;
        switch(tipo){
            case 1:
                precio = cantidad > 5 ? 45 : 75;
                break;
            case 2:
                precio = 100;
                break;
            case 3:
                precio = 50;
                break;
        }
        return precio;
    }
    
    public String Mostrar(){
        double precio = obtenerPrecio(getTipo(),getNum());
        double total = precio*getNum();
        return "Software : "+getNombre()+"\nTipo : "+getTipo()
                +"\nLicencias : "+getNum()+"\nPrecio por Licencia : "+precio
                +"\nTotal a Pagar : "+total;
    }
    
    /** GETTERS AND SETTERS **/
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    
    
    
}
