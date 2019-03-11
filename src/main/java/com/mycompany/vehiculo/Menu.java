/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wilson Steven Rodriguez
 */
public class Menu {
        
       

    /**
     *metodo para almacenar e imprimir variables
     */
    public Menu(){
        /**
         * llenado de datos a cada objeto tipo vehiculo
         */
                
        Vehiculo tablaSkate1 = new Skateboard((float)40.5,"amateur","xtreme"); 
        Vehiculo tablaSkate2 = new Skateboard((float)40.5,"element","2.0"); 
        Vehiculo bicicleta1 = new Bici(2,"Element","semicarreras"); 
        Vehiculo bicicleta2 = new Bici(4,"Zero","Todoterreno"); 
        Vehiculo jet = new Jet(4,"Diesel","AXS","2017"); 
        Vehiculo auto = new Carro((float)400,"corriente","Chevrolet","Aveo");
        /**
         * llenado de la lista tipo objetos
         */
        
        List <Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(tablaSkate1);
        vehiculos.add(tablaSkate2);
        vehiculos.add(bicicleta1);
        vehiculos.add(bicicleta2);
        vehiculos.add(jet);
        vehiculos.add(auto);
        /**
         * ciclo donde se hace la instancia dependiendo del objeto y la dicha impresion
         */
        
        for (Vehiculo vehi:vehiculos){
           if(vehi instanceof Carro){
                Carro automovil=(Carro)vehi;
                automovil.infoVehiculo();
                System.out.println("-------->"+automovil.getMarca());
                System.out.println("-------->"+automovil.getModelo());
                System.out.println("-------->"+automovil.getTipoGasolina());
                System.out.println("-------->"+automovil.getCilindraje());
            }
            else if(vehi instanceof Jet){
                Jet avion=(Jet)vehi;
                jet.infoVehiculo();
                System.out.println("-------->"+avion.getMarca());
                System.out.println("-------->"+avion.getModelo());
                System.out.println("-------->"+avion.getCantidadMotores());
                System.out.println("-------->"+avion.getTipoGasolina());
            }
            else if(vehi instanceof Bici){
                Bici bicicleta=(Bici)vehi;
                bicicleta.infoVehiculo();
                System.out.println("-------->"+bicicleta.getMarca());
                System.out.println("-------->"+bicicleta.getModelo());
                System.out.println("-------->"+bicicleta.getNumeroPiñones());
            }
            else if(vehi instanceof Skateboard){
                Skateboard tabla=(Skateboard)vehi;
                tabla.infoVehiculo();
                System.out.println("-------->"+tabla.getMarca());
                System.out.println("-------->"+tabla.getModelo());
                System.out.println("-------->"+tabla.getTamano());
            }
        
        }
        
    }
}
