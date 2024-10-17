
/**
 * Write a description of class Facultad here.
 * 
 * @author (VIVERO, SERGIO E) 
 * @version (11/10/24)
 */

import java.util.ArrayList;

public class Facultad
{
  private String nombre;
  private ArrayList <Profesor> profesores;
  private Profesor profe;
  public Facultad (String p_nombre,Profesor p_profe)
{
    this.setNombre(p_nombre);
    this.setProfe(p_profe);
    this.setProfesores(new ArrayList <Profesor> ());
}

  public Facultad (String p_nombre,ArrayList<Profesor> p_profesores )
{
    this.setNombre(p_nombre);
    this.setProfesores(p_profesores);
}
    //setter and getter

    private void setNombre(String p_nombre){
        this.nombre= p_nombre;
    }
    
    private void setProfe(Profesor p_profe){
      this.profe= p_profe;  
    }
    
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores= p_profesores;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Profesor getProfe(){
        return this.profe;
    }
    
        public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    
    /**************** Nómina Facultad: FaCENA
        ------------------------------------------------------------------
        DNI: 21.859.361 Nombre: Juan Perez - Sueldo Total: 3260.0
        DNI: 23.451.992 Nombre: Mirta Lopez - Sueldo Total: 3306.0
        ------------------------------------------------------------------
        Total a pagar: $6566.0 */ 
    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: Facena ***************");
        for(Profesor profe: this.getProfesores()){
        System.out.println(profe.mostrarLinea());            
        }
    }
    
    public double totalAPagar(){
        double total= 0;
        for(Profesor profe: this.getProfesores()){
        total = (profe.sueldoTotal());
        }
        return total;
    }
    
    public int contarProfes()
    {
        int totalProfes=0;
        for(Profesor profe: this.getProfesores())
        {
            totalProfes+=1;
        }
        return totalProfes;
    }
    /*
     * ***** Detalle de Profesores y cargos de Facultad: FaCENA ****
     * ***** Nombre y Apellido: Juan Perez
DNI: 28596132 Edad: 37 años
Titulo: Lic. en Sistemas de Información
-***** Cargos Asignados *****-
------------------------------
JTP-Programación OO - Sueldo Basico: 800.0 - Sueldo Cargo: 904.0 - Antiguedad: 10 años
Horas Docencia: 10
Titular-TFA - Sueldo Basico: 1400.0 - Sueldo Cargo: 1484.0 - Antiguedad: 12 años
Horas Docencia: 20
----Cargo de caracter SemiExclusivo----
Horas investigación: 0
JTP-Analisis de Sistemas - Sueldo Basico: 800.0 - Sueldo Cargo: 872.0 - Antiguedad: 20 años
Horas Docencia: 10
** Sueldo Total: 3260.0 **
------------------ **** -------------------
Nombre y Apellido: Mirta Lopez
DNI: 34519921 Edad: 30 años
Titulo: Lic. en Sistemas de Información
-***** Cargos Asignados *****-
------------------------------
JTP-TP-II - Sueldo Basico: 1200.0 - Sueldo Cargo: 1344.0 - Antiguedad: 11 años
Horas Docencia: 10
JTP-Ing.Soft - Sueldo Basico: 1800.0 - Sueldo Cargo: 1962.0 - Antiguedad: 10 años
Horas Docencia: 10
----Cargo de caracter Exclusivo----
Horas investigación: 20
Horas extension: 10
** Sueldo Total: 33060.0 **
------------------------------------------------------------------
Hay 2 profesores*/
    public void listarProfesorCargos(){
            System.out.println("***** Detalle de Profesores y cargos de Facultad: FaCENA ****");
            for(Profesor profe: this.getProfesores()){
                System.out.println(profe.mostrarLinea());
            }
                        for(Profesor profe: this.getProfesores()){
                System.out.println(profe.getTitulo());
                profe.listarCargos();

            }
            System.out.println("-***** Cargos Asignados *****-");
            System.out.println("Sueldo total:" + this.totalAPagar());
            System.out.println("Hay en total de Profesores: " + this.contarProfes());
    }
}
