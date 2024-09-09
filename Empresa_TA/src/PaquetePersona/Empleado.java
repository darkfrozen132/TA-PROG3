/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePersona;

/**
 *
 * @author Ricardo
 */
public class Empleado extends PersonaNatural {
    private double sueldo;
    public Empleado(int ID_persona, String nombre, String direccion, String correoElectronico, int dni, char sexo, 
            int telefono,double sueldo){
        super(ID_persona,nombre,direccion,correoElectronico,dni,sexo,telefono);
        this.sueldo=sueldo;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
