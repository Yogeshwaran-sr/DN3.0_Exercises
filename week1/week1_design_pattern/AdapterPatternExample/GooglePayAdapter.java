package AdapterPatternExample;

public class GooglePayAdapter implements PaymentProcessor {
    private GooglePay googlepay;

    public GooglePayAdapter(GooglePay googlepay) {
        this.googlepay = googlepay;
    }

    public void processPayment(int amount) {
        this.googlepay.payment(amount);
    }
}
