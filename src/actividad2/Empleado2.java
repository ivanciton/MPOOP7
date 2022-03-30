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
public class Empleado2 extends Persona{
    private int salario;
    private int horaSalida;
    private int horaEntrada;

    public Empleado2() {
    }

    public Empleado2(int salario, int horaSalida, int horaEntrada) {
        this.salario = salario;
        this.horaSalida = horaSalida;
        this.horaEntrada = horaEntrada;
    }

    public Empleado2(int salario, int horaSalida, int horaEntrada, String nombre, int edad, Mascota mascota) {
        super(nombre, edad, mascota);
        this.salario = salario;
        this.horaSalida = horaSalida;
        this.horaEntrada = horaEntrada;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    /**
     * Este metodo pregunta si hay alguna duda
     * No retorno nada
     */
    public void aclararDuda(){
        System.out.println("¿En que puedo ayudarte?");
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "salario=" + salario + ", horaSalida=" + horaSalida + ", horaEntrada=" + horaEntrada + '}';
    }

    
    
}
