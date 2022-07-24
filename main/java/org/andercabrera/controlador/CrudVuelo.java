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
    private static CrudVuelo instancia = null;
    
    public static CrudVuelo getInstanciaVuelo() {
        if (instancia == null) {
            instancia = new CrudVuelo();
        }
        return instancia;
    }
    
    // Principal admin methods
}
