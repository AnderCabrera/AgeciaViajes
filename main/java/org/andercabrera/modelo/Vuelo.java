/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.modelo;

import java.util.ArrayList;

/**
 * @author Deran
 */
public class Vuelo {

    private String origen;
    private String destino;
    private String aerolinea;
    private String clase;
    private int id;
    private int precio;
    private int numeroPasajeros;
    ArrayList<Vuelo> listaVuelos = new ArrayList<Vuelo>();

    //singleton
    private static Vuelo instance = null;

    public static Vuelo getInstance() {
        if (instance == null) {
            instance = new Vuelo();
        }
        return instance;
    }
    
    public Vuelo() {
    }

    public Vuelo(String origen, String destino, String aerolinea, String clase, int id, int precio, int numeroPasajeros) {
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.clase = clase;
        this.id = id;
        this.precio = precio;
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public ArrayList<Vuelo> setListaVuelos(Vuelo item) {
        listaVuelos.add(item);
        return listaVuelos;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }
    
}
