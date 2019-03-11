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
public class Skateboard extends Vehiculo{
    private float tamano;
    /**
     * contructor de las variables del objeto skateboard
     * @param tamano
     * @param marca
     * @param modelo 
     */
    public Skateboard(float tamano,String marca, String modelo) {
        super(marca, modelo);
        this.tamano=tamano;
    }
    /**
     * sobreescribe el metodo padre de informacion 
     */
      @Override
    public void infoVehiculo(){
        System.out.println("Informacion especializada de Tabla skate a vehiculo");
    
    
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }
    

 
    
}
