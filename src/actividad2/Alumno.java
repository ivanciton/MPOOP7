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
public class Alumno extends Persona{
    private String carrera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(String carrera, int semestre) {
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Alumno(String carrera, int semestre, String nombre, int edad, Mascota mascota) {
        super(nombre, edad, mascota);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }
    
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    /**
     * Este metodo muestra que esta aprendiendo ingles
     * No retorna ningun valor
     * 
     */
    public void apreder(){
        System.out.println("estoy aprendiendo Ingles ");
    }
    /**
     * Este metodo muestra que esta estudiando una carrera
     * @param carrera el nombre de lo que esta estudiando
     * No retorna ningun valor
     */
    public void estudiar(String carrera){
        System.out.println("estoy estudiando "+carrera);
    }
    /**
     * Este metodo muestra que el alumno se dio de baja
     * No retorna ningun valor
     */
    public void darDeBaja(){
        System.out.println("Ya me di de baja");
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
    
    
}
