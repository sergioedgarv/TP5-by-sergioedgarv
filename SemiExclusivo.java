/**
 * Write a description of class SemiExclusivo here.
 * 
 * @author (Vivero, Sergio E) 
 * @version (10/10/24)
 */
public class SemiExclusivo extends Cargo
{
    private int horasDeInvestigacion;
    
    public SemiExclusivo(int p_horasDeInvestigacion, String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso,
    int p_horasDeDocencia){
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso,p_horasDeDocencia);
        this.setHorasDeInvestigacion(p_horasDeInvestigacion);
    }
    
    private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion= p_horasDeInvestigacion;
    }
    
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public void mostrarCargo(){
        System.out.println("----Cargo de caracter SemiExclusivo----");
        System.out.println("Horas investigación:" + this.getHorasDeInvestigacion());
    }
}
