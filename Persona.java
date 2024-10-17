
/**
  CLASE 15/08
 this.getNombre() se está mandando un mensaje!! This. = receptor, getNombre()= MENSAJE.
 El objeto pepe es el que recibe el mensaje, es el que esta EJECUTANDO el método (IMPORTANTE)
 Es fundamental porque this. va a ser PEPE.
 
 
 TEORIA THIS: 
 Pseudo var que hace referencia al objeto que esta ejecutando esa linea de codigo.
 Es pseudo porque no se declara, ya existe en Java, no es de ningun tipo definido en particular, y no se le puede asignar
 un valor nunca!!.
 Porque? Xq eso pasa implicitamente en tiempo de ejecucion al recibir el mensaje, cuando se activa el método es cuando THIS 
 adquiere la personalidad del objeto que lo esta ejecutando. 
 Si no pongo this, la JVM interpreta implicitamente que se esta mandando el mensaje a sí mismo y funca igual. 
 - SI O SI USAR THIS EN EXAMEN
 - luego de this. puede seguir un metodo() o un atributo, la dif es q no va a tener parentesis.
 -Diferencia entre método y mensaje: Mensaje petición de acción, el metodo es la contraparte FUNCIONAL del mensaje,
 el conjunto de instrucciones que responden al mensaje, es lo que espera el que emitió el mensaje que SUCEDA.
 
 OTROS IMPORTANTES
 -Los MENSAJES NOOO se envian a los métodos.
 -La clase System tiene algunos atributos publicos ej: out. !!. 
 - Hacer variables locales esta bien utilizar mientras sea util en el método que utilizo.
 */
import java.util.*;
public class Persona
{
    // instance variables - replace the example below with your own
    private  int nroDni;
    private  int anioNacimiento;
    private String nombre;
    private String apellido;

    /**
     * Constructor for objects of class Persona
     */
    public Persona (String p_apellido, String p_nombre, int p_dni, int p_anio){
    this.setApellido(p_apellido);
    this.setNombre(p_nombre);
    this.setDni(p_dni);
    this.setAnioNacimiento(p_anio);

    }
    
    //AGREGAR SETTERS Y GETTERS
    
    
    //los SET son PRIVATE por convencion, como los atributos. Agrega seguridad de las modificaciones y robustez.
    public int edad (){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
      
        return anioHoy - anioNacimiento;
    }
    
    private void setApellido(String p_apellido){
        this.apellido= p_apellido;
    }
    
        private void setNombre(String p_nombre){
        this.nombre= p_nombre;
    }
    
        private void setDni(int p_dni){
        this.nroDni= p_dni;
    }
    
        private void setAnioNacimiento(int p_anio){
        this.anioNacimiento= p_anio;
    }

    //GETTERS
    
        public int getDni(){
        return this.nroDni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
        public String getApellido(){
        return this.apellido;
    }
    
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }
    
    public String nomYApe(){
     return ("Nombre y Apellido:" + this.getNombre() + "" + this.getApellido());
    }
    
    public String apeYNom (){
    return ("Apellido y Nombre:" + this.getApellido() + "" + this.getNombre());
    }
    
    public void mostrar (){
    System.out.println("Nombre y apellido:" + this.nomYApe());
    System.out.println("DNI:" + this.nroDni);
    System.out.println("Edad:" + this.edad());
    }
}
