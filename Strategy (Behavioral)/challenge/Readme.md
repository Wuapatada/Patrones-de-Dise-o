# Kata: Strategy – Challenge

## Contexto

Tienes un sistema de pagos en línea con una clase `PaymentProcessor` que decide cómo procesar el pago según un `String` con el tipo de pago:

- `"CREDIT_CARD"`
- `"PAYPAL"`
- `"CRYPTO"`
- Otros que se vayan agregando.

Actualmente el código usa un gran bloque de `if/else` para decidir qué hacer para cada tipo. Esto hace que el código sea difícil de mantener, probar y extender.

---

## Código actual (a refactorizar)

### `Main.java`

```java
package strategy.challenge;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment("CREDIT_CARD", 500.0);
        processor.processPayment("PAYPAL", 1200.0);
        processor.processPayment("CRYPTO", 250.0);
        processor.processPayment("CASH", 100.0);
    }
}
