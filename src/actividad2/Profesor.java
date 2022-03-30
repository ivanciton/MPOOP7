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
public class Profesor extends Empleado2{
    private int numAlumnos;

    public Profesor() {
    }

    public Profesor(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public Profesor(int numAlumnos, int salario, int horaSalida, int horaEntrada) {
        super(salario, horaSalida, horaEntrada);
        this.numAlumnos = numAlumnos;
    }

    public Profesor(int numAlumnos, int salario, int horaSalida, int horaEntrada, String nombre, int edad, Mascota mascota) {
        super(salario, horaSalida, horaEntrada, nombre, edad, mascota);
        this.numAlumnos = numAlumnos;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
    /**
     * Este metodo muestra que materia se esta reprobando
     * @param materia Es la meteria que se reprueba
     */
    public void reprobar(String materia){
        System.out.println("estas reprobado "+materia);
    }
    /**
     * Este metodo demuestra que ya se paso la materia
     * @param materia2 Es la materia que se paso
     */
    
    public void pasarAlumno(String materia2){
        System.out.println("pasaste la materia "+materia2);
        
    }
    /**
     * Este metodo muestra que tema se esta explicando
     * No retorna ningun valor
     */
    public void explicar(){
        System.out.println("Estoy explican el tema 2");
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "numAlumnos=" + numAlumnos + '}';
    }
    
    
}
