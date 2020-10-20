/*
 * FIRST ASSIGNMENT
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class M03_UF04_FirstAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barco barco1 = new Yate(true, 4, 6, new Motor(345), 20.0, 12.5, 23, 71);
        barco1.arranca();
        
        Barco barco2 = new Portaviones(35, new Motor(456), 250, 75, 46, 60000, 7);
        barco2.arranca();
        
        BarcoDeMercancias buque1 = new PortaContenedores(450, "Contenedores", 850.5, (new Motor(546)), 400, 59, 25, 14);
        System.out.println(buque1);
        buque1.arranca();
        
        BarcoDeMercancias buque2 = new BuquePetrolero(2000000, "Derivados del petróleo", 450.7, (new Motor(645)), 458, 48, 12, 158);
        System.out.println(buque2);
        buque2.arranca();
        
        BarcoDeMercancias buque3 = new BuqueQuimico(250000, 6, "Fenol, Hidróxido de sodio, Metanol, Ácido sulfúrico, Ácido nítrico y Tolueno" , "Productor químicos", 4780.8, (new Motor(780)), 150, 92.86, 25, 14);
        System.out.println(buque3);
        buque3.arranca();
       
        
       //System.out.println(barco1 instanceof Portaviones);
       /* // Prueba to código aquí
        CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
        System.out.println(cc1);
        cc1.ingresa(123.09);
        System.out.println(cc1);
        cc1.abona(98.87);
        System.out.println(cc1);
*/
    }
    
}
