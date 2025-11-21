
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment("CREDIT_CARD", 500.0);
        processor.processPayment("PAYPAL", 1200.0);
        processor.processPayment("CRYPTO", 250.0);
        processor.processPayment("CASH", 100.0);
    }
}
