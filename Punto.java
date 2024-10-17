
/**
 * Creacion de la clase "Punto" (Abstraccion de un punto)
 * Con los atributos double: x e y.
 * 
 * 
 * 
 * 
 * 
 * @author Vivero, Sergio Edgardo.
 * @version 24/08/24.
 */
public class Punto
{
    private double x;
    private double y;
    public Punto(){
        this.setX(0);
        this.setY(0);

    }
    
    /**
     * Constructor de la clase Punto que inicializa los atributos
     * con los valores proporcionados como parámetros.
     *
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }

     /**
     * Setter del atributo x
     * Asigna p_x a la x del punto.
     * @param Recibe un parámetro p_x del tipo double.
     */
    private void setX(double p_x){
        this.x= p_x;
    }
    
    /**
     * Setter del atributo y
     * Asigna p_y a la y del punto.
     * @param Recibe un parámetro p_y del tipo double.
     */
    private void setY(double p_y){
       this.y= p_y;
    }
    
     /**
     * Método getter para el atributo x.
     *
     * @return la x del punto.
     */
    public double getX(){
        return this.x;
    }

     /**
     * Método getter para el atributo y.
     *
     * @return la y del punto.
     */
    public double getY(){
        return this.y;
    }
     /*+distanciaA(p_ptoDistante: Punto): double */
     public double distanciaA (Punto p_ptoDistante){
         double distancia1= (this.getX() - p_ptoDistante.getY()); 
         double distancia2= (this.getY() - this.getY());
         double aux1= Math.pow(distancia1, 2);
         double aux2= Math.pow(distancia2, 2);
         return Math.sqrt(aux1 + aux2);
     }
    
    /**
     * El método de acceso publico desplazar() cambia la posición del punto 
     * desde (x, y) a(x+dx, y+dy).  */
    public void desplazar(double p_dx, double p_dy){
        this.x= (this.getX() + p_dx);
        this.y= (this.getY() + p_dy);
    }
    
     /**
      * El método publico mostrar() 
      * Muestra los valores del punto X y del punto Y.
      */  
        public void mostrar(){
            System.out.println("Punto. X:" + this.getX() + ", Y:" + this.getY());
    }
    
     /**
      * El método publico coordenadas() 
      * @return retorna una cadena con el formato: (7.5, 0.5)
      */  
        public String  coordenadas(){
            return "Punto. X:" + this.getX() + ", Y:" + this.getY();

    }
}