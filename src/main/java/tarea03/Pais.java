/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea03;

/**
 *
 * @author Niko
 */
public class Pais {
    
    private String nombre;
    private String codigo;
    private Equipo seleccion;
    
    public String mostrarInfo(){

        return "El nombre del pais es " + this.nombre + ", tiene el codigo: "
                + this.codigo + " y su seleccion es: " 
                + seleccion.getNombreSeleccion();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Equipo getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Equipo seleccion) {
        this.seleccion = seleccion;
    }
    
    
    
}
