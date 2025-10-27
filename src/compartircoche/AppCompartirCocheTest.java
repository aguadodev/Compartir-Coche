package compartircoche;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;


public class AppCompartirCocheTest {
    @Test
    void testCrearViaje() {
        boolean valorReal = AppCompartirCoche.crearViaje("", "", "", "", 0);
        assertFalse(valorReal);
        boolean valorReal2 = AppCompartirCoche.crearViaje("admin", "", "", "", 0);
        assertFalse(valorReal2);
        boolean valorReal3 = AppCompartirCoche.crearViaje("admin", "2025/11/01 14:30", "", "", 0);
        assertFalse(valorReal3);
        boolean valorReal4 = AppCompartirCoche.crearViaje("admin", "2025/11/01 14:30", "Pontevedra", "Marín", 0);
        assertFalse(valorReal4);
    }

    @Test
    void testLoginUsuario() {

    }
}
