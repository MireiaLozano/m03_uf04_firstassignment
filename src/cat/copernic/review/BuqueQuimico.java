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
public class BuqueQuimico extends BarcoDeMercancias {
         private int num_tanques;
         private int tiposdeQuimicos;
         private String nombresTiposdeQuimicos;

    public BuqueQuimico(int num_tanques, int tiposdeQuimicos, String nombresTiposdeQuimicos, int tiposMercancias, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tiposMercancias, motor, eslora, manga, nudos, peso);
        this.num_tanques = num_tanques;
        this.tiposdeQuimicos = tiposdeQuimicos;
        this.nombresTiposdeQuimicos = nombresTiposdeQuimicos;
    }
    
    @Override
    public void arranca(){
        System.out.println("Arrancando buque químico");
    }
    
    @Override
    public void atraca(){
        System.out.println("Atracando buque químico");
    }
    
    public void abandonenElBarco(){
        System.out.println("Hay un incdencio y la mercancía es frágil, todos fuera!");
    }
    
    public void comportamiento(){
        System.out.println("Ha habido un choque y los químicos pueden explotar");
    }
}
