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

    public BuqueQuimico(int num_tanques, int tiposdeQuimicos, String nombresTiposdeQuimicos, String tiposMercancias, double capacidadCarga, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tiposMercancias, capacidadCarga, motor, eslora, manga, nudos, peso);
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

    @Override
    public void abandonenElBarco() {
        super.abandonenElBarco();
        System.out.println("Hay un incendio y la mercancía es frágil, todos fuera!");//To change body of generated methods, choose Tools | Templates.
    }
}
