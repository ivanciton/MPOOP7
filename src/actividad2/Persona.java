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
public class Persona extends SerVivo {
    private Mascota mascota;

    public Persona() {
    }

    public Persona(String nombre, int edad, Mascota mascota) {
        super(nombre, edad);
        this.mascota=mascota;
    }
    
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Persona(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return super.toString()+"Persona{" + "mascota=" + mascota + '}';
    }
    

    
    
}
