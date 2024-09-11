/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteInventario;

import java.util.ArrayList;

/*
-ID_TORRE
-FOOTPRINT
-CANTIDAD_FILAS
-CANTIDAD_CIMA
-PESO
-CANTIDAD_PAQUETES
*/


/**
 *
 * @author Usuario
 */
public class Torre {
    private Integer ID_TORRE;
    private Integer FOOTPRINT;
    private Integer CANTIDAD_FILAS; // es la altura de la torre
    private Integer CANTIDAD_CIMA;
    private Double PESO; // CANTIDAD_PAQUETES*pesoPaquete
    private Integer CANTIDAD_PAQUETES; // FOOTPRINT*(CANTIDAD_FILAS - 1) + CANTIDAD_CIMA
    private Paquete PAQUETE; // para saber que paquetes contiene la torre
    private Dimension dimension;
    
    public Torre(Paquete PAQUETE, Integer CANTIDAD_PAQUETES){
        this.FOOTPRINT = creaFootprint(CANTIDAD_PAQUETES);
        this.CANTIDAD_PAQUETES = CANTIDAD_PAQUETES;
        this.PAQUETE = PAQUETE;
        /*...*/
    }
    
    private Integer creaFootprint(Integer CANTIDAD_PAQUETES){
        return 0;
    }
    
    /**
     * @return the ID_TORRE
     */
    public Integer getID_TORRE() {
        return ID_TORRE;
    }

    /**
     * @return the FOOTPRINT
     */
    public Integer getFOOTPRINT() {
        return FOOTPRINT;
    }

    /**
     * @return the CANTIDAD_FILAS
     */
    public Integer getCANTIDAD_FILAS() {
        return CANTIDAD_FILAS;
    }

    /**
     * @return the CANTIDAD_CIMA
     */
    public Integer getCANTIDAD_CIMA() {
        return CANTIDAD_CIMA;
    }

    /**
     * @return the PESO
     */
    public Double getPESO() {
        return PESO;
    }

    /**
     * @return the CANTIDAD_PAQUETES
     */
    public Integer getCANTIDAD_PAQUETES() {
        return CANTIDAD_PAQUETES;
    }
}
