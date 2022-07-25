/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package org.andercabrera.modelo;

import java.util.ArrayList;

/**
 * @author Ander Cabrera
 */
public class Hotel {
    private String nombreHotel;
    private String paisHotel;
    private String ciudadHotel;
    private int Precio;
    private int numeroEstrellas;
    private int telefonoHotel;
    private int idHotel;
    ArrayList<Hotel> listaHoteles = new ArrayList<Hotel>();

    // singleton
    private static Hotel instance = null;

    public static Hotel getInstance() {
        if (instance == null) {
            instance = new Hotel();
        }
        return instance;
    }

    public Hotel() {

    }

    public Hotel(String nombreHotel, String paisHotel, String ciudadHotel, int Precio, int numeroEstrellas, int telefonoHotel, int idHotel) {
        this.nombreHotel = nombreHotel;
        this.paisHotel = paisHotel;
        this.ciudadHotel = ciudadHotel;
        this.Precio = Precio;
        this.numeroEstrellas = numeroEstrellas;
        this.telefonoHotel = telefonoHotel;
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getPaisHotel() {
        return paisHotel;
    }

    public void setPaisHotel(String paisHotel) {
        this.paisHotel = paisHotel;
    }

    public String getCiudadHotel() {
        return ciudadHotel;
    }

    public void setCiudadHotel(String ciudadHotel) {
        this.ciudadHotel = ciudadHotel;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public int getNumeroEstrellas() {
        return numeroEstrellas;
    }

    public void setNumeroEstrellas(int numeroEstrellas) {
        this.numeroEstrellas = numeroEstrellas;
    }

    public int getTelefonoHotel() {
        return telefonoHotel;
    }

    public void setTelefonoHotel(int telefonoHotel) {
        this.telefonoHotel = telefonoHotel;
    }

    public ArrayList<Hotel> getListaHoteles() {
        return listaHoteles;
    }
}
