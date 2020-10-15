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
        Barco barco1 = new Yate(true, 4, 6, new Motor(), 20.0, 12.5, 23, 71);
        Barco barco2 = new Portaviones(35, new Motor(), 250, 75, 46, 60000, 7);
        
        System.out.println(barco1 instanceof Portaviones);
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
