/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePersona;

import PatronCoadTransaccion.TransaccionCompra;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class Proveedor extends PersonaJuridica{
    private double saldoPorPagar;
    private ArrayList<TransaccionCompra> transaccion_compras; 
    
    public Proveedor(int ID_persona, String nombre, String direccion, String correoElectronico, int ruc, String tipoSociedad,
            double saldoPorPagar){
        super(ID_persona,nombre,direccion,correoElectronico,ruc,tipoSociedad);
        this.saldoPorPagar=saldoPorPagar;
    }

    /**
     * @return the saldoPorPagar
     */
    public double getSaldoPorPagar() {
        return saldoPorPagar;
    }

    /**
     * @param saldoPorPagar the saldoPorPagar to set
     */
    public void setSaldoPorPagar(double saldoPorPagar) {
        this.saldoPorPagar = saldoPorPagar;
    }
    
    
}
