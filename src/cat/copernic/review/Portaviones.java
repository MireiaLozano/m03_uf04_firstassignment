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
public class Portaviones extends BarcoDeGuerra {
    private int numero_aviones;

    public Portaviones(int numero_aviones, Motor motor, double eslora, double manga, int nudos, int peso, int cañones) {
        super(motor, eslora, manga, nudos, peso, cañones);
        this.numero_aviones = numero_aviones;
    }
    
    public void arranca(){
        System.out.println("Arrancando barco de guerra portaviones");
    }
    
    public void atraca(){
        System.out.println("Atracando barco de guerra portaviones");
    }

}
