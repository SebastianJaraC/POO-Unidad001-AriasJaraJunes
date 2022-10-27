/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea03;

/**
 *
 * @author Niko
 */
public class Grupo {

    private int numeroGrupo;
    private int numeroEstudiantes;
    private Profesor docente;
    private Asignatura materia;

    public String mostrarInfo() {

        return "El grupo " + this.numeroGrupo + " tiene "
                + this.numeroEstudiantes + " estudiantes" + " y su docente es " + docente.getNombre();
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public Profesor getDocente() {
        return docente;
    }

    public void setDocente(Profesor docente) {
        this.docente = docente;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }

}
