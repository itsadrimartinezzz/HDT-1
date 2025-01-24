import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LicuadoraTest {

    private Licuadora licuadora;

    // Configuración inicial antes de cada prueba
    @BeforeEach
    void setUp() {
        licuadora = new Licuadora();
    }

    // Prueba: La licuadora se enciende correctamente
    @Test
    void testEncenderLicuadora() {
        licuadora.encender();
        assertEquals(0, licuadora.consultarVelocidad(),
                "La velocidad inicial debe ser 0 después de encender la licuadora.");
    }

    // Prueba: No se puede aumentar la velocidad si la licuadora está vacía
    @Test
    void testNoAumentarVelocidadSiVacia() {
        licuadora.encender();
        licuadora.aumentarVelocidad();
        assertEquals(0, licuadora.consultarVelocidad(),
                "La velocidad debe permanecer en 0 si la licuadora está vacía.");
    }

    // Prueba: La velocidad aumenta después de llenar la licuadora
    @Test
    void testAumentarVelocidadDespuesDeLlenar() {
        licuadora.encender();
        licuadora.llenar();
        licuadora.aumentarVelocidad();
        assertEquals(1, licuadora.consultarVelocidad(),
                "La velocidad debe ser 1 después de llenarla y aumentar la velocidad.");
    }
}
