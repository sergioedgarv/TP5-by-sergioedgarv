import java.util.*;
import java.util.GregorianCalendar;
/**
 * Importamos "java.util.*" para uso del calendario mas adelante
 * Creacion de la clase "Empleado" (Abstraccion de un empleado)
 * Con diversos tipo de atributos, como los de tipo long: cuil, String: nombre, apellido.
 * de tipo entero: anioIngreso, Y double: sueldoBasico.
 * 
 * 
 * 
 * 
 * 
 * @author Vivero, Sergio Edgardo.
 * @version 07/09/24.
 */
public class Empleado extends Persona
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    private Calendar fechaIngreso;
     /**
     * Constructor de la clase Empleado que inicializa los atributos
     * con los valores proporcionados como parámetros.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio, int p_dni,int p_anioNacimiento){
        super(p_apellido, p_nombre, p_dni, p_anioNacimiento);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    /**
     *  Constructor Empleado
     *  Tiene cinco parámetros de los tipos (Largo, Cadena, Cadena, Doble, Calendar) 
     * 
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, int p_dni, int
    p_anioNacimiento){
        super(p_apellido, p_nombre, p_dni, p_anioNacimiento);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
     }
    /**
     * Setter del atributo cuil
     * Asigna p_cuil al cuil del empleado.
     * @param Recibe un parámetro p_cuil del tipo long.
     */
    private void setCuil(long p_cuil)
    {
        this.cuil= p_cuil;
    }
    
    /**
     * Setter del atributo apellido
     * Asigna p_apellido al apellido del empleado.
     * @param Recibe un parámetro p_apellido del tipo Cadena.
     */
    private void setApellido(String p_apellido){
        this.apellido= p_apellido;
    }
    
        /**
     * Setter del atributo nombre
     * Asigna p_nombre al nombre del empleado.
     * @param Recibe un parámetro p_nombre del tipo Cadena.
     */
    private void setNombre(String p_nombre){
        this.nombre= p_nombre;
    }
    
     /**
     * Setter del atributo sueldoBasico
     * Asigna p_importe al sueldoBasico del empleado.
     * @param Recibe un parámetro p_importe del tipo double.
     */
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico= p_importe;
    }
    
    /**
     * Setter del atributo anioIngreso
     * Asigna p_anio al anioIngreso del empleado.
     * @param Recibe un parámetro p_anio del tipo Calendar.
     */
    private void setAnioIngreso(int p_anio){
        this.anioIngreso= p_anio;
    }
    
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso= p_fecha;
    }
    
      /**
     * Método getter para el atributo cuil
     *
     * @return el cuil del empleado.
     */
    public long getCuil(){
        return this.cuil;
    }
    
          /**
     * Método getter para el atributo apellido
     *
     * @return el apellido del empleado.
     */
    public String getApellido(){
        return this.apellido;
    }
    
     /**
     * Método getter para el atributo nombre
     *
     * @return el nombre del empleado.
     */
    public String getNombre(){
        return this.nombre;
    }
    
     /**
     * Método getter para el atributo sueldoBasico
     *
     * @return el sueldo Basico del empleado.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
         /**
     * Método getter para el atributo anioNacimiento
     *
     * @return el año de nacimiento.
     */
    public int getAnioIngreso(){
        return this.anioIngreso;
    }

     /**
     * Método getter para el atributo anioIngreso
     *
     * @return el anioIngreso del empleado.
     */
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }

      /**
     * Método publico denominado antiguedad.
     *
     * @return retorna el calculo de antiguedad que se hizo posteriomente restando el anioHoy por el anioIngreso
     */
    public int antiguedad (){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return ( anioHoy - this.getAnioIngreso() );
    }
    
 
      /**
     * Método publico denominado descuento.
     *
     * @return retorna la variable auxiliar que hizo el calculo del descuento del
     * 2% del sueldo básico en concepto de obra social, mas $1500 de seguro de vida
     */
    private double descuento(){
        double aux= (this.getSueldoBasico() / 100) * 2 + 1500;
        return  aux;
    }

      /**
     * El método privado "adicional()" es una asignación que se realiza sobre el sueldo básico, en base a la antigüedad
     */
    private double adicional(){
        if(antiguedad() < 2){
            return (this.getSueldoBasico() / 100 * 2);
        }else if(antiguedad() >= 2 && antiguedad () < 10){
            return (this.getSueldoBasico() / 100 * 4);
        }
        else if(antiguedad() > 10){
            return (this.getSueldoBasico() / 100 * 6);
        }
        return this.getSueldoBasico();
    }
    
     /**
     * El método publico "sueldoNeto()" calcula el sueldo neto del empleado sumando los adicionales y los descuentos
     * @return retorna el calculo del mismo
     */
    public double sueldoNeto(){
    return this.getSueldoBasico() + this.adicional() - this.descuento(); 
    }

    /*  esto lo pusimos como comentario porque quiza su existencia sea alpedo   /**
     * Metodo publico de tipo String denominado "nomYApe"
     * return retorna la cadena formado entre nombre y apellido
     */
/*    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }*/
        /*
      /**
     * Metodo publico de tipo String denominado "apeYNom"
     * return retorna la cadena formado entre apellido y nombre
     */
    /*
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
*/
 

      /**
     * Metodo publico de tipo void denominado "mostrar"
     * Que muestra el nombre apellido, el cuil, la antiguedad, el sueldo neto 
     */
    
    public void mostrar(){
        super.mostrar();
        System.out.println("CUIL:" + this.getCuil() + "Antiguedad: " + this.antiguedad() + "años de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }
    
     /**
     * Metodo publico de tipo String denominado "mostrarLinea"
     * @return retorna una cadena formada por cuil, apeYNom y el sueldo neto.
     */    public String mostrarLinea(){
        
        return (" " + this.getCuil() + " " + super.apeYNom() + "……………"+ "$ " + this.sueldoNeto());
    }
    

 /**
   * Comprueba si la fecha de ingreso en el objeto actual coincide con la fecha
   * actual, lo que indica que es el aniversario del empleado.
   *
   * @return Verdadero si la fecha de ingreso coincide con la fecha actual
   *         (aniversario), Falso en caso contrario.
   */
        public boolean esAniversario() {
    Calendar fechaHoy = Calendar.getInstance();
    Calendar fechaIngreso = this.getFechaIngreso();
    
    // Verificar si el día y mes de la fecha de ingreso coinciden con la fecha actual
    return (fechaHoy.get(Calendar.DAY_OF_MONTH) == fechaIngreso.get(Calendar.DAY_OF_MONTH)) &&
           (fechaHoy.get(Calendar.MONTH) == fechaIngreso.get(Calendar.MONTH));
    }

}