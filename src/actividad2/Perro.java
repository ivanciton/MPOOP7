/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Perro extends Mascota{
    private boolean colaCortada;

    public Perro() {
    }
    
    public Perro(boolean colaCortada, String color, String colorOjos, String raza, String nombre, int edad) {
        super(color, colorOjos, raza, nombre, edad);
        this.colaCortada = colaCortada;
    }

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    /**
     * Este metodo muestra que el perro esta corriendo
     * No retorna ningun valor
     */
    public void correr(){
        System.out.println("estoy corriendo ");
    }
    
    /**
     * Este metodo dice que el perro esta correteando 
     * No retorna ningun valor
     */
    public void corretear(){
        System.out.println("estoy correteando");
    }

    @Override
    public String toString() {
        return super.toString()+"Perro{" + "colaCortada=" + colaCortada + '}';
    }

    
    
}
