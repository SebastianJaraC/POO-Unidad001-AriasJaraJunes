/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea03;

/**
 *
 * @author Niko
 */
public class Asignatura {
    
    private String codigo;
    private int numeroHoras;
    private Profesor docente;
    
     public String mostrarInfo(){
    
        return "La asignatura " + this.codigo+ " tiene un numero de horas de " + 
        this.numeroHoras + " y su docente es " + docente.getNombre();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public Profesor getDocente() {
        return docente;
    }

    public void setDocente(Profesor docente) {
        this.docente = docente;
    }
    
     
    
    
}
