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
public class ProfesorAsignatura extends Profesor {
    private int numAsignatura;

    public ProfesorAsignatura() {
    }

    public ProfesorAsignatura(int numAsignatura) {
        this.numAsignatura = numAsignatura;
    }

    public ProfesorAsignatura(int numAsignatura, int numAlumnos) {
        super(numAlumnos);
        this.numAsignatura = numAsignatura;
    }

    public ProfesorAsignatura(int numAsignatura, int numAlumnos, int salario, int horaSalida, int horaEntrada) {
        super(numAlumnos, salario, horaSalida, horaEntrada);
        this.numAsignatura = numAsignatura;
    }

    public ProfesorAsignatura(int numAsignatura, int numAlumnos, int salario, int horaSalida, int horaEntrada, String nombre, int edad, Mascota mascota) {
        super(numAlumnos, salario, horaSalida, horaEntrada, nombre, edad, mascota);
        this.numAsignatura = numAsignatura;
    }

    public int getNumAsignatura() {
        return numAsignatura;
    }

    public void setNumAsignatura(int numAsignatura) {
        this.numAsignatura = numAsignatura;
    }

    @Override
    public String toString() {
        return super.toString()+"ProfesorAsignatura{" + "numAsignatura=" + numAsignatura + '}';
    }
    
    

    
}
