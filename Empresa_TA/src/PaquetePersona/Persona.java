/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetePersona;

/**
 *
 * @author Ricardo
 */
public class Persona {
    private int ID_persona;
    private String nombre;
    private String direccion;
    private String correoElectronico;
    
    public Persona(int ID_persona, String nombre, String direccion, String correoElectronico){
        this.ID_persona=ID_persona;
        this.nombre=nombre;
        this.direccion=direccion;
        this.correoElectronico=correoElectronico;
    }
    /**
     * @return the ID_persona
     */
    public int getID_persona() {
        return ID_persona;
    }

    /**
     * @param ID_persona the ID_persona to set
     */
    public void setID_persona(int ID_persona) {
        this.ID_persona = ID_persona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
}
