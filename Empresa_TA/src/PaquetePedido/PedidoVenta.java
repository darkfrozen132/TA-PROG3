/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetePedido;
import java.util.ArrayList;
import java.util.Date;
import PaquetePersona.Cliente;
import PaqueteInventario.Paquete;
/**
 *
 * @author Ricardo
 */
public class PedidoVenta extends Pedido{
    private Date fechaVenta;
    private Date fechaDespacho;
    private Cliente cliente;

    public PedidoVenta(String id_pedido, double precio_total, String metodo_pago, ArrayList<Paquete>paquetes, Date fechaVenta,
            Date fechaDespacho, Cliente cliente){
        super(id_pedido,precio_total,metodo_pago,paquetes);
        this.fechaVenta=fechaVenta;
        this.fechaDespacho=fechaDespacho;
        this.cliente=cliente;
    } 
    
    
}
