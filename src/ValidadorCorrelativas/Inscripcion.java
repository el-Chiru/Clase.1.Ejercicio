package ValidadorCorrelativas;

import ValidadorCorrelativas.Alumno;
import ValidadorCorrelativas.Materia;

import java.time.LocalDate;
//SE DEFINE ATRIBUTOS

public class Inscripcion {
    public Alumno alumno;
    public Materia materia;
    public LocalDate fecha;

// GETTER/SETTER INSCRIPCION

    public Alumno getAlumno() {
        return alumno;
    }
    public Materia getMateria() {
        return materia;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public Inscripcion(ValidadorCorrelativas.Alumno alumno, ValidadorCorrelativas.Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = LocalDate.now();
    }
// INSCRIPCION APROBADA?
    public boolean aprobada() {

        if (!this.materia.tenesCorrelativas() || this.materia.puedeCursar(this.alumno)) return true;

        return false;
    }
}
