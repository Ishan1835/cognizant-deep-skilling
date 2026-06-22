public class AdapterTest {

    public static void main(String[] args) {
        PaymentProcessor payPal = new PayPalAdapter(new PayPalGateway());
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());

        payPal.processPayment(49.99);
        stripe.processPayment(19.99);
    }
}
