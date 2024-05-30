import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

    private Calculadora calculadora;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        calculadora = new Calculadora();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        calculadora = null;
    }

    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(0, calculadora.sumar(0, 0));
        assertEquals(-3, calculadora.sumar(-1, -2));
        assertEquals(1, calculadora.sumar(-1, 2));
    }
}
