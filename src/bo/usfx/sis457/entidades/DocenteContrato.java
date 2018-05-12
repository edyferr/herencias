package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;


public class DocenteContrato extends Docente{
    protected String NumContrato;
   

    private DocenteContrato(int AñosDeExperiencia, String[] asignaturas, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNumContrato() {
        return NumContrato;
    }

    public void setNumContrato(String NumContrato) {
        this.NumContrato = NumContrato;
    }
    public String toString() {
        String Asignaturas;
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre
                + ", Numero de Contrato=" + this.NumContrato
                + ", AñosDeExperiencia=" + this.AñosDeExperiencia
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Asignaturas=" + Asignaturas + ", Titulo=" + Titulo + '}';
    }
}
