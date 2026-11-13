/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observador_cambiodivisas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class CasaCambio implements Sujeto
{
    private List<Observer> listaObservadores = new ArrayList();
    
    @Override
    public void registraObservador(Observer observador) {
        listaObservadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observer observador) {
        listaObservadores.remove(observador);
    }

    @Override
    public void notificarObservador(double cambio) {
        for (Observer observador : listaObservadores) 
        {
            observador.convertir(cambio);
        }
    }
    
    public void cambiarEstado(double cambio)
    {
        notificarObservador(cambio);
    }
    
}
