package Models;


    public interface IPaymentProcessor {
        boolean processPayment(float amount);
        boolean validatePayment();
        String getPaymentStatus();
    }

