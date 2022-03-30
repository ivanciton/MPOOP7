/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop7;

import actividad1.Empleado;
import actividad1.Gerente;
import actividad2.Alumno;
import actividad2.Empleado2;
import actividad2.Gato;
import actividad2.Mascota;
import actividad2.Mesero;
import actividad2.Perro;
import actividad2.Persona;
import actividad2.Profesor;
import actividad2.ProfesorAsignatura;
import actividad2.ProfesorCarrera;

/**
 *
 * @author alumno
 */
public class MPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        empleado.setNombre("Joaquin");
        empleado.setNumEmpleado(24353);
        empleado.setSueldo(10_000);
        System.out.println(empleado);
        System.out.println(empleado.toString());
        empleado.aumentarSueldo(30);
        System.out.println(empleado);
        
        Gerente gerente =new Gerente();
        gerente.setNombre("Paulina");
        gerente.setNumEmpleado(254527);
        gerente.setSueldo(30_000);
        gerente.setPresupuesto(100_000);
        gerente.aumentarSueldo(50);
        System.out.println(gerente);
        
        Gerente gerente2 =new Gerente(1_000_000,"Jose",16222,50_000);
        System.out.println(gerente2);
        Perro perro1 = new Perro(true, "cafe", "negros", "pug", "Goliath", 5);
        System.out.println(perro1);
        Gato gato1= new Gato("negro","azules","mestizo","Pancho", 5);
        System.out.println(gato1);
        
        Persona persona1= new Persona("Jose", 52, new Mascota("Negro","Azules","Pastor aleman","Black",6));
        System.out.println(persona1);
        
        Empleado2 empleado1 = new Empleado2(40_000, 9, 11,"Manuel",30, new Mascota("blanco", "cafes","boxer","Godo",4));
        System.out.println(empleado1);
        
        
        
        Alumno alumno1=new Alumno("Ingenieria petrolera", 7,"Francisco",20,new Mascota("cafe", "negro","Doverman","July", 5));
        System.out.println(alumno1);
        
        Mesero mesero1 =new Mesero("Los sietes mares",8,"azul", 5_000, 15, 8, "Jose", 21, new Mascota("gris","verde","pomerian","Leila", 10));
        System.out.println(mesero1);
        
        Profesor profesor1 = new Profesor(25, 13_000, 7, 8,"Braulio", 50, gato1);
        System.out.println(profesor1);
        
        ProfesorAsignatura profeasig =new ProfesorAsignatura(4,80, 9_000,15, 9,"Fidel", 50,new Mascota("cafe","negros","chihuahua","Bruno", 2));
        
        ProfesorCarrera profecarre =new ProfesorCarrera("calculo vectorial",40, 1_500, 12, 10,"Pedro",23,new Mascota("negro", "verdes", "Husky","Ares", 7));
        
        System.out.println(profeasig);
        System.out.println(profecarre);
        
        
    }
    
}
