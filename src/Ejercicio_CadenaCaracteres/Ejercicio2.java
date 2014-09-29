/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_CadenaCaracteres;

/**
 *
 * @author Luis Alonso Ballena Garcia
 */
public class Ejercicio2 {

    public String quitarEspacios(String texto){
        String auxiliar = "";
        for(int i=0; i<texto.length(); i++){
            char c = texto.charAt(i);
            if(c != ' '){
               auxiliar+=c;
            }
        }
        return auxiliar;
    }
    
    public String ordenarAscendente(String texto){
        char cadena[] = texto.toCharArray();
        for(int i=0; i<cadena.length; i++){
            for(int j=i+1; j<cadena.length; j++){
                char c = cadena[i];
                if(c > cadena[j]){
                    cadena = swap(cadena, i, j);
                }
            }
        }
        return new String(cadena);
    }
    
    private char[] swap(char[] c, int i , int j){
        char temp = c[i];
        c[i] = c[j];
        c[j]=temp;
        return c;
    }
  
    public static void main(String[] args) {
        /**
         *  Se pide quitar los espacios de un texto y 
         * ordenarlo alfabeticamente
         * Nota: para resolver este ejercicio debemos considerar el codigo ASCII
         * http://www.commfront.com/images/Standard-ASCII-Table.jpg
         */
        Ejercicio2 ejercicio2 = new Ejercicio2();
        String texto = ejercicio2.quitarEspacios("hola como estas");
        System.out.println(""+texto);
        texto = ejercicio2.ordenarAscendente(texto);
        System.out.println(""+texto);
    }
    
}
