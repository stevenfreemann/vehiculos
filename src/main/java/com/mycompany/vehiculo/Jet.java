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
public class Jet extends Motorizado{
    private int cantidadMotores;
    /**
     * constructor de las variables del jet
     * @param cantidadMotores
     * @param tipoGasolina
     * @param marca
     * @param modelo 
     */

    public Jet(int cantidadMotores, String tipoGasolina, String marca, String modelo) {
        super(tipoGasolina, marca, modelo);
        this.cantidadMotores = cantidadMotores;
    }
    /**
     * metodo que sobreescribe el del padre
     */
      @Override
    public void infoVehiculo(){
        System.out.println("Informacion especializada de Jet a vehiculo");
    
    
    }

    public int getCantidadMotores() {
        return cantidadMotores;
    }

    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }
    
    
}
