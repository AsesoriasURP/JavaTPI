
package Ejercicio_CadenaCaracteres;

/**
 *
 * @author Administrador
 */
public class Ejercicio1 {
    
    private String texto;

    public Ejercicio1() {
    }
    
    public boolean estaComprendido(){
        if(texto.length() == 0){
            return false;
        }else if(texto.charAt(0) >= 73 && texto.charAt(0) <= 77){
            return true;
        }else{
            return false;
        }
    }
    

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    public static void main(String[] args) {
        /*
        *
        *    Leer una letra desde una caja de texto. Deducir si está comprendida 
        *    entre las letras mayúsculas I - M inclusive.
        *  
        **/
        Ejercicio1 texto = new Ejercicio1();
        texto.setTexto("O");
        System.out.println(""+texto.estaComprendido());
    }
    
    
}
