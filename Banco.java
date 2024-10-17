
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    private  String nombre;
    private int nroSucursal; 
    private Localidad localidad;
    private  ArrayList <Empleado> empleados;
    private Empleado empleado;
    private ArrayList <CuentaBancaria> cuentasBancarias;


    public Banco (String p_nombre,Localidad p_localidad,int p_nrosucursal,Empleado p_empleado)
    {   
        this.setName(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nrosucursal);
        this.setEmpleado(p_empleado);
        this.setEmpleados(new ArrayList<Empleado> ());
    }
    public Banco (String p_nombre,Localidad p_Localidad,int p_nrosucursal, ArrayList <Empleado> p_Empleado )
    {
        this.setName(p_nombre);
        this.setLocalidad(p_Localidad);
        this.setNroSucursal(p_nrosucursal);
        this.setEmpleados(p_Empleado);
    }

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados, ArrayList <CuentaBancaria>  p_cuentas)
    {
        this.setName(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(p_cuentas);
    }

    //setters 
    private void setName(String p_nombre)
    {
        this.nombre=p_nombre;
    }
    private void setLocalidad( Localidad p_Localidad)
    {
        this.localidad = p_Localidad; 
    }
    private void setEmpleados (ArrayList <Empleado>  p_Empleado)
    {
        this.empleados= p_Empleado;
    }
    private void setEmpleado(Empleado p_Empleado)
    {
        this.empleado=p_Empleado;
    }
    private void setNroSucursal(int p_nrosucursal)
    {
        this.nroSucursal=p_nrosucursal;
    }
    private void setCuentas(ArrayList <CuentaBancaria> p_cuenta)
    {
        this.cuentasBancarias=p_cuenta;
    }
    
    //getters 
    public String getNombre()
    {
        return this.nombre;
    }
    public Localidad getLocalidad()
    {
        return this.localidad;
    }
    public Empleado getEmpleado()
    {
        return this.empleado;
    }
    public int getNroSucursal()
    {
        return this.nroSucursal;
    }
    public ArrayList<Empleado> getEmpleados()
    {
        return this.empleados;
    }

    public ArrayList <CuentaBancaria> getCuentas()
    {
        return this.cuentasBancarias;
    }
    public boolean agregarEmpleado(Empleado pEmpleado)
    {
        if (pEmpleado!= null) {
            if (this.getEmpleados()==null) {
                this.empleados = new ArrayList<>();
            }
            return this.getEmpleados().add(pEmpleado);
        }
        return false;
    }

    public boolean quitarEmpleado(Empleado pEmpleado)
    {   
        if (this.getEmpleados()!=null && this.getEmpleados().size() > 1 ) {
            return this.getEmpleados().remove(pEmpleado);
        }
        return false;
    }

    public double sueldosApagar()
    {
        return this.getEmpleado().getSueldo();
    }
    
    public double listarSueldo()
    {
        double total=0;
        for(Empleado p: this.getEmpleados())
        {
            total+=p.getSueldo();
        }
        return total;
    }
   
    public int cuentasSaldoActivo()
    {
        int cantidadCuentas=0;
        for(CuentaBancaria p : this.getCuentas())
        {
            if (p.getSaldo() > 0 ) {
                cantidadCuentas +=1;
            }
        }
        return cantidadCuentas;
    }


    /**
     * cuentasSaldoCero() va iterando sobre cada elemento del array preguntando si su saldo es igual a 0.
     * debatir con el profe si es practico realizar esto.
     * 
     * @return cantidad de cuentas que su saldo es comparable con 0
     *
     */
    public int cuentasSaldoCero()
    {
        int cuentas_Cero=0;
        for(CuentaBancaria p : this.getCuentas())
        {
            if (p.getSaldo() == 0) {
                cuentas_Cero +=1;
            }
        }
        return cuentas_Cero;
    }

    public void listarCuentasConSaldoCero()
    {
        System.out.println("********************************************************\n");
        System.out.println("Cuentas sin saldo:");
        System.out.println("********************************************************\n");
        for(CuentaBancaria p : cuentasBancarias)
        {
            if (p.getSaldo()==0) {
                System.out.println(p.toString()+"\n");
            }
        }
    }     



    /** ListaTitulares() itera sobre la cantidad de titulares y va almacenando en una estructura HashSet el nombre de los titulares.
     * 
     * consultar con el profe si  respeta al paradigma  esta solucion.
     * 
     * @return un tipo de dato HashSet con una lista con todos los nombres de los titulares.
     */
    
    
    public HashSet<String> ListaTitulares()
    {
         HashSet<String> nombresTitulares = new HashSet<>();
         for(CuentaBancaria cuentas : cuentasBancarias )
         {
            String nombreTitular = cuentas.getTitular();
            nombresTitulares.add(nombreTitular);
         }
         return nombresTitulares;
    }
    public void mostrar()
    {
        System.out.println("Banco:"+ this.getNombre() + "\t" + "Sucarsal:" + this.getNroSucursal());
        System.out.println("localidad: "+ this.getLocalidad().getNombre() +"\t"+ "provincia: " + this.getLocalidad().getProvincia());
       if (this.empleados !=null) {
         for(Empleado p : this.getEmpleados())
         {
            p.mostrarLinea();
         }
         System.out.println("Total a pagar--------------------------------------------- $ " + this.listarSueldo());
       }


    }



}