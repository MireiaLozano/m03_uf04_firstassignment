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
public class BuquePetrolero extends BarcoDeMercancias{
        private int numeroBarriles;
        private int litrosPetroleo;

    public BuquePetrolero(int numeroBarriles, int litrosPetroleo, int tiposMercancias, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tiposMercancias, motor, eslora, manga, nudos, peso);
        this.numeroBarriles = numeroBarriles;
        this.litrosPetroleo = litrosPetroleo;
    }
        
     public void arranca(){
         System.out.println("Arrancando buque de petroleo");
     }
     
     public void atraca(){
         System.out.println("Atracando buque de petroleo");
     }
}
