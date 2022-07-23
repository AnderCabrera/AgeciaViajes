/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.andercabrera.controlador;

import java.util.ArrayList;
import org.andercabrera.modelo.Vuelo;
/**
 *
 * @author Deran
 */
public class CrudVuelo {
    ArrayList<Vuelo> listaVuelos = new ArrayList<Vuelo>();
    private static CrudVuelo instancia = null;
    
    public static CrudVuelo getInstanciaVuelo() {
        if (instancia == null) {
            instancia = new CrudVuelo();
        }
        return instancia;
    }
    
    // Principal admin methods
    public void agregarVuelo(Vuelo vuelo) {
        listaVuelos.add(vuelo);
    }
    
    public void eliminarVuelo(Vuelo vuelo) {
        listaVuelos.remove(vuelo);
    }

    public void actualizarVuelo(Vuelo antiguo, Vuelo actualizado) {
        int indice = listaVuelos.indexOf(antiguo);
        if (indice >= 0) {
            listaVuelos.set(indice, actualizado);
        }
    }
    
    public ArrayList<Vuelo> listarVuelos() {
        return listaVuelos;
    }

    // Principal user methods
    public Vuelo findById(int id) {
        Vuelo vuelo = new Vuelo();
        for (Vuelo elemento : listaVuelos) {
            if (vuelo.getIdVuelo() == id) {
                vuelo = elemento;
                break;
            }
        }
        return vuelo;
    }


    public Vuelo buscarVuelo(Vuelo id) {
        return listaVuelos.get(listaVuelos.indexOf(id));
    }

    public ArrayList<Vuelo> listarVuelosPorOrigen(String origen) {
        ArrayList<Vuelo> listaVuelosPorOrigen = new ArrayList<Vuelo>();
        for (Vuelo elemento : listaVuelos) {
            if (elemento.getOrigen().equals(origen)) {
                listaVuelosPorOrigen.add(elemento);
            }
        }
        return listaVuelosPorOrigen;
    }

    public ArrayList<Vuelo> listarVuelosPorDestino(String destino) {
        ArrayList<Vuelo> listaVuelosPorDestino = new ArrayList<Vuelo>();
        for (Vuelo elemento : listaVuelos) {
            if (elemento.getDestino().equals(destino)) {
                listaVuelosPorDestino.add(elemento);
            }
        }
        return listaVuelosPorDestino;
    }
}
