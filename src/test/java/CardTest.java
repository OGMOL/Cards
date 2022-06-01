import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CardTest {

    @Test
    public void addBalance() {
        CreditCard card = new CreditCard("Anna");
        BigDecimal actual = card.addBalance(new BigDecimal("666"));
        BigDecimal expected = new BigDecimal("666");
        assertEquals(expected, actual);
    }
}