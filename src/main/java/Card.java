import java.math.BigDecimal;
import java.util.Objects;

public abstract class Card {
    protected String cardHolderName;
    protected BigDecimal accountBalance;

    public Card() {
    }

    public Card(String cardHolderName, BigDecimal accountBalance) {
        this.cardHolderName = cardHolderName;
        this.accountBalance = accountBalance;
    }

    public Card(String cardHolderName) {
        this.accountBalance = BigDecimal.ZERO;
        this.cardHolderName = cardHolderName;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BigDecimal addBalance(BigDecimal money) {
        return accountBalance.add(money);
    }

    public abstract BigDecimal withdrawBalance(BigDecimal withdraw) throws InsufficientFundsException;

    public BigDecimal convertBalance(BigDecimal exchangeRate) {
        return accountBalance.multiply(exchangeRate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardHolderName, card.cardHolderName) && Objects.equals(accountBalance, card.accountBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardHolderName, accountBalance);
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
