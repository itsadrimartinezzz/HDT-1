//aquí es donde van todos los test
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LicuadoraTest {

    @Test
    public void testEncender() {
        Licuadora licuadora = new Licuadora();
        licuadora.encender();
        assertEquals(0, licuadora.consultarVelocidad());
    }
}