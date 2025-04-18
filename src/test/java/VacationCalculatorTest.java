

import org.junit.jupiter.api.Test;
import ru.netology.services.VacationCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCalculatorTest {

    @Test
    public void testCalculate() {
        VacationCalculator calculator = new VacationCalculator();

        int month1 = calculator.calculate(10000, 3000, 20000);
        assertEquals(3, month1);
    }

    @Test
    public void testCalculate2() {
        VacationCalculator calculator = new VacationCalculator();
        int month2 = calculator.calculate(100000, 60000, 150000);
        assertEquals(2, month2);
    }

    @Test
    public void testCalculate3() {
        VacationCalculator calculator = new VacationCalculator();
        int month3 = calculator.calculate(5000, 6000, 10000);
        assertEquals(0, month3);
    }

    @Test
    public void testCalculate4() {
        VacationCalculator calculator = new VacationCalculator();
        int month4 = calculator.calculate(50000, 10000, 100000);
        assertEquals(4, month4);

    }
}