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
public class Bici extends Vehiculo{
    private int numeroPiñones;
    /**
     * contructor variables de la bicicleta
     * @param numeroPiñones
     * @param marca
     * @param modelo 
     */

    public Bici(int numeroPiñones, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPiñones = numeroPiñones;
    }
    /**
     * metodo que sobreescribe la informacion del vehiculo
     */
      @Override
    public void infoVehiculo(){
        System.out.println("Informacion especializada de Bicicleta a vehiculo");
    
    
    }

    public int getNumeroPiñones() {
        return numeroPiñones;
    }

    public void setNumeroPiñones(int numeroPiñones) {
        this.numeroPiñones = numeroPiñones;
    }
    
    
}
