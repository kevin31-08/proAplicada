/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observador_cambiodivisas;

/**
 *
 * @author Estudiante
 */
public class Observador_CambioDivisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creacion de los sujetos
        CasaCambio casaEuro = new CasaCambio();
        CasaCambio casaPeso = new CasaCambio();
        
        //Crear las personas
        Observer p1 = new Persona(01,"Ana",125);
        Observer p2 = new Persona(02, "Miguel", 12.0);
        Observer p3 = new Persona(03, "Juan", 5.0);
        
        //Suscribir el observador al sujeto(casa de cambio)
        casaEuro.registraObservador(p1);
        casaEuro.registraObservador(p2);
        casaEuro.registraObservador(p3);
        
        casaPeso.registraObservador(p1);
        
        
        //Cambiar Estado
        casaEuro.cambiarEstado(0.53);
        casaEuro.cambiarEstado(0.63);
        //Si la diferencia es de 0.10 no notifique
        //Si la diferecia  es mayor a 0.10 hasta 0.50 notifique a solo las personas tipo platino
        //Si la diferencia es mayor a 0.50 notifique a todas las personas 
        //1.platino
        //2.gold
        
        //casaPeso.cambiarEstado(20.25);

  
        
        
    }
    
}
