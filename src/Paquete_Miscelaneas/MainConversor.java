/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete_Miscelaneas;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class MainConversor {

    public static void main(String[] args) {
        ConversorDate conversor = new ConversorDate();
        conversor.setFecha(new Date());
        conversor.setPattern("EEEE MMMM dd/MM/yyyy");
        System.out.println(conversor.convertirFecha());
    }
    
}
