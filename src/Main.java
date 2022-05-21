public class Main {
    public static void main(String[] args) {
        Card card = new Card("Vasia",777);
        card.balance();
        card.addBalance(333);
        card.balance();
        card.withdrawBalance(110);
        card.balance();
        card.dollarBalance(2.5);
        CreditCard card1 = new CreditCard("Alex");
        card1.balance();
        card1.withdrawBalance(333);
        card1.balance();
        DebitCard card2 = new DebitCard("Vika",200);
        card2.withdrawBalance(201);
        card2.balance();
        card2.withdrawBalance(200);
        card2.balance();
        ATM atm = new ATM();
        atm.deposit(card2,50);
        card2.balance();
        atm.withdraw(card2,60);
        card2.balance();
    }
}
