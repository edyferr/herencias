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
 * añadirle  la propiedad Asignaturas que contenga los nombres de las asignaturas programadas (tipo arreglo de cadenas).
 */
public class Alumno extends Persona {
    protected String CarnetUniversitario;
    protected int Semestre;
      protected String Asignaturas;
    private String Asignatura;

    public Alumno(String CarnetUniversitario, int Semestre, String Asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.CarnetUniversitario = CarnetUniversitario;
        this.Semestre = Semestre;
        this.Asignaturas = Asignaturas;
    }

    public Alumno(String CarnetUniversitario, int Semestre, String Asignaturas) {
        this.CarnetUniversitario = CarnetUniversitario;
        this.Semestre = Semestre;
        this.Asignaturas = Asignaturas;
    }

    public String getCarnetUniversitario() {
        return CarnetUniversitario;
    }

    public void setCarnetUniversitario(String CarnetUniversitario) {
        this.CarnetUniversitario = CarnetUniversitario;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String Asignaturas) {
        this.Asignaturas = Asignaturas;
    }
    
    
   
    @Override
    public String toString() {
        return "Alumno{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre
                + ", Asignaturas=" + this.Asignatura
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", CarnetUniversitario=" + this.CarnetUniversitario 
                + ", Semestre=" + this.Semestre + '}';
    }
}



 