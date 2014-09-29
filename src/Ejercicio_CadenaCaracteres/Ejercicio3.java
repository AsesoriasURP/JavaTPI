/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_CadenaCaracteres;

import java.util.Scanner;

/**
 *
 * @author Luis Alonso Ballena Garcia
 */
public class Ejercicio3 {
    
    public String cambiarZigZag(String texto){
        String auxiliar = "";
        for(int i=0; i<texto.length(); i++){
            if(i+1 == texto.length()){
                auxiliar += texto.charAt(i);
            }else{
                auxiliar += texto.charAt(i+1)+""+texto.charAt(i);
                i++;/**esto es lo mismo que decir i=i+1 **/
            }
        }
        return auxiliar;
    }
    
    public static void main(String[] args) {
        /**
         * Leer desde consola la entrada de una palabra y modificar el orden de las
         * letras en zigzag. Ejm: garay -> agary
         */
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String texto = entrada.nextLine();
        System.out.println(""+ejercicio3.cambiarZigZag(texto));
    }
    
}
