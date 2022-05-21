public class Card {
    private String cardHolderName;
    private int accountBalance;

    public Card() {

    }

    public Card(String cardHolderName, int accountBalance) {
        this.cardHolderName = cardHolderName;
        this.accountBalance = accountBalance;
    }

    public Card(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void balance() {
        System.out.println(accountBalance);
    }

    public void addBalance(int add) {
        accountBalance += add;
    }

    public void withdrawBalance(int withdraw) {
        accountBalance -= withdraw;
    }

    public void dollarBalance(double exchangeRate) {
        System.out.println(accountBalance / exchangeRate);
    }
}
