package medium.testExamples.dayToGoToTheMarket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DayCalculatorTest {

        @Test
        public void verifyisDay() {
            DayCalculator day = new DayCalculator();
            String dia = day.calculator("Domingo");
            assertEquals("Domingo",dia);
        }

    @Test
    public void verifyisNotDay() {
        DayCalculator day = new DayCalculator();
        String dia = day.calculator("Quarta");
        assertNotEquals("Domingo",dia);
    }

    }

