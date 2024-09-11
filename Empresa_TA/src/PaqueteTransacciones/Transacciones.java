
package PaqueteTransacciones;


import java.util.Date;

/**
 *
 * @author rodri
 */
public class Transacciones {
    private String id_transaccion;
    private Date fecha_emision;
    private double subtotal;
    private double impuestos;
    private double total;
    private Tipo_de_Transaccion tipo_transaccion;
    private Tipo_de_Pedido tipo_pedido_asociado;
    
    public double calcularImpuestos(){
        double imp=0; return imp;
    }
    
    public Tipo_de_Pedido obtenerTipoPedido(){
        return tipo_pedido_asociado;
    }
}
