
public class PaymentProcessor {

    public void processPayment(String type, double amount) {
        if ("CREDIT_CARD".equalsIgnoreCase(type)) {
            System.out.println("[CREDIT_CARD] Processing credit card payment of $" + amount);
            System.out.println("  - Validating card number...");
            System.out.println("  - Checking available credit...");
            System.out.println("  - Charging card...");
        } else if ("PAYPAL".equalsIgnoreCase(type)) {
            System.out.println("[PAYPAL] Processing PayPal payment of $" + amount);
            System.out.println("  - Logging in to PayPal account...");
            System.out.println("  - Confirming balance...");
            System.out.println("  - Transferring funds...");
        } else if ("CRYPTO".equalsIgnoreCase(type)) {
            System.out.println("[CRYPTO] Processing crypto payment of $" + amount);
            System.out.println("  - Connecting to blockchain network...");
            System.out.println("  - Verifying wallet address...");
            System.out.println("  - Broadcasting transaction...");
        } else {
            System.out.println("[ERROR] Unsupported payment type: " + type);
        }
    }
}

