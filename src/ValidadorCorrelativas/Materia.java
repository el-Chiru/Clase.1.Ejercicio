package ValidadorCorrelativas;
import java.util.ArrayList;
import java.util.List;


// ATRIBUTOS DE MATERIA
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

    // PUEDE CURSAR SI TIENE LA CORRELATIVA
    public boolean puedeCursar(ValidadorCorrelativas.Alumno alumno) {
       return this.correlativas.stream().allMatch(alumno::tenesCorrelativa);
    }

    // TIENE CORRELATIVA?
    public boolean tenesCorrelativas() {
        return !this.correlativas.isEmpty();

    }

    // AGREGAR MATERIA CORRELATIVA
    public void agregarCorrelativa(Materia correlativa) {
                this.correlativas.add(correlativa);
        }
        }
