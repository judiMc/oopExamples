package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator fixture;
    private static final double DELTA = 0.001;

    @Before 
    public void setup() {
        fixture = new Calculator();
    }

    @Test
    public void addPositive() {
        fixture.add(14);
        fixture.add(2);

        assertEquals(16, fixture.getValue(), DELTA);
    }

    @Test
    public void addNegativePositive() {
        fixture.add(0);
        fixture.add(-1);

        assertEquals(-1, fixture.getValue(), DELTA);
    }

    @Test
    public void subtractPositive() {
        fixture.add(14);
        fixture.subtract(2);

        assertEquals(12, fixture.getValue(), DELTA);
    }

    @Test
    public void subtractNegative() {
        fixture.add(0);
        fixture.subtract(-1);

        assertEquals(1, fixture.getValue(), DELTA);
    }

    @Test
    public void multiplyPositive() {
        fixture.add(14);
        fixture.multiply(2);

        assertEquals(28, fixture.getValue(), DELTA);
    }

    @Test
    public void multiplyNegatives() {
        fixture.add(-4);
        fixture.multiply(-7);

        assertEquals(28, fixture.getValue(), DELTA);
    }

    @Test
    public void multiplyPositiveNegative() {
        fixture.add(10);
        fixture.multiply(-3);

        assertEquals(-30, fixture.getValue(), DELTA);
    }

    @Test
    public void multiplyByZero() {
        fixture.add(18);
        fixture.multiply(0);

        assertEquals(0, fixture.getValue(), DELTA);
    }

    @Test
    public void dividePositives() {
        fixture.add(14);
        fixture.divide(2);

        assertEquals(7, fixture.getValue(), DELTA);
    }

    @Test
    public void divideNegatives() {
        fixture.add(-7);
        fixture.divide(-4);

        assertEquals(1.75, fixture.getValue(), DELTA);
    }

    @Test
    public void dividePositiveNegative() {
        fixture.add(10);
        fixture.divide(-2);

        assertEquals(-5, fixture.getValue(), DELTA);
    }

    @Test
    public void divideByZero() {
        fixture.add(18);
        fixture.divide(0);

        assertEquals(18, fixture.getValue(), DELTA);
    }

    @Test
    public void divideZero() {
        fixture.add(0);
        fixture.divide(4);

        assertEquals(0, fixture.getValue(), DELTA);
    }

    @Test
    public void squareRootPositive() {
        fixture.add(49);
        fixture.squareRoot();

        assertEquals(7, fixture.getValue(), DELTA);
    }

    @Test
    public void squareRootNegative() {
        fixture.add(-4);
        fixture.squareRoot();

        assertEquals(0, fixture.getValue(), DELTA);
    }

    @Test
    public void squareRootOfZero() {
        fixture.add(0);
        fixture.squareRoot();

        assertEquals(0, fixture.getValue(), DELTA);
    }

    @Test
    public void squareRootFraction() {
        fixture.add(0.01);
        fixture.squareRoot();

        assertEquals(0, fixture.getValue(), DELTA);
    }
}