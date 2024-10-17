import java.util.Calendar;
/**
 * Write a description of class Cargo here.
 * 
 * @author (Vivero, Sergio E) 
 * @version (10/10/24)
 */
public class Cargo {   
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    
    public Cargo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia){
        //super(p_nombreCargo, p_sueldoBasico, p_anioIngreso, p_horasDeDocencia);
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(p_horasDeDocencia);
        
    }
    
    //setter
    
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo= p_nombreCargo;
    }
    
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico= p_sueldoBasico;
    }
    
    private void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso= p_anioIngreso;
    }
    
    private void setHorasDeDocencia(int p_horasDeDocencia){
        this.horasDeDocencia= p_horasDeDocencia;
    }

    //getters

    public String getNombreCargo(){
        return this.nombreCargo;
    }

    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

    public int getAnioIngreso(){
        return this.anioIngreso;
    }

    public int getHorasDeDocencia(){
        return this.horasDeDocencia;
    }

    //metodos
    
    /* 
    En la clase Cargo, es necesario determinar la antigüedad de permanencia en el cargo, un adicional que calcule un 1%
    del sueldo básico por año de antigüedad, y el sueldo del cargo, que es la suma del sueldo básico mas el adicional.
    Asimismo, un cargo puede ser Simple, SemiExclusivo o Exclusivo. Cuando el cargo es simple, la cantidad total de
    horas es 10, y son todas dedicadas a la docencia. En el cargo SemiExclusivo la cantidad total de horas es 20, con 10
    hs. de docencia como mínimo, y las 10 restantes pueden ser dedicadas a la investigación o a la docencia. En el caso de
    los cargos Exclusivos, la cantidad de horas de docencia, de investigación y de extensión pueden variar.
    El método mostrarCargo() de la clase Cargo visualiza los datos del cargo con el siguiente diseño:
    JTP-Programación OO - Sueldo Basico: 800.0 - Sueldo Cargo: 904.0 – Antiguedad: 10 años
    Horas Docencia: 10*/

    
    public int antiguedad(){
      int anio = Calendar.getInstance().get(Calendar.YEAR);
      return anio-this.getAnioIngreso();
   }
    
    private double adicionalXAntiguedad(){
        double adicional= this.getSueldoBasico() * 0.01 * antiguedad();
        return adicional;
    }
    
    public double sueldoDelCargo(){
        return this.adicionalXAntiguedad() + this.getSueldoBasico();
    }
    /* En la clase Profesor se debe obtener el sueldo total, sumando los sueldos de cada cargo que posea el profesor.
Además, se desea listar los cargos de cada profesor, según el siguiente diseño:
-***** Cargos Asignados *****-
---------------------------------------
JTP-Programación OO - Sueldo Basico: 800.0 - Sueldo Cargo: 904.0 - Antiguedad: 10 años
Horas Docencia: 10
Titular-TFA - Sueldo Basico: 1400.0 - Sueldo Cargo: 1484.0 - Antiguedad: 12 años
Horas Docencia: 20
----Cargo de caracter SemiExclusivo----
Horas investigación: 0
JTP-Analisis de Sistemas - Sueldo Basico: 800.0 - Sueldo Cargo: 872.0 - Antiguedad: 20 años
Horas Docencia: 10*/

    public void mostrarCargo(){
        System.out.println("JTP-Programación OO " + " - " + " Sueldo Basico: " + this.getSueldoBasico() + " - " + "Sueldo Cargo:" 
        + this.sueldoDelCargo() + " - " + "Antiguedad: " + this.antiguedad() + "años" + "Horas Docencia: " 
        + getHorasDeDocencia());
         
    }
}
