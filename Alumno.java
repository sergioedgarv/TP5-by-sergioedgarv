/**
 * Creacion de la clase "Alumno" (Abstraccion de un alumno)
 * Con diversos tipo de atributos, como los de tipo String: nombre, apellido.
 * de tipo entero: lu(libreta universitaria) y double: nota1 y nota2.
 * 
 * 
 * 
 * 
 * 
 * @author Vivero, Sergio Edgardo.
 * @version 24/08/24.
 */
public class Alumno extends Persona {
private int lu;
private String nombre;
private String apellido;
private double nota1;
private double nota2;

    /**
     * Constructor de la clase Alumno que inicializa los atributos
     * con los valores proporcionados como parámetros.
     *
     * @param p_lu     libreta universitaria de un alumno.
     * @param p_nombre   Nombre del alumno.
     * @param p_apellido Apellido del alumno.
     */
public Alumno(int p_lu, String p_nombre, String p_apellido, int p_anio, int p_dni){
    super(p_apellido, p_nombre, p_dni, p_anio);
    this.setLu(p_lu);
    /*this.setNombre(p_nombre);
    this.setApellido(p_apellido);*/
    this.setNota1(0);
    this.setNota2(0);
}

public Alumno(int p_lu, String p_nombre, String p_apellido, int p_anio, int p_dni, double p_nota1, double p_nota2){
    super(p_apellido, p_nombre, p_dni, p_anio);
    this.setLu(p_lu);
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setNota1(p_nota1);
    this.setNota2(p_nota2);
}
     /**
     * Setter del atributo lu
     * Asigna p_lu a la lu(libreta universitaria) del alumno.
     * @param Recibe un parámetro p_lu del tipo entero.
     */
    private void setLu(int p_lu){
    this.lu= p_lu;
    }

     /**
     * Setter del atributo nombre
     * Asigna p_nombre al nombre del alumno.
     * @param Recibe un parámetro p_nombre del tipo Cadena.
     */
    private void setNombre(String p_nombre){
    this.nombre= p_nombre;
    }

    /**
     * Setter del atributo apellido
     * Asigna p_apellido al apellido del alumno.
     * @param Recibe un parámetro p_apellido del tipo Cadena.
     */
    private void setApellido(String p_apellido){
    this.apellido= p_apellido;
    }
    
     /**
     * Setter del atributo nota1
     * Asigna p_nota a la nota del alumno.
     * @param Recibe un parámetro p_nota del tipo double.
     */
    public void setNota1(double p_nota){
    this.nota1= p_nota;
    } 

     /**
     * Setter del atributo nota2
     * Asigna p_nota a la nota del alumno.
     * @param Recibe un parámetro p_nota del tipo double.
     */
    public void setNota2(double p_nota){
    this.nota2= p_nota;
    } 

      /**
     * Método getter para el atributo lu.
     *
     * @return la libreta del alumno.
     */
    public int getLu(){
    return this.lu;
    } 
    
      /**
     * Método getter para el atributo nombre.
     *
     * @return el nombre del alumno.
     */
    public String getNombre(){
    return this.nombre;
    }

     /**
     * Método getter para el atributo apellido.
     *
     * @return el apellido del alumno.
     */
    public String getApellido(){
    return this.apellido;
    }
    
     /**
     * Método getter para el atributo nota1.
     *
     * @return la nota1 del alumno.
     */
    public double getNota1(){
    return this.nota1;
    }
     /**
     * Método getter para el atributo nota2.
     *
     * @return la nota2 del alumno.
     */
    public double getNota2(){
        return this.nota2;
    }

     /**
     * Método privado "aprueba"
     * Si el promedio es mayor o igual a 7 y la nota1 junto con la nota es mayor o igual a 6 @return true
     * caso contrario false
     */

    private boolean aprueba(){
        if(this.promedio()>= 7 && this.getNota1() >= 6 &&  this.getNota2() >=6){
        return true;
    }   else{
        return false;
    }
    }

    /**
     * Metodo de acceso privado denominado "leyendaAprueba"
     * @return retorna un mensaje llamado "APROBADO" o "DESAPROBADO" dependiendo de si aprobo o no
     */
    private String leyendaAprueba(){
        if(this.aprueba()){
        return "APROBADO";
    }
        else{
        return "DESAPROBADO";
    }
    }

       /**
     * Método publico denominado "promedio"
     *@return retorna el promedio de las notas en un dato de tipo double
     *
     */
    public double promedio(){
    return (double)((this.getNota1() + this.getNota2()) / 2);
    }

    /**
     * Metodo publico de tipo String denominado "nomYApe"
     * return retorna la cadena formado entre nombre y apellido
     */
    public String nomYApe(){
    return (this.getNombre() + "\t" + this.getApellido());
    }

     /**
     * Metodo publico de tipo String denominado "apeYNom"
     * return retorna la cadena formado entre apellido y nombre
     */
    public String ApeYNom(){
    return (this.getApellido() + "\t" + this.getNombre());
    }
    
    /*
     * de modo que además de
los datos personales, muestre la LU, las notas, el promedio y la leyenda correspondiente
según el siguiente formato:
Nombre y Apellido: Luis Gomez
DNI: 28325402 Edad: 19 años
LU: 2345 Notas: 5.0 - 9.0
Promedio: 7.0 - DESAPROBADO
     */
     /**
     * Metodo publico  denominado "mostrar"
     * Muestra informacion importante como nombre apellido, libreta, notas, y el calculo del promedio
     */
    public void mostrar(){
    super.mostrar();
    System.out.println ("LU:" + this.getLu() + "Notas: " + this.getNota1()+ "\t" + this.getNota2() + " - " + this.leyendaAprueba());
    System.out.println ("Promedio: " + this.promedio());
    }
}
