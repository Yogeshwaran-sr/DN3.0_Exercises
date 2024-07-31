package AdapterPatternExample;

public class PhonePeAdapter implements PaymentProcessor {
    private PhonePe phonepe;

    public PhonePeAdapter(PhonePe phonepe) {
        this.phonepe = phonepe;
    }

    public void processPayment(int amount) {
        this.phonepe.payment(amount);
    }
}
