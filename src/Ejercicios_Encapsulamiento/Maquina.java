
package Ejercicios_Encapsulamiento;

/**
 *
 * @author Luis Ballena
 */
public class Maquina {
    
    private int produccion;
    
    private double utilidad;

    public Maquina() {
    }
    
    public double utilidadTotal(){
        return (produccion*utilidad);
    }
    
    private void generarUtilidad(int produccion){
        if(produccion == 200){/** Estos son numeros magicos, busquen sobre esto :D **/
            utilidad = 3.0;
        }else if(produccion == 150){
            utilidad = 5.0;
        }
    }
    
    /** GETTERS AND SETTERS **/

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
        generarUtilidad(produccion);
    }

    public double getUtilidad() {
        return utilidad;
    }

    
}
