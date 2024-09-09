/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePersona;

/**
 *
 * @author Ricardo
 */
public class PersonaJuridica extends Persona{
    private int ruc;
    private String tipoSociedad;
    
    public PersonaJuridica(int ID_persona, String nombre, String direccion, String correoElectronico, int ruc, String tipoSociedad){
        super(ID_persona,nombre,direccion,correoElectronico);
        this.ruc=ruc;
        this.tipoSociedad=tipoSociedad;
    }

    /**
     * @return the ruc
     */
    public int getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the tipoSociedad
     */
    public String getTipoSociedad() {
        return tipoSociedad;
    }

    /**
     * @param tipoSociedad the tipoSociedad to set
     */
    public void setTipoSociedad(String tipoSociedad) {
        this.tipoSociedad = tipoSociedad;
    }
    
    
    
}
