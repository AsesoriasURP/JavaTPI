
package Ejercicios_Encapsulamiento;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        String texto ="";
        double sueldo = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        texto=entrada.nextLine();
        System.out.println("Ingrese el sueldo: ");
        sueldo=entrada.nextDouble();
        Operario operario = new Operario(texto, sueldo);
        System.out.println("Operario: "+operario.getNombre()+" Sueldo: "+operario.pagoTotal());
    }
    
}
