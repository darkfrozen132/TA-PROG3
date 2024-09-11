/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetePedido;
import java.util.ArrayList;
import PaqueteInventario.Paquete;
/**
 *
 * @author Ricardo
 */
public abstract class Pedido {
    private String id_pedido;
    private double precio_total;
    private String metodo_pago;
    private ArrayList<Paquete>paquetes;

    /**
     * @return the id_pedido
     */
    
    public Pedido(String id_pedido, double precio_total, String metodo_pago, ArrayList<Paquete>paquetes){
        this.id_pedido=id_pedido;
        this.precio_total=precio_total;
        this.metodo_pago=metodo_pago;
        this.paquetes=paquetes;
    }
    public String getId_pedido() {
        return id_pedido;
    }

    /**
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * @return the precio_total
     */
    public double getPrecio_total() {
        return precio_total;
    }

    /**
     * @param precio_total the precio_total to set
     */
    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    /**
     * @return the metodo_pago
     */
    public String getMetodo_pago() {
        return metodo_pago;
    }

    /**
     * @param metodo_pago the metodo_pago to set
     */
    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    /**
     * @return the paquetes
     */
    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    /**
     * @param paquetes the paquetes to set
     */
    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
    
    
}
