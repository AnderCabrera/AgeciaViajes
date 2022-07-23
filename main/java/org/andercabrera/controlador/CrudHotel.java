/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.controlador;

import org.andercabrera.modelo.Hotel;
import java.util.ArrayList;

/**
 * @author Deran
 */
public class CrudHotel {

    ArrayList<Hotel> listaHotel = new ArrayList<Hotel>();
    private static CrudHotel instancia = null;

    public static CrudHotel getInstanciaHotel() {
        if (instancia == null) {
            instancia = new CrudHotel();
        }
        return instancia;
    }
    
    // Principal admin methods
    public void agregarHotel(Hotel hotel) {
        listaHotel.add(hotel);
    }

    public void eliminarHotel(Hotel hotel) {
        listaHotel.remove(hotel);
    }

    public void actualizarLibro(Hotel antiguo, Hotel actualizado) {
        int indice = listaHotel.indexOf(antiguo);
        if (indice >= 0) {
            listaHotel.set(indice, actualizado);
        }
    }

    // Principal user methods
    public Hotel findById(int id) {
        Hotel hotel = new Hotel();
        for (Hotel elemento : listaHotel) {
            if (hotel.getIdHotel() == id) {
                hotel = elemento;
                break;
            }
        }
        return hotel;
    }

    public ArrayList<Hotel> listarHoteles() {
        return listaHotel;
    }

    public Hotel buscarHotel(Hotel id) {
        return listaHotel.get(listaHotel.indexOf(id));
    }
}
