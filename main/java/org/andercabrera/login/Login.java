/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.login;

import java.util.ArrayList;

/**
 * @author Deran
 */

public class Login {
    private String user;
    private String password;
    private boolean verify;

    public Login() {
        
    }
    
    public Login(String user, String password, boolean verify) {
        this.user = user;
        this.password = password;
        this.verify = verify;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerify() {
        return verify;
    }

    public void setVerify(boolean verify) {
        this.verify = verify;
    }
}
