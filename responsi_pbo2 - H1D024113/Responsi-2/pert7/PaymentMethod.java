public interface PaymentMethod {

    String processPayment();
    String getPaymentDetails();
    double getTransactionFee();
    double getBalance();
}
