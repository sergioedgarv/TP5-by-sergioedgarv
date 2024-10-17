/**
 * Abstraccion de rectangulo.
 * 
 * @author (Vivero, Sergio Edgardo) 
 * @version (30/08/2024)
 */
public class Rectangulo
{
    private Punto origen;
    private double ancho;
    private double alto;

    Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    Rectangulo(double p_ancho, double p_alto){
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    //nombreFigura
    
    private void setAncho(double p_ancho){
        this.ancho= p_ancho;
    }

    private void setAlto(double p_alto){
        this.alto= p_alto;
    } 

    private void setOrigen(Punto p_origen){
        this.origen= p_origen;
    }

    public double getAncho(){
        return this.ancho;
    }

    public double getAlto(){
        return this.alto;
    }

    public Punto getOrigen(){
        return this.origen;
    }

    public void desplazar(double p_dx, double p_dy){
        this.origen.desplazar(p_dx, p_dy);
    }

    /******* Rectangulo ******
Origen: (0.0, 0.0) - Alto: 200.0 - Ancho: 100.0
Superficie: 20000.0 - Perímetro: 600.0
 */
    public void caracteristicas(){
        System.out.println("******* Rectangulo ******");
        System.out.println("Origen: " + this.getOrigen() + "- Alto: " + this.getAlto() + "- Ancho: " + this.getAncho());
        System.out.println("Superficie: " + superficie() + "- Perímetro: " + perimetro());
    }

    
    public double perimetro(){
        return 2*(this.getAncho() + this.getAlto());
    }

    public double superficie(){
        return this.getAncho() * this.getAlto();
    }


    public double distanciaA(Rectangulo otroRectangulo){
   double x = Math.pow(this.getOrigen().getX() - otroRectangulo.getOrigen().getX(), 2);
    double y = Math.pow(this.getOrigen().getY() - otroRectangulo.getOrigen().getY(), 2);
    return Math.sqrt(x + y);
  } 


    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }
        else{
            return otroRectangulo;
        }

    }

}
