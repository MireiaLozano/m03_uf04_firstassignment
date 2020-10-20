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

    public BuquePetrolero(int numeroBarriles, String tiposMercancias, double capacidadCarga, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tiposMercancias, capacidadCarga, motor, eslora, manga, nudos, peso);
        this.numeroBarriles = numeroBarriles;
    }
            
    @Override
     public void arranca(){
         System.out.println("Arrancando buque de petroleo");
     }
     
     @Override
     public void atraca(){
         System.out.println("Atracando buque de petroleo");
     }
     
     public void abandonenElBarco(){
         System.out.println("Abandonen rápidamente el barco");
     }
     
     public void comportamiento(){
         System.out.println("Defiendan los barriles, nos roban!");
     }
     
}
