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
public class PortaContenedores extends BarcoDeMercancias {
   
    private int numeroContenedores;

    public PortaContenedores(int numeroContenedores, String tiposMercancias, double capacidadCarga, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tiposMercancias, capacidadCarga, motor, eslora, manga, nudos, peso);
        this.numeroContenedores = numeroContenedores;
    }
    
    @Override
    public void arranca(){
        System.out.println("Arrancando barco porta contenedores");
    }
    
    @Override
    public void atraca(){
        System.out.println("Atracando porta contenedores");
    }
    
     
}
