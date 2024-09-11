/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetePersona;

/**
 *
 * @author Leoncio
 */
abstract public class Persona {
    protected String id;
    private String doi;
    private String tipo_doi;
    private String nombre;
    private String direccion;
    private int telefono;
    
    abstract void obtenerInformacionPersona();
}
