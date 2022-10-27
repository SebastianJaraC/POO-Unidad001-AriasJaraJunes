/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea03;

/**
 *
 * @author Niko
 */
public class Principal03 {
    public static void main(String[] args) {
        
        // Inicializacion 
        
        // Relacion 3 (Grupo / Asignatura / Profesor)---------------------------
        
        var docente = new Profesor();
        
        docente.setNombre("Julio Sanchez");
        docente.setNumeroEstudiantes(150);
        docente.setSalario(1750);
        
        var asignatura = new Asignatura();
        
        asignatura.setCodigo("Programacion1");
        asignatura.setDocente(docente);
        asignatura.setNumeroHoras(160);
        
        var grupo = new Grupo();
        
        grupo.setDocente(docente);
        grupo.setNumeroEstudiantes(50);
        grupo.setNumeroGrupo(2);
        
        System.out.println(docente.mostrarInfo());
        System.out.println(asignatura.mostrarInfo());
        System.out.println(grupo.mostrarInfo());
        
    
        
        System.out.println("El grupo " + grupo.getNumeroGrupo() +
                " de la asignatura " + asignatura.getCodigo() +
                " tiene un total de " +grupo.getNumeroEstudiantes() + 
                " estudiantes," + " su numero de horas es de " + 
                asignatura.getNumeroHoras() + " y su docente es " 
                + docente.getNombre());

        
        // Inicializacion 
        
        // Relacion 3 (Grupo / Asignatura / Profesor)---------------------------
        
        
    }
}
