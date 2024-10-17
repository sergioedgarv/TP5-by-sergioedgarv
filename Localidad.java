
/**
 * Write a description of class Localidad here.
 * 
 * @author (Vivero, Sergio E.) 
 * @version (05/09/2024)
 */
public class Localidad
{
    private String nombre;
    private String provincia;
    
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(nombre);
        this.setProvincia(p_provincia);
    
    }
    
    //SETTERS
    
    private void setNombre(String p_nombre){
        this.nombre= p_nombre;
    }
    
    private void setProvincia(String p_provincia){
        this.provincia= p_provincia;
    }
    
    //GETTERS
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getProvincia(){
        return this.provincia;
    }


    public String mostrar(){
        return "Localidad: " + this.getNombre() + " Provincia: " + this.getProvincia();
    }
    


}
