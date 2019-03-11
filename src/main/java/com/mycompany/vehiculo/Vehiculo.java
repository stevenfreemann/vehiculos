/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculo;

/**
 *
 * @author Wilson Steven Rodriguez
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    /**
     * constructor variables padres
     * @param marca
     * @param modelo 
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    /**
     * metodo padre para la informacion de todos los vehiculos
     */
    public void infoVehiculo(){
        
    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
