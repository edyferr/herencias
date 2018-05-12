
import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

public class DocenteTitular  extends Docente{
    protected String ExamenCompetencia;
    private String AñosDeExperiencia;
    private String Nombre;
    private String CarnetIdentidad;
    private String Id;
    private Calendar FechaNacimiento;
    
    public DocenteTitular(int exp, String asignaturas[],String examenCompetencia, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(exp, asignaturas, titulo, carnetIdentidad, nombre, fechaNacimiento);
        this.ExamenCompetencia=examenCompetencia;
    }

    /**
     *
     */

    public String getExamenCompetencia() {
        return ExamenCompetencia;
    }

    public void setExamenCompetencia(String ExamenCompetencia) {
        this.ExamenCompetencia = ExamenCompetencia;
    }
    public String toString() {
        String Asignatura;
        String Titulo;
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre
         
                + ", AñosDeExperiencia=" + this.AñosDeExperiencia
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Asignatura=" + Asignatura + ", Titulo=" + Titulo + '}';
    }


       
}