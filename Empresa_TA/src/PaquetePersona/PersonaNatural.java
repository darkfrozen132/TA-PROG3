/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePersona;

/**
 *
 * @author Ricardo
 */
public class PersonaNatural extends Persona {
    private int dni;
    private char sexo;
    private int telefono;
    
    
    public PersonaNatural(int ID_persona, String nombre, String direccion, String correoElectronico, int dni, char sexo, 
            int telefono){
        super(ID_persona,nombre,direccion,correoElectronico);
        this.dni=dni;
        this.sexo=sexo;
        this.telefono=telefono;
    }
    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
