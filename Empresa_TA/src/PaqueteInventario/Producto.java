/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteInventario;
/*
-ID_PRODUCTO
-SKU
-NOMBRE
-PRECIO_UNITARIO
-PRECIO_VENTA
-PRECIO_COMPRA
-TIPO_PRODUCTO
*/


/**
 *
 * @author Usuario
 */
public class Producto {
    private Integer ID_PRODUCTO;
    private Integer SKU;
    private String NOMBRE;
    private Double PRECIO_UNITARIO;
    private Double PRECIO_VENTA;
    private Double PRECIO_COMPRA;
    private String TIPO_PRODUCTO;
    private Marca MARCA;

    /**
     * @return the MARCA
     */
    public Marca getMARCA() {
        return MARCA;
    }
    
    /**
     * @return the SKU
     */
    public Integer getSKU() {
        return SKU;
    }

    /**
     * @return the NOMBRE
     */
    public String getNOMBRE() {
        return NOMBRE;
    }

    /**
     * @return the PRECIO_UNITARIO
     */
    public Double getPRECIO_UNITARIO() {
        return PRECIO_UNITARIO;
    }

    /**
     * @return the PRECIO_VENTA
     */
    public Double getPRECIO_VENTA() {
        return PRECIO_VENTA;
    }

    /**
     * @return the PRECIO_COMPRA
     */
    public Double getPRECIO_COMPRA() {
        return PRECIO_COMPRA;
    }

    /**
     * @return the TIPO_PRODUCTO
     */
    public String getTIPO_PRODUCTO() {
        return TIPO_PRODUCTO;
    }
}
