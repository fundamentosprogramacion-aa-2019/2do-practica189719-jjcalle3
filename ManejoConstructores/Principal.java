/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoConstructores;

/**
 *
 * @author COMPUMARS
 */
public class Principal {
    public static void main(String[] args){
        
        Entrenador entrenador1 = new Entrenador();
        Entrenador entrenador2 = new Entrenador();
        entrenador1.setNombre("Rene");
        entrenador1.setEdad(35);
        entrenador1.setDeporte("Futbol");
        System.out.printf("Nombre %s - Edad %d \n",entrenador1.getNombre(),
                entrenador1.getEdad(), entrenador1.getDeporte());
        System.out.printf("Nombre %s - Edad %d \n",entrenador2.getNombre(),
                entrenador2.getEdad(), entrenador2.getDeporte());
        //proceso de cambio de valores
        entrenador1.setNombre("Rolando");
        
        System.out.printf("entrenador1 Nombre %s - Edad %d - Deporte %s \n", 
                entrenador1.getNombre(), entrenador1.getEdad(), 
                entrenador1.getDeporte());
    }
}
