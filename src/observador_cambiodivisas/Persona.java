/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observador_cambiodivisas;

/**
 *
 * @author Estudiante
 */
public class Persona implements Observer
{

    private int codigo;
    private String nombre;
    private double saldo;

    public Persona(int codigo, String nombre, double saldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    @Override
    public void convertir(double cambio)
    {
        System.out.println("Cuenta: " + nombre + "valor en $: " + saldo + "cotizacion: " + (saldo*cambio));
    }
    
    
}
