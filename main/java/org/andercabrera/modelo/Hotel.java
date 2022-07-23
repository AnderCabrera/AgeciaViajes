 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.modelo;

/**
 * @author Ander Cabrera
 */
public class Hotel {
    private String nombreHotel;
    private String paisHotel;
    private String direccionHotel;
    private String emailHotel;
    private String ciudadHotel;
    private int idHotel;
    private int numeroEstrellas;
    private int categoriaHotel;
    private int telefonoHotel;

    public Hotel() {
    }

    public Hotel(String nombreHotel, String paisHotel, String direccionHotel, String emailHotel, String ciudadHotel, int idHotel, int numeroEstrellas, int categoriaHotel, int telefonoHotel) {
        this.nombreHotel = nombreHotel;
        this.paisHotel = paisHotel;
        this.direccionHotel = direccionHotel;
        this.emailHotel = emailHotel;
        this.ciudadHotel = ciudadHotel;
        this.idHotel = idHotel;
        this.numeroEstrellas = numeroEstrellas;
        this.categoriaHotel = categoriaHotel;
        this.telefonoHotel = telefonoHotel;
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

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getEmailHotel() {
        return emailHotel;
    }

    public void setEmailHotel(String emailHotel) {
        this.emailHotel = emailHotel;
    }

    public String getCiudadHotel() {
        return ciudadHotel;
    }

    public void setCiudadHotel(String ciudadHotel) {
        this.ciudadHotel = ciudadHotel;
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

    public int getCategoriaHotel() {
        return categoriaHotel;
    }

    public void setCategoriaHotel(int categoriaHotel) {
        this.categoriaHotel = categoriaHotel;
    }

    public int getTelefonoHotel() {
        return telefonoHotel;
    }

    public void setTelefonoHotel(int telefonoHotel) {
        this.telefonoHotel = telefonoHotel;
    }

}
