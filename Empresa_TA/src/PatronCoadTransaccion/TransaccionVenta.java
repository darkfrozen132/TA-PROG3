/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronCoadTransaccion;
import java.util.ArrayList;
import paquetePersona.Cliente;

/**
 *
 * @author Usuario
 */
public class TransaccionVenta extends Transaccion {
    private ArrayList<LineaTransaccionVenta> linea_transaccion_ventas;
    private TransaccionCompra transaccion_compra; 
    private Cliente clientes;
}
