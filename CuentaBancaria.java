/**
 * Abstracción de una "cuenta bancaria".
 * 
 * Esta clase permite crear cuentas bancarias, realizar depósitos y extracciones,
 * y mostrar información sobre la cuenta y su titular.
 * 
 * @author (VIVERO, SERGIO EDGARDO).
 * @version (30/08/2024).
 */
public abstract class CuentaBancaria {
    private int nroCuenta; // Número de cuenta bancaria
    private double saldo; // Saldo actual de la cuenta
    private Persona titular; // Titular de la cuenta, representado por un objeto de la clase Persona

    /**
     * Constructor que inicializa una cuenta bancaria con un número de cuenta y un titular.
     * El saldo se inicializa en 0.
     *
     * @param p_nroCuenta Número de cuenta bancaria.
     * @param p_titular Titular de la cuenta.
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0); // Inicializa el saldo en 0
    }

    /**
     * Constructor que inicializa una cuenta bancaria con un número de cuenta, un titular y un saldo inicial.
     *
     * @param p_nroCuenta Número de cuenta bancaria.
     * @param p_titular Titular de la cuenta.
     * @param p_saldo Saldo inicial de la cuenta.
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }

    // SETTERS
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    // GETTERS
    public int getNroCuenta() {
        return this.nroCuenta;
    }

    public Persona getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
  
    public abstract String xQNoPuedeExtraer(double p_importe);
    // MÉTODOS
    public double depositar(double p_importe) {
        this.saldo += p_importe; // Actualiza el saldo
        return this.saldo; // Devuelve el nuevo saldo
    }

    /**
     * El método extraer disminuye el saldo actual con el monto pasado como parámetro.
     *
     * @param p_importe Monto a extraer de la cuenta.
     * @return Nuevo saldo después de la extracción.
     */
    public double extraer(double p_importe) {
        if (p_importe <= this.saldo) { // Verifica si hay suficiente saldo
            this.saldo -= p_importe; // Actualiza el saldo
        } else {
            System.out.println("Saldo insuficiente para realizar la extracción.");
        }
        return this.saldo; // Devuelve el saldo actualizado
    }

    /**
     * Muestra información sobre la cuenta bancaria, incluyendo el titular y el saldo.
     */
    public void mostrar() {
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
    }

    /**
     * Devuelve una representación en forma de cadena de la cuenta bancaria.
     *
     * @return Cadena que representa la cuenta bancaria.
     */
    public String toString() {
        return ("Número de Cuenta: " + this.getNroCuenta() + ", Titular: " + this.getTitular() + ", Saldo: " + this.getSaldo());
    }
}