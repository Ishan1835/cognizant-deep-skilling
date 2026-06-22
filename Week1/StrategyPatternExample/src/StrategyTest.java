public class StrategyTest {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("4111111111111234"));
        paymentContext.executePayment(120.50);

        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.executePayment(75.00);
    }
}
