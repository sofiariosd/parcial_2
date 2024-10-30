package pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import logica.parcial;

public class pruebas {
	@Test
    public void testDiscriminantePositivo() throws Exception {
        parcial parcial = new parcial();
        parcial.ecuacionSegundoOrden(1, -3, 2);  // x^2 - 3x + 2 = 0 
        assertEquals(2.0, ((logica.parcial) parcial).getPrimeraRaiz(), 0.001);
        assertEquals(1.0, parcial.getSegundaRaiz(), 0.001);
    }
	
	@Test
    public void testDiscriminanteCero() throws Exception {
        parcial parcial = new parcial();
        parcial.ecuacionSegundoOrden(1, 2, 1);  // x^2 - 2x + 1 = 0 
        assertEquals(2.0, ((logica.parcial) parcial).getPrimeraRaiz(), 0.001);
        assertEquals(1.0, parcial.getSegundaRaiz(), 0.001);
    }
	
	@Test
    public void testDiscriminanteNegativo() {
        parcial parcial = new parcial();
        Exception exception = assertThrows(Exception.class, () -> {
            parcial.ecuacionSegundoOrden(3, 2, 1);  // Ecuación 3x^2 + 2x + 1 = 0 (discriminante negativo)
        });
        assertEquals("En esta ecuacion las raíces no son reales.", exception.getMessage());
    }

	@Test
    public void testAEsCero() {
        parcial parcial = new parcial();
        Exception exception = assertThrows(Exception.class, () -> {
            parcial.ecuacionSegundoOrden(0, 5, 7);  // a=o, entonces la ecuación no es cuadrática
        });
        assertEquals("No se puede calcular porque 'a' es cero.", exception.getMessage());
    }
	
	@Test
    public void testToString() throws Exception {
        parcial parcial = new parcial();
        parcial.ecuacionSegundoOrden(1, -1, -12);  // Ecuación x^2 - x -12 = 0
        String raizPrimera;
		String raizSegunda;
		assertEquals("Primera raíz: 4.0, Segunda raíz: -3.0", parcial.toString());
    }
}
