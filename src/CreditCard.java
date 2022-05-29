import java.math.BigDecimal;

public class CreditCard extends Card{

    public CreditCard() {
    }

    public CreditCard(String cardHolderName, BigDecimal accountBalance) {
        super(cardHolderName, accountBalance);
    }

    public CreditCard(String cardHolderName) {
        super(cardHolderName);
    }

    @Override
    public BigDecimal withdrawBalance(BigDecimal withdraw) {
        return accountBalance.subtract(withdraw);
    }

    @Override
    public String toString() {
        return "CreditCard{}";
    }
}
