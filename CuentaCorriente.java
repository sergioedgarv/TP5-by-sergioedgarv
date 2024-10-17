 /* ABSTRACTION DE CUENTA CORRIENTE DE UN BANCO.
 * 
 * @author (Vivero, Sergio E) 
 * @version (03/09/2024)
 */
public class CuentaCorriente extends CuentaBancaria
{
   //ATRIBUTOS DE LA CLASE CAJADEAHORRO

    private double limiteDescubierto= 500; 
    
    //METODOS CONSTRUCTORES
    public CuentaCorriente(int p_nroCuenta, double p_saldo, Persona p_titular){
        super(p_nroCuenta, p_saldo, p_titular);
        this.setLimiteDescubierto(500); /* quiza va 0 como no especificaba nada por parametros o va p_limite? */
    }
    
    //SETTERS
    private void setLimiteDescubierto(int p_limite){
        this.limiteDescubierto= p_limite;
    }

    //GETTERS
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;

    }

  /*  El método puedeExtraer(p_importe) devuelve true si el importe a retirar
    no supera el saldo más el límite de descubierto autorizado */
    private boolean puedeExtraer(double p_importe){
         return this.getSaldo()+this.getLimiteDescubierto()> p_importe;
    }

    public String xQNoPuedeExtraer(double p_importe) {
        if(!puedeExtraer(p_importe)) {
            return "No puede extraer más que el saldo";
        } else if(this.getLimiteDescubierto() == 0) {
            return "No tiene habilitadas más extracciones";
        } else {
            return "Se ha extraido satisfactoriamente";
        }
    }
    /*NOTA: Siento que todo un orden raro por ejemplo de extraccion que directamente hace una resta estaria que este abajo de todo para que 
    se cumplan las condiciones para extraer dinero, pero quiza al ser poo funcina igual, pero bueni lo dejo asi por el
    diagrama interpretado******/

     /*El método extraccion(p_importe) es el que realiza efectivamente la extracción */
    /*
     * En el método extraer(), el tipo de retorno debe ser void y debes llamar al método puedeExtraer() 
     * para verificar si se puede extraer el importe. 
     * Si se puede extraer, llama al método extraccion() para realizar la extracción. Si no se puede extraer, 
     * imprime un mensaje de error.
     * El método
     *extraer(p_importe) coordina la operación, de acuerdo a si se cumplen las condiciones de extracción, caso contrario
    informará el motivo por el cual no se pudo extraer.
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)==true){
             super.extraer(p_importe);
        }else{
            System.out.println ( "El importe de extraccion sobrepasa el límite de descubierto!");
        }
      }    


    public void mostrar () {
        System.out.println("-Cuenta Corriente-");
        super.mostrar();
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    } 
   
}
