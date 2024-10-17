
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (Vivero, Sergio E) 
 * @version (3/10/24)
 */
public class Cuadrado extends Rectangulo
{   
    private Punto origen;
    private double lado;
    
    public Cuadrado(Punto p_origen, double p_lado){
    super(p_origen, p_lado, p_lado);
    this.setOrigen(p_origen);
    this.setLado(p_lado);
    }
    
    //SETTERS
    private void setOrigen(Punto p_origen){
        this.origen= p_origen;
    }
    
    private void setLado(double p_lado){
        this.lado= p_lado;
    }
    //GETTERS
    
    public Punto getOrigen(){
        return this.origen;
    }
    
    public double getLado(){
        return this.lado;
    }
    
    
    public String nombreFigura(){
    return "***Cuadrado***";
    }

    public void caracteristicas(){
        this.nombreFigura();
        System.out.println(this.getOrigen().coordenadas()+"\t" +" Lado: " +getLado());
        System.out.println("Superficie" + super.superficie() + "-" + "Perimetro:" + super.perimetro());
            
            
    }
    
}

