package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * cargo, lugar de trabajo y fecha de ingreso (Cargo:String, LugarTrabajo:String y FechaIngreso:Calendar).
 */
public class Administrativo extends Persona {
    protected String Cargo;
    protected String LugarTabejo;
    protected Calendar FechaIngreso;

    public Administrativo(String Cargo, String LugarTabejo, Calendar FechaIngreso, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = Cargo;
        this.LugarTabejo = LugarTabejo;
        this.FechaIngreso = FechaIngreso;
    }

    public Administrativo(String Cargo, String LugarTabejo, Calendar FechaIngreso) {
        this.Cargo = Cargo;
        this.LugarTabejo = LugarTabejo;
        this.FechaIngreso = FechaIngreso;
    }

    public Administrativo() {
        
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLugarTabejo() {
        return LugarTabejo;
    }

    public void setLugarTabejo(String LugarTabejo) {
        this.LugarTabejo = LugarTabejo;
    }

    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Calendar FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    
    
   
    
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Cargo=" + Cargo + ", LugarTabejo=" + LugarTabejo + '}';
    }
    
}                           
