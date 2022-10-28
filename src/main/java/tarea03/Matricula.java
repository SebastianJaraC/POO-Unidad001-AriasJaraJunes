/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea03;

/**
 *
 * @author Niko
 */
public class Matricula {

    private String NumeroPlaca;
    private Double kilometraje;
    private Propietario nombrePropietario;

    public String mostrarInfo() {

        return "El numero de placa es " + this.NumeroPlaca + " su kilometraje es de: "
                + this.kilometraje + " km " + " y su propietario es: "
                + nombrePropietario.getNombre();

    }

    public String getNumeroPlaca() {
        return NumeroPlaca;
    }

    public void setNumeroPlaca(String NumeroPlaca) {
        this.NumeroPlaca = NumeroPlaca;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Propietario getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(Propietario nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

}
