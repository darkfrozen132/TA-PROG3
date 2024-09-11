/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetePedido;
import java.util.Date;
import PaquetePersona.Proveedor;
import java.util.ArrayList;
import PaqueteInventario.Paquete;
/**
 *
 * @author Ricardo
 */
public class PedidoCompra extends Pedido{
    private Date fechaCompra;
    private Date fechaEntrega;
    private Proveedor proveedor;

    public PedidoCompra(String id_pedido, double precio_total, String metodo_pago, ArrayList<Paquete>paquetes, Date fechaCompra,
            Date fechaEntrega, Proveedor proveedor){
        super(id_pedido,precio_total,metodo_pago,paquetes);
        this.fechaCompra=fechaCompra;
        this.fechaEntrega=fechaEntrega;
        this.proveedor=proveedor;
    } 
    
}
