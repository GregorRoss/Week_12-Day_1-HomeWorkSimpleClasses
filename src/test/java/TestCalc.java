import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalc {

    Calculator calc;
    @Before
    public void before() {
        calc = new Calculator();
    }
    @Test
    public void canAdd() {
        int result = calc.add(5, 5);
        assertEquals(10, result);
    }

    @Test
    public void canSubtract(){
        int result = calc.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void canMultiply(){
        int result = calc.multiply(5, 5);
        assertEquals(25, result);
    }
    @Test
    public void canDivide(){
        assertEquals(2.00, calc.divide(10.00, 5.00), 0.01);
    }
}
