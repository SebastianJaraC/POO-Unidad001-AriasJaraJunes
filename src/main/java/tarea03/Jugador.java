/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea03;

/**
 *
 * @author Niko
 */
public class Jugador {

    private String nombre;
    private double salario;
    private Equipo seleccion;

    public String mostrarInfo() {

        return "El nombre del jugador es " + this.nombre + ", juega en la "
                + seleccion.getNombreSeleccion() + " y su salario es de: "
                + this.salario;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Equipo getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Equipo seleccion) {
        this.seleccion = seleccion;
    }

}
