package medium.testExamples.oddOrEven;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCalculatorTest {
    @Test
    public void verificaSeONumeroEPar(){

        NumberCalculator calc = new NumberCalculator();

        boolean num = calc.verifyNumber(4);

        assertEquals(true, num);
    }
}