/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 *  quitar la propiedad Contrato 
 * y añadirle las propiedades (1) años de experiencia (tipo entero) y (2) asignaturas (tipo arreglo de cadenas).
 */
public class Docente extends Persona {
    protected int AñosDeExperiencia;
    protected String Asignatura ;
    protected String Titulo;

    public Docente(int AñosDeExperiencia, String Asignatura, String Titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.AñosDeExperiencia = AñosDeExperiencia;
        this.Asignatura = Asignatura;
        this.Titulo = Titulo;
    }

    public Docente(int AñosDeExperiencia, String Asignatura, String Titulo) {
        this.AñosDeExperiencia = AñosDeExperiencia;
        this.Asignatura = Asignatura;
        this.Titulo = Titulo;
    }
    

    public Docente() {
        
    }

    public Docente(String string, String licenciado_en_Informática, String string0, String juan_Perez, GregorianCalendar gregorianCalendar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Docente(String string, String ingeniero_de_Sistemas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAñosDeExperiencia() {
        return AñosDeExperiencia;
    }

    public void setAñosDeExperiencia(int AñosDeExperiencia) {
        this.AñosDeExperiencia = AñosDeExperiencia;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }


    
    
    
    

    @Override
    public String toString() {
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", AñosDeExperiencia=" + AñosDeExperiencia + ", Asignatura=" + Asignatura +  ", Titulo=" + Titulo '}';
    }
    
}
