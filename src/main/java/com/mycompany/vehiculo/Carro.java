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
public  class Carro extends Motorizado{
    private float cilindraje;
    /**
     * constructor variables del carro
     * @param cilindraje
     * @param tipoGasolina
     * @param marca
     * @param modelo 
     */
    public Carro(float cilindraje,String tipoGasolina, String marca, String modelo) {
        super(tipoGasolina, marca, modelo);
        this.cilindraje= cilindraje;
    }
    /**
     * metodo que sobreescribe el del padre
     */
    @Override
    public void infoVehiculo(){
        System.out.println("Informacion especializada de carro a vehiculo");
    
    
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
    
}
