public class CreditCard extends Card{

    public CreditCard() {

    }

    public CreditCard(String cardHolderName, int accountBalance) {
        super(cardHolderName, accountBalance);
    }

    public CreditCard(String cardHolderName) {
        super(cardHolderName);
    }

}
