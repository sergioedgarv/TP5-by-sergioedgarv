
/**
 * ABSTRACTION DE CAJA DE AHORRO DE UN BANCO.
 * 
 * @author (Vivero, Sergio E) 
 * @version (03/09/2024)
 */
public class CajaDeAhorro extends CuentaBancaria
{
    private int extraccionesPosibles;

    //METODOS CONSTRUCTOR
    public CajaDeAhorro(int p_nroCuenta, double p_saldo,  Persona p_titular){
        super(p_nroCuenta, p_saldo, p_titular);
        this.setExtraccionesPosibles(10);
    }

    //SETTERS
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles= p_extracciones;
    }

    //GETTERS
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;

    }

    private boolean puedeExtraer(double p_importe){
         return this.getSaldo()+this.getExtraccionesPosibles()> p_importe;
       
    }

       public void extraer (double p_importe){
        if(this.puedeExtraer(p_importe)==true){
             super.extraer(p_importe);
        }else{
            System.out.println ( "El importe de extraccion sobrepasa el límite de descubierto!");
        }
      }   
      
     public String xQNoPuedeExtraer(double p_importe) {
        if(!puedeExtraer(p_importe)) {
            return "No puede extraer más que el saldo";
        } else if(this.getExtraccionesPosibles() == 0) {
            return "No tiene habilitadas más extracciones";
        } else {
            return "Se ha extraido satisfactoriamente";
        }
    }
  
        public void mostrar(){
        super.mostrar();
        System.out.println("CANTIDAD DE EXTRACCIONES DISPONIBLES: "+this.getExtraccionesPosibles());
    }

}