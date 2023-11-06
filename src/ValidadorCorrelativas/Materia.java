package ValidadorCorrelativas;

import java.util.ArrayList;
import java.util.List;


public class Materia {
    public String nombre;
    public static List<Materia> correlativas;
    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
    public boolean puedeCursar(ValidadorCorrelativas.Alumno alumno) {
       return this.correlativas.stream().allMatch(materiaCorrelativa -> alumno.tenesCorrelativa(materiaCorrelativa));
    }

    public boolean tenesCorrelativas() {
        return !this.correlativas.isEmpty();

    }
    public void agregarCorrelativa(Materia correlativa) {
                this.correlativas.add(correlativa);
        }
        }
