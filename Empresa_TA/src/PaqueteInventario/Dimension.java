/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteInventario;
/*
-alto: double
-ancho: double
-largo: double
*/
/**
 *
 * @author Usuario
 */
public class Dimension {

   
    private Double alto;
    private Double largo;
    private Double ancho;
    
    public Dimension(Double alto, Double largo, Double ancho){
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
    }
    
    /**
     * @return the alto
     */
    public Double getAlto() {
        return alto;
    }

    /**
     * @return the largo
     */
    public Double getLargo() {
        return largo;
    }

    /**
     * @return the ancho
     */
    public Double getAncho() {
        return ancho;
    }
     /**
     * @param alto the alto to set
     */
    public void setAlto(Double alto) {
        this.alto = alto;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(Double largo) {
        this.largo = largo;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    
    
}
