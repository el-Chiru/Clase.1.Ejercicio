import ValidadorCorrelativas.Alumno;
import ValidadorCorrelativas.Inscripcion;
import ValidadorCorrelativas.Materia;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class main {
    Materia estructuraDeDatos;
    Materia paradigmasDeProgramacion;
    Materia disenoDeSistemas;
    Materia algoritmos;
       @Test
   public void GabrielSePuedenAnotarAAlgoritmos(){
        Alumno gabriel = new Alumno("Gabriel", "261915");
        Inscripcion inscripcionDeGabriel = new Inscripcion(gabriel, algoritmos);
   }
   @Test
    public void SofiaSePuedenAnotarAEstructuraDeDatos() {
        Alumno sofia = new Alumno("Sofia", "224563");
        estructuraDeDatos.agregarCorrelativa(algoritmos);
        Inscripcion inscripcionDeSofia = new Inscripcion(sofia, estructuraDeDatos);
    }
}

