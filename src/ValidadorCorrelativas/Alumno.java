package ValidadorCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    public String nombre;
    public String legajo;
    public List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean tenesCorrelativa(Materia materiaCorrelativa) {
        return this.materiasAprobadas.contains(materiaCorrelativa);
    }
}
