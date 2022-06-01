import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CreditCardTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void withdrawBalance() {
        CreditCard card1 = new CreditCard("Vika", new BigDecimal("1000"));
        BigDecimal actual = card1.withdrawBalance(new BigDecimal("1500"));
        BigDecimal expected = new BigDecimal("-500");
        assertEquals(expected, actual);
    }
}