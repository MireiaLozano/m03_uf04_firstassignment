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
public abstract class BarcoDeMercancias extends Barco {
        private String tiposMercancias;
        private double capacidadCarga;

    public BarcoDeMercancias(String tiposMercancias, double capacidadCarga, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor, eslora, manga, nudos, peso);
        this.tiposMercancias = tiposMercancias;
        this.capacidadCarga = capacidadCarga;
    }
   
    @Override
    public void arranca(){
        System.out.println("Arrancando barco de mercancias");
    }
    
    @Override
     public void atraca(){
        System.out.println("Atracando barco de mercancias");
    }
     
     public void abandonenElBarco() {
        System.out.println("Tiren la mercancía al mar o saquen lo que puedan y salgan del barco");
    }
     
     public void comportamiento(){
         System.out.println("Salven toda la mercancía posible");
     }
}
