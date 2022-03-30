/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Gato extends Mascota{

    public Gato() {
    }

    public Gato(String color, String colorOjos, String raza, String nombre, int edad) {
        super(color, colorOjos, raza, nombre, edad);
    }
    /**
     * Este metodo dice que el gato esta rasguñando 
     * No retorna ningun valor
     */
    public void rasguniar(){
        System.out.println("rasguñando");
        
    }
    /**
     * Este metodo muestra que el gato esta trepando
     * No retorno ningun valor
     */
    public void trepar(){
        System.out.println("estoy trepando");
    }

    @Override
    public String toString() {
        return super.toString()+"Gato{" + '}';
    }
    


    
}
