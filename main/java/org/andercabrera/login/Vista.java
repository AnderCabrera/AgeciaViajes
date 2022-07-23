/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.login;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.andercabrera.login.controladorLogin;
import org.andercabrera.login.Login;

/**
 *
 * @author Deran
 */
public class Vista {
    private controladorLogin controlador = controladorLogin.getInstance();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void addUser(Login login) {
        login = pedirDatos();
    }

    public Login pedirDatos() {
        Login login = new Login();
        try {
            System.out.println("\nIngresa tu usuario");
            login.setUser(input.readLine());
            System.out.println("\nIngresa tu contra:");
            login.setPassword(input.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
        return login;
    }

    public void mostrarDatos(Login user) {
        System.out.println("-------------------------------");
        System.out.println("\nNombre: " + user.getUser());
        System.out.println("\nPassword: " + user.getPassword());
        System.out.println("-------------------------------");
    }

    public void showAllUsers() {
    }
}
