package JUnits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class CalculatorTest {
    @Test
    public void testAdd() throws Exception {

    }

    @Test(expected = Exception.class)
    public void testDiv()
    {

        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(0, 5), 1);
    }

}