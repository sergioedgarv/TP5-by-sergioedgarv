import java.util.ArrayList;

/**
 * Write a description of class Profesor here.
 * 
 * @author (Vivero, Sergio E) 
 * @version (10/10/24)
 */

public class Profesor extends Persona
{
    private String titulo; 
    private Cargo cargos;
    private ArrayList<Cargo> listaCargos;
    
    public Profesor(String p_titulo, String p_apellido, String p_nombre, int p_dni, int p_anio, Cargo p_cargos){
        super(p_apellido, p_nombre, p_dni, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
        this.setListaCargos(new ArrayList<Cargo>());
    }
    
        public Profesor(String p_titulo, String p_apellido, String p_nombre, int p_dni, int p_anio, ArrayList<Cargo> p_listaCargos){
        super(p_apellido, p_nombre, p_dni, p_anio);
        this.setTitulo(p_titulo);
        this.setListaCargos(p_listaCargos);
  
    }
    //SETTERS
    
    private void setTitulo(String p_titulo){
        this.titulo= p_titulo;
    }
    
    private void setCargos(Cargo p_cargos){
        this.cargos= p_cargos;
    }
    
    private void setListaCargos(ArrayList<Cargo> p_listaCargos){
        this.listaCargos= p_listaCargos;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public Cargo getCargos(){
        return this.cargos;
    }
    
    public ArrayList<Cargo> getListaCargos(){
        return this.listaCargos;
    }
    
    public void mostrar(){
        super.mostrar();
    }

    public void listarCargos(){
     for(Cargo cargs : this.getListaCargos() ){
         cargs.mostrarCargo();
     }
    }

    public double sueldoTotal(){
    double sueldos = 0;
   for (Cargo sueldito: this.getListaCargos()){
       sueldos =+ sueldito.sueldoDelCargo();
         
   }
    return sueldos;
}

/* DNI: 28.596.132 - Nombre: Juan Perez - Sueldo Total: 3260.0*/
    public String mostrarLinea(){
        return "DNI:" + this.getDni() + " - " + "Nombre: " + this.nomYApe() + " - " + "Sueldo Total: " + sueldoTotal() ;
    }
    
        public void agregarCargo(Cargo p_newCargo)
    {
        if(this.getListaCargos().size() <= 3){
            this.getListaCargos().add(p_newCargo);
            
        }else{
            System.out.println("¡ERROR supero el maximo de cargos por profesor!");
        }
    }
    
    
    public boolean  eliminarCargo(Cargo p_cargo)
    {
        if(this.getListaCargos().size() > 1 ){
          this.getListaCargos().remove(p_cargo);
          return true;
    }else{
        return false;
    } 
    }
}
