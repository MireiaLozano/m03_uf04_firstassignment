/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cat.copernic.review;


import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ferry extends BarcoDePasajeros{
        private int vehiculos;
        private int numVehiculos;

    public Ferry(int vehiculos, int numVehiculos, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(camarotes, pasajeros, motor, eslora, manga, nudos, peso);
        this.vehiculos = vehiculos;
        this.numVehiculos = numVehiculos;
    }

 
        
}
