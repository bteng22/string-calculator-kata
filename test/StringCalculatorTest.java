import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brandonteng on 12/14/14.
 */
public class StringCalculatorTest {

    @Test
    public void emptyStringShouldReturn0() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add(""), 0);
    }
}
