public class StripeGateway {
    public void charge(int amountInCents) {
        System.out.println("StripeGateway: charged " + amountInCents + " cents via Stripe");
    }
}
