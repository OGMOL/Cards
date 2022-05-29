import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws InsufficientFundsException {
        CreditCard card1 = new CreditCard("Vasia", new BigDecimal(6));
        System.out.println(card1.getAccountBalance());
        card1.setAccountBalance(new BigDecimal("2222"));
        System.out.println(card1.getAccountBalance());
        card1.setAccountBalance(card1.addBalance(new BigDecimal("222")));
        System.out.println(card1.getAccountBalance());
        card1.setAccountBalance(card1.withdrawBalance(new BigDecimal("3444")));
        System.out.println(card1.getAccountBalance());

        DebitCard card2 = new DebitCard("Anna");
        System.out.println(card2.getAccountBalance());
        card2.setAccountBalance(card2.addBalance(new BigDecimal("500")));
        System.out.println(card2.getAccountBalance());
        System.out.println(card2.cardHolderName);
        card2.setAccountBalance(card2.withdrawBalance(new BigDecimal("50")));
        System.out.println(card2.getAccountBalance());
        System.out.println(card2.convertBalance(new BigDecimal("2.6")));

        Atm atm = new Atm(card2);
        card2.setAccountBalance(atm.withdrawBalance(new BigDecimal(450)));
        System.out.println(card2.getAccountBalance());

    }
}

