import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard() {
    }

    public DebitCard(String cardHolderName, BigDecimal accountBalance) {
        super(cardHolderName, accountBalance);
    }

    public DebitCard(String cardHolderName) {
        super(cardHolderName);
    }

    @Override
    public BigDecimal withdrawBalance(BigDecimal withdraw) throws InsufficientFundsException {
        if (accountBalance.compareTo(withdraw) >= 0) {
            return accountBalance.subtract(withdraw);
        } else {
            throw new InsufficientFundsException("У вас не достаточно средств");
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
