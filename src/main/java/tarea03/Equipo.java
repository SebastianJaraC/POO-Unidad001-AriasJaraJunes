/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea03;

/**
 *
 * @author Niko
 */
public class Equipo {
    
    private int numeroJugadores;
    private String nombreDt;
    private String nombreSeleccion;

     public String mostrarInfo(){

        return "El nombre de la seleccion es " + this.nombreSeleccion 
                + ", su director tecnico es " + this.nombreDt
                + " y su numero de jugadores es de: " + this.numeroJugadores ;
    
     }
    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public String getNombreDt() {
        return nombreDt;
    }

    public void setNombreDt(String nombreDt) {
        this.nombreDt = nombreDt;
    }

    public String getNombreSeleccion() {
        return nombreSeleccion;
    }

    public void setNombreSeleccion(String nombreSeleccion) {
        this.nombreSeleccion = nombreSeleccion;
    }
    
    
}
