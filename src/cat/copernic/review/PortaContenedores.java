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

    public PortaContenedores(int numeroContenedores, int tiposMercancias, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tiposMercancias, motor, eslora, manga, nudos, peso);
        this.numeroContenedores = numeroContenedores;
    }
    
    @Override
    public void arranca(){
        System.out.println("Arrancando barco porta conenedores");
    }
    
    @Override
    public void atraca(){
        System.out.println("Atracando porta contenedores");
    }
    
    public void abandonenElBarco(){
        System.out.println("Hay un incendio en el barco, salven los contenedores posibles y abandonen el barco");
    }
    
    public void comportamiento(){
        System.out.println("Tiren la mercancía");
    }
    
    
}
