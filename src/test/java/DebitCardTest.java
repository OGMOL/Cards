import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DebitCardTest {

    @Test
    public void withdrawBalance() throws InsufficientFundsException {
        DebitCard card = new DebitCard("Vasia", new BigDecimal("250"));
        boolean thrown = false;

        try {
            card.withdrawBalance(new BigDecimal("500"));
        } catch (InsufficientFundsException e) {
            thrown = true;
        }
        assertTrue(thrown);

        BigDecimal actual = card.withdrawBalance(new BigDecimal("250"));
        BigDecimal expected = new BigDecimal("0");
        assertEquals(expected, actual);
    }
}