/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteInventario;

import java.util.ArrayList;

/*
-ID_ALMACEN
-DIRECCION
-TORRES
-CANTIDAD_TORRES
*/

/**
 *
 * @author Usuario
 */
public class Almacen {
    private static Integer generaID = 0; 
    
    private Integer ID_ALMACEN;
    private String DIRECCION;
    private ArrayList<Torre> TORRES;
    private Integer CANTIDAD_TORRES;
    
    public Almacen(String DIRECCION){
        this.ID_ALMACEN = generaID;
        generaID++;
        
        this.DIRECCION = DIRECCION;
        this.TORRES = new ArrayList<>();
        this.CANTIDAD_TORRES = 0;
    }
    
    public Integer ConsultarStock(Producto producto){
        return 0;
    }
    
    /**
     * @return the ID_ALMACEN
     */
    public Integer getID_ALMACEN() {
        return ID_ALMACEN;
    }

    /**
     * @return the DIRECCION
     */
    public String getDIRECCION() {
        return DIRECCION;
    }

    /**
     * @return the TORRES
     */
    public ArrayList<Torre> getTORRES() {
        return TORRES;
    }

    /**
     * @return the CANTIDAD_TORRES
     */
    public Integer getCANTIDAD_TORRES() {
        return CANTIDAD_TORRES;
    }
    
    
}
