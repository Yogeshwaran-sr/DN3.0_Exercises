package AdapterPatternExample;

public class TestClass {
    public static void main(String[] args) {
        PaymentProcessor googlepay = new GooglePayAdapter(new GooglePay());
        PaymentProcessor phonepe = new PhonePeAdapter(new PhonePe());

        googlepay.processPayment(100);
        phonepe.processPayment(200);
    }
}
