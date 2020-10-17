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
public class Velero extends BarcoDePasajeros {
        private int velas;
        private int numVelas;

    public Velero(int velas, int numVelas, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(camarotes, pasajeros, motor, eslora, manga, nudos, peso);
        this.velas = velas;
        this.numVelas = numVelas;
    }
 @Override
    public void abandonenElBarco() {
        System.out.println("Abandono el barco con clase");
    }

        
}
