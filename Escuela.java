/*
 * Definir una clase ejecutable Escuela, instanciar personas y alumnos y verificar el funcionamiento del método mostrar
en ambos tipos de objetos.
 */

public class Escuela{
    public static void main(String[] args){
        /*Persona personitas = new Persona("Vivero", "Edgar", 43785923, 2001);
        Persona personitas1 = new Persona("Valenzuela", "Jose", 43783923, 2002); */
        
        Alumno alumnos= new Alumno(000002, "Edgar", "Vivero", 2001, 43785923, 7, 8);
        Alumno alumnos1= new Alumno(000003, "Lisan", "Valenzuela", 2001, 43783923, 7, 8);
        alumnos.mostrar();
        System.out.println("\n");
        alumnos1.mostrar();
        
        
    }
}