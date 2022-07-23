/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.controlador;

import java.util.ArrayList;
import org.andercabrera.modelo.Pasajero;

/**
 *
 * @author Deran
 */
public class CrudPasajero {

    /**
     * Agregar Eliminar Buscar Listar Modificar Actualizar
     */

    ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>();
    private static CrudPasajero instancia = null;

    public static CrudPasajero getInstaciaPasajeros() {
        if (instancia == null) {
            instancia = new CrudPasajero();
        }
        return instancia;
    }

    // Principal admin methods
    public void agregarPasajero(Pasajero pasajero) {
        listaPasajeros.add(pasajero);
    }

    public void eliminarPasajeros(Pasajero pasajero) {
        listaPasajeros.remove(pasajero);
    }

    public Pasajero buscarPasajero(int id) {
        Pasajero pasajero = new Pasajero();
        for (Pasajero identificator : listaPasajeros) {
            if (identificator.getIdPasajero() == id) {
                pasajero = identificator;
                break;
            }
        }
        return pasajero;
    }

    public ArrayList<Pasajero> listarPasajeros() {
        return listaPasajeros;
    }

    public void modificarPasajero(Pasajero antiguo, Pasajero actualizado) {
        int indice = listaPasajeros.indexOf(antiguo);
        if (indice >= 0) {
            listaPasajeros.set(indice, actualizado);
        }
    }
}
