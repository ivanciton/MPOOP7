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
public class Mesero extends Empleado2{
    private String restaurante;
    private int numMesas;
    private String colorUniforme;

    public Mesero() {
    }

    public Mesero(String restaurante, int numMesas, String colorUniforme) {
        this.restaurante = restaurante;
        this.numMesas = numMesas;
        this.colorUniforme = colorUniforme;
    }

    public Mesero(String restaurante, int numMesas, String colorUniforme, int salario, int horaSalida, int horaEntrada) {
        super(salario, horaSalida, horaEntrada);
        this.restaurante = restaurante;
        this.numMesas = numMesas;
        this.colorUniforme = colorUniforme;
    }

    public Mesero(String restaurante, int numMesas, String colorUniforme, int salario, int horaSalida, int horaEntrada, String nombre, int edad, Mascota mascota) {
        super(salario, horaSalida, horaEntrada, nombre, edad, mascota);
        this.restaurante = restaurante;
        this.numMesas = numMesas;
        this.colorUniforme = colorUniforme;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }
    /**
     * Este metodo recibe el pedido del cliente
     * No retorna ningun valor
     */
    public void recibirPedidos(){
        System.out.println("Hola,¿cual es su orden?");
    }
    /**
     * Este metodo da el pedido al cliente
     * No retorna ningun valor
     */
    public void darPedidos(){
        System.out.println("Aqui esta su pedido");
    }
    /**
     * Este metodo muestra un agradecimiento por la propina
     * @param propina  Recibe la cantidad de dinero 
     * No retorna ningun valor
     */
    public void recibirPropina(int propina){
        System.out.println("gracias por $"+propina+ " de propina");
        
    }
    /**
     * Este metodo muestra que el mesero esta descansando
     * No retorna ningun valor
     */
    public void tomarDescanso(){
        System.out.println("estoy descansando");
    }
    
    @Override
    public String toString() {
        return super.toString()+"Mesero{" + "restaurante=" + restaurante + ", numMesas=" + numMesas + ", colorUniforme=" + colorUniforme + '}';
    }
    
    

    
    
}
