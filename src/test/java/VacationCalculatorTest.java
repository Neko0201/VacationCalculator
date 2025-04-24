import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.VacationCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCalculatorTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calculator.csv")
    void testCalculate(int expected, int income, int expenses, int threshold) {
        VacationCalculator calculator = new VacationCalculator();

        int month1 = calculator.calculate(10000, 3000, 20000);
        assertEquals(3, month1);
    }
}
