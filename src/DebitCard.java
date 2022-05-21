public class DebitCard extends Card {

    public DebitCard() {
    }

    public DebitCard(String cardHolderName, int accountBalance) {
        super(cardHolderName, accountBalance);
    }

    public DebitCard(String cardHolderName) {
        super(cardHolderName);
    }

    @Override
    public void withdrawBalance(int withdraw) {
        if (getAccountBalance() - withdraw < 0) {
            System.out.println("Insufficient funds");
        } else {
            setAccountBalance(getAccountBalance() - withdraw);
        }
    }
}
