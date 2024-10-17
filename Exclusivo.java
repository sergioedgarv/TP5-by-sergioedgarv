
/**
 * Write a description of class Exclusivo here.
 * 
 * @author (Vivero, Sergio E) 
 * @version (10/10/24)
 */
public class Exclusivo extends Cargo
{
    private int horasDeInvestigacion;
    private int horasDeExtension;

    public Exclusivo (String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia, int p_horasDeInvestigacion, 
   int p_horasDeExtension)
    {
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso,p_horasDeDocencia);
        this.setHorasDeInvestigacion(p_horasDeInvestigacion);
        this.setHorasDeExtension(p_horasDeExtension);
        
    }
    
    //SETTERS
    
    private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion= p_horasDeInvestigacion;
    }
    
    private void setHorasDeExtension(int p_horasDeExtension){
       this.horasDeExtension= p_horasDeExtension;
    }
    
    //getters
    
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public int getHorasDeExtension(){
        return this.horasDeExtension;
    }
    
    public void mostrarCargo(){
        System.out.println("----Cargo de caracter Exclusivo----");
        System.out.println("Horas investigación:" + this.getHorasDeInvestigacion());
        System.out.println("Horas extension:" + this.getHorasDeExtension());
    }
}
