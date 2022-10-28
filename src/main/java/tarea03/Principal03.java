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
        asignatura.setNumeroHoras(160);

        var grupo = new Grupo();

        grupo.setDocente(docente);
        grupo.setNumeroEstudiantes(50);
        grupo.setNumeroGrupo(2);
        grupo.setMateria(asignatura);

        System.out.println(docente.mostrarInfo());
        System.out.println(asignatura.mostrarInfo());
        System.out.println(grupo.mostrarInfo());

        System.out.println("El grupo " + grupo.getNumeroGrupo()
                + " de la asignatura " + asignatura.getCodigo()
                + " tiene un total de " + grupo.getNumeroEstudiantes()
                + " estudiantes," + " su numero de horas es de "
                + asignatura.getNumeroHoras() + " y su docente es "
                + docente.getNombre());

        // Inicializacion 
        // Relacion 3 (Pais / Equipo / Jugador)---------------------------
        var equipo = new Equipo();

        equipo.setNombreSeleccion("Federacion Ecuatoriana de futbol");
        equipo.setNumeroJugadores(25);
        equipo.setNombreDt("Luis Enrique");

        var pais = new Pais();

        pais.setCodigo("ECU");
        pais.setNombre("Ecuador");
        pais.setSeleccion(equipo);

        var jugador = new Jugador();

        jugador.setNombre("Moises Caicedo");
        jugador.setSeleccion(equipo);
        jugador.setSalario(1300);

        System.out.println(equipo.mostrarInfo());
        System.out.println(pais.mostrarInfo());
        System.out.println(jugador.mostrarInfo());

        System.out.println("El jugador se llama: " + jugador.getNombre()
                + " de la " + equipo.getNombreSeleccion() + " tiene un total de "
                + equipo.getNumeroJugadores() + " su director tecnico es "
                + equipo.getNombreDt() + " dicha seleccion pertenece al pais "
                + pais.getNombre() + " con el codigo " + pais.getCodigo());

        // Inicializacion 
        // Relacion 7 (Auto / Matricula / Propietario)---------------------------
        var auto = new Auto();
        auto.setMarca("Audi");
        auto.setColor("blanco");

        var propietario = new Propietario();
        propietario.setNombre("Sebastian Jara");
        propietario.setCedula("0150700789");

        var matricula = new Matricula();
        matricula.setNumeroPlaca("AAO593");
        matricula.setKilometraje(60150.10);
        matricula.setNombrePropietario(propietario);

        System.out.println(auto.mostrarInfo());
        System.out.println(matricula.mostrarInfo());
        System.out.println(propietario.mostrarInfo());

        System.out.println("El auto es de marca " + auto.getMarca()
                + " y su color es " + auto.getColor() + " el numero de matricula es "
                + matricula.getNumeroPlaca() + " y su propietario es "
                + propietario.getNombre());

    }

}
