package unit01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculonTest {
    @Test
    public void testAdd () {
        // Setup
        double x = 4.0;
        double y = 6.0;
        double expected = 10.0;

        // Invoke
        double actual = Calculon.add (x, y);

        // Analysis
        assertEquals (expected, actual, 0.0000000001);
    }

    @Test
    public void testSub () {
        // Setup
        double x = 4.0;
        double y = 6.0;
        double expected = -2.0;

        // Invoke
        double actual = Calculon.sub (x, y);

        // Analysis
        assertEquals (expected, actual, 0.0000000001);
    }

    @Test
    public void testMul () {
        // Setup
        double x = 4.0;
        double y = 6.0;
        double expected = 24.0;

        // Invoke
        double actual = Calculon.mul (x, y);

        // Analysis
        assertEquals (expected, actual, 0.0000000001);
    }

    @Test
    public void testDiv () {
        // Setup
        double x = 6.0;
        double y = 4.0;
        double expected = 1.5;

        // Invoke
        double actual = Calculon.div (x, y);

        // Analysis
        assertEquals (expected, actual, 0.0000000001);
    }

    @Test
    public void testRaise () {
        // Setup
        double x = 2.0;
        double y = 6.0;
        double expected = 64.0;

        // Invoke
        double actual = Calculon.raise (x, y);

        // Analysis
        assertEquals (expected, actual, 0.0000000001);
    }
}
