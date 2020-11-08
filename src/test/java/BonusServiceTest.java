import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();


        long amount = 100_00;
        boolean registered = false;
        long expected = 1;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();


        long amount = 50_100_00;
        boolean registered = false;
        long expected = 500;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}