/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

/**
 *
 * @author ivan_
 */
public class ProfesorCarrera extends Profesor{
    private String nomAsignatura;

    public ProfesorCarrera() {
    }

    public ProfesorCarrera(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    public ProfesorCarrera(String nomAsignatura, int numAlumnos) {
        super(numAlumnos);
        this.nomAsignatura = nomAsignatura;
    }

    public ProfesorCarrera(String nomAsignatura, int numAlumnos, int salario, int horaSalida, int horaEntrada) {
        super(numAlumnos, salario, horaSalida, horaEntrada);
        this.nomAsignatura = nomAsignatura;
    }

    public ProfesorCarrera(String nomAsignatura, int numAlumnos, int salario, int horaSalida, int horaEntrada, String nombre, int edad, Mascota mascota) {
        super(numAlumnos, salario, horaSalida, horaEntrada, nombre, edad, mascota);
        this.nomAsignatura = nomAsignatura;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    @Override
    public String toString() {
        return super.toString()+ "ProfesorCarrera{" + "nomAsignatura=" + nomAsignatura + '}';
    }
    
    
}
