/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.login;

import org.andercabrera.login.Login;
import java.util.ArrayList;

/**
 * @author Deran
 */
public class controladorLogin {

    private ArrayList<String> users = new ArrayList<String>();
    private ArrayList<String> passwords = new ArrayList<String>();
    boolean login = false;
    private static controladorLogin instance = null;

    public boolean getLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
    
    public static controladorLogin getInstance() {
        if (instance == null) {
            instance = new controladorLogin();
        }
        return instance;
    }

    // public void addUserLogin(Login login) {
    //     listaLogin.add(login);
    // }
    public void mostrarUsuario(Login login) {
        System.out.println("Usuario: " + login.getUser());
        System.out.println("Contraseña: " + login.getPassword());
    }

    // public ArrayList<Login> getListaLogin() {
    //     return listaLogin;
    // }
    public void createUser(String name) {
        users.add(name);
    }

    public void createPassword(String password) {
        passwords.add(password);
    }

    public boolean login(String name, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(name) && passwords.get(i).equals(password)) {
                login = true;
                break;
            }
        }
        return login;
    }

    public void showUsers() {
        for (String users : users) {
            System.out.println(users);
        }
    }

    public void showPasswords() {
        for (String passwords : passwords) {
            System.out.println(passwords);
        }
    }
}
