import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brandonteng on 12/14/14.
 */
public class StringCalculatorTest {

    private StringCalculator calculator;

    @Before
    public void initialize() {
        calculator = new StringCalculator();
    }

    @Test
    public void emptyStringShouldReturn0() {
        assertEquals(calculator.add(""), 0);
    }

    @Test
    public void numberStringShouldReturnSameNumber() {
        assertEquals(calculator.add("1"), 1);
        assertEquals(calculator.add("5"), 5);
    }

    @Test
    public void numbersCommaDelimitedShouldBeSummed() {
        assertEquals(calculator.add("1,2"), 3);
        assertEquals(calculator.add("10,15"), 25);
    }

    @Test
    public void numbersNewlineDelimitedShouldBeSummed() {
        assertEquals(calculator.add("1\n2"), 3);
        assertEquals(calculator.add("11\n13"), 24);
    }

    @Test
    public void threeNumbersDelimitedAnywayShouldBeSummed() {
        assertEquals(calculator.add("1,2,3"), 6);
        assertEquals(calculator.add("5\n2\n3"), 10);
    }
}
