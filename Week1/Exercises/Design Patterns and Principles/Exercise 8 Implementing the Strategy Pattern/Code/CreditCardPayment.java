public class CreditCardPayment implements PaymentStrategy {
    private final String name;
    private final String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs " + amount + " using Credit Card [" + cardNumber + "] by " + name);
    }
}