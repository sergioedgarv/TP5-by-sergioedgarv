import java.util.ArrayList;

/**
 * Write a description of class AplicacionFacultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AplicacionFacultad
{
   
    public static void main(String[] args )
    {
         // Inicializamos el ArrayList de cargos
        ArrayList<Cargo> cargos = new ArrayList<>();
         ArrayList<Cargo> cargos2 = new ArrayList<>();
        //definmos 
        Cargo cargo1 = new Cargo("jttp", 2500, 2022, 10);
        Cargo cargo2 = new Cargo("Investigador", 2500, 2023, 10);
        Cargo cargo3 = new Cargo("Jefe de cátedra", 25040, 2010, 10);
            
        cargos.add(cargo1);
        cargos.add(cargo2);
        cargos.add(cargo3);
        
        cargos2.add(cargo1);
        cargos2.add(cargo2);
       
       ArrayList <Profesor> profesores = new ArrayList<>();
        
       Profesor profe = new Profesor("Analista Programador Universitario", "Valenzuela","Lisandro",43268917,2002, cargos);
       Profesor profe2 = new Profesor("Analista Programador Universitario", "Vivero","Edgardo",43262917,2002, cargos2);
       Profesor profe3= new Profesor("DOCTOR EN INFORMATICA","Bonavena","Oscar",14981107,1942,cargos2);
       profesores.add(profe);
       profesores.add(profe2);
       profesores.add(profe3);
        
       Facultad unne = new Facultad("FACENA", profesores);
       unne.listarProfesorCargos();
    }
       
        
      

        
}