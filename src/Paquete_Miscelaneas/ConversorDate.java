/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete_Miscelaneas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Administrador
 * 
 * La clase ConversorDate permite obtener la fecha actual segun el pattern y localidad
 * que se le otorgue
 * 
 */
public class ConversorDate {
    
    private Date fecha;
    
    private Locale localidad;
    
    private String pattern;

    public ConversorDate() {
        this.pattern="dd/MM/yyyy";
        this.localidad = new Locale("es");
    }
    
    
    public String convertirFecha(){
        SimpleDateFormat format = new SimpleDateFormat(getPattern(), getLocalidad());
        return format.format(getFecha());
    }
   
    /** GETTERS AND SETTERS **/
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Locale getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Locale localidad) {
        this.localidad = localidad;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    
    
    
    
}
