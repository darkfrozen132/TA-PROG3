/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteInventario;
/*
-ID_PAQUETE: string
-PESO_MAXIMO_APILADO: double
-CANTIDAD_PRODUCTOS
*/


/**
 *
 * @author Usuario
 */
public class Paquete {
    private String ID_PAQUETE;
    private Double PESO_MAXIMO_APILADO;
    private Integer CANTIDAD_PRODUCTOS;
    private Producto PRODUCTO;
    
    public Paquete(Producto PRODUCTO, Integer CANTIDAD_PRODUCTOS, Double PESO_MAXIMO_APILADO){
        this.PRODUCTO = PRODUCTO;
        this.CANTIDAD_PRODUCTOS = CANTIDAD_PRODUCTOS;
        this.PESO_MAXIMO_APILADO = PESO_MAXIMO_APILADO;
    }
    
    /**
     * @return the ID_PAQUETE
     */
    public String getID_PAQUETE() {
        return ID_PAQUETE;
    }

    /**
     * @return the PESO_MAXIMO_APILADO
     */
    public Double getPESO_MAXIMO_APILADO() {
        return PESO_MAXIMO_APILADO;
    }

    /**
     * @return the CANTIDAD_PRODUCTOS
     */
    public Integer getCANTIDAD_PRODUCTOS() {
        return CANTIDAD_PRODUCTOS;
    }
    
    
}
