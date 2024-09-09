    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePersona;
import PatronCoadTransaccion.TransaccionVenta;
import java.util.ArrayList;
/**
 *
 * @author Ricardo
 */
public class Cliente extends PersonaJuridica{
    private String estado;
    private ArrayList<TransaccionVenta> transaccion_ventas;

    
    public Cliente(int ID_persona, String nombre, String direccion, String correoElectronico, int ruc, String tipoSociedad,
            double saldoPorPagar){
        super(ID_persona,nombre,direccion,correoElectronico,ruc,tipoSociedad);
        this.estado=estado;
        
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
