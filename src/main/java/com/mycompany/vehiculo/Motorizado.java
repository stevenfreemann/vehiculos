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
public abstract class Motorizado extends Vehiculo{
    private String tipoGasolina;
    /**
    * contructor con variables de la clase abstracta tipo vehiculo motorizado 
    * @param tipoGasolina
    * @param marca
    * @param modelo 
    */
    public Motorizado(String tipoGasolina,String marca, String modelo) {
        super(marca, modelo);
        this.tipoGasolina= tipoGasolina;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    
    }
    

