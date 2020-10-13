/*
 * Acaba la clase Triangulo con el/los constructores, accesores (get/set)
 * método toString().
 * fecha limite: 15/10/2010 19:00
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class Triangulo {
    
    // propiedades
    private double base;
    private double altura;
    
    //Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Getters/Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //toString
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    /* Calcula el área de este triangulo */
    public double Area(){
        return base*altura/2;
    }
    
    /* Calcula el perímetro de este triangulo conocida su base y altura */
     public double Perimetre(){
         return Hipotenusa()*2+ base;
    }
   
     public double Hipotenusa(){
        return Math.sqrt(base/2 + altura*altura);
     }
    
     public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(19.0, 17.0);
         System.out.println(triangulo.Area());
         System.out.println(triangulo.Perimetre());
         System.out.println(triangulo.Hipotenusa());
    }
}