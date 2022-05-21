public class ATM {

    public ATM() {
    }

    public void deposit(Card card, int add) {
        card.setAccountBalance(card.getAccountBalance() + add);
    }

    public void withdraw(CreditCard card, int withdrawBalance) {
        card.setAccountBalance(card.getAccountBalance() - withdrawBalance);
    }

    public void withdraw(DebitCard card, int withdrawBalance) {
        if (card.getAccountBalance() - withdrawBalance < 0) {
            System.out.println("Insufficient funds");
        } else {
            card.setAccountBalance(card.getAccountBalance() - withdrawBalance);
        }
    }
}
