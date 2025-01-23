import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase de pruebas unitarias para la clase Licuadora.
 */
public class LicuadoraTest {

    private Licuadora licuadora;

    @Before
    public void setUp() {
        // Inicializamos una nueva instancia de Licuadora antes de cada prueba.
        licuadora = new Licuadora();
    }

    @Test
    public void testEncender() {
        // Probamos que la licuadora se enciende correctamente.
        licuadora.encender();
        licuadora.encender(); // Intentamos encenderla dos veces para verificar el comportamiento.
        assertTrue("La licuadora debería estar encendida.", licuadora.consultarLlenado());
    }

    @Test
    public void testLlenar() {
        // Verificamos que la licuadora se llena correctamente.
        assertFalse("La licuadora debería estar vacía al inicio.", licuadora.consultarLlenado());
        licuadora.llenar();
        assertTrue("La licuadora debería estar llena después de llenarla.", licuadora.consultarLlenado());
        licuadora.llenar(); // Intentamos llenarla dos veces.
    }

    @Test
    public void testAumentarVelocidad() {
        // Verificamos que no se puede aumentar la velocidad cuando está apagada o vacía.
        licuadora.aumentarVelocidad();
        assertEquals("La velocidad debería ser 0 al inicio.", 0, licuadora.consultarVelocidad());

        licuadora.encender();
        licuadora.aumentarVelocidad();
        assertEquals("La velocidad debería seguir siendo 0 porque está vacía.", 0, licuadora.consultarVelocidad());

        licuadora.llenar();
        licuadora.aumentarVelocidad();
        assertEquals("La velocidad debería aumentar a 1 después de llenarla y encenderla.", 1, licuadora.consultarVelocidad());
    }

    @Test
    public void testConsultarVelocidad() {
        // Probamos el método de consulta de velocidad.
        assertEquals("La velocidad inicial debería ser 0.", 0, licuadora.consultarVelocidad());

        licuadora.encender();
        licuadora.llenar();
        licuadora.aumentarVelocidad();
        assertEquals("La velocidad debería ser 1 después de incrementarla.", 1, licuadora.consultarVelocidad());
    }

    @Test
    public void testVaciar() {
        // Probamos que vaciar la licuadora funciona correctamente.
        licuadora.llenar();
        licuadora.vaciar();
        assertFalse("La licuadora debería estar vacía después de vaciarla.", licuadora.consultarLlenado());
        assertEquals("La velocidad debería ser 0 después de vaciarla.", 0, licuadora.consultarVelocidad());

        licuadora.vaciar(); // Intentamos vaciarla dos veces.
    }
}
