import ValidadorCorrelativas.Alumno;
import ValidadorCorrelativas.Inscripcion;
import ValidadorCorrelativas.Materia;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import org.junit.Test;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class main {

    Materia estructuraDeDatos;
    Materia paradigmasDeProgramacion;
    Materia disenoDeSistemas;

     @Test
   public void GabrielSePuedeAnotarAAlgoritmos(){
        Alumno gabriel = new Alumno("Gabriel", "261915");
        Materia algoritmos = new Materia("Algoritmos");
        Inscripcion inscripcionDeGabriel = new Inscripcion(gabriel, algoritmos);

         algoritmos.agregarCorrelativa(estructuraDeDatos);
         paradigmasDeProgramacion.agregarCorrelativa(algoritmos);
         disenoDeSistemas.agregarCorrelativa(paradigmasDeProgramacion);

         Inscripcion gabrielSePuedeAnotarAAlgoritmos  = new Inscripcion(gabriel, algoritmos);

}
}

