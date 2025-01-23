import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LicuadoraTest {

    private Licuadora licuadora;

    @BeforeEach
    void setUp() {
        licuadora = new Licuadora();
    }
    @Test
    void testEncenderDosVecesErrorConExcepcion() {
        licuadora.encender(); // Primera vez: encender con éxito.

        // Segunda vez: se espera una excepción.
        Exception exception = assertThrows(IllegalStateException.class, licuadora::encender);
        assertEquals("La licuadora ya está encendida.", exception.getMessage());
    }
}
