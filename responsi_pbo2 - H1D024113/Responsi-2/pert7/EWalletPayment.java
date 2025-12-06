public class EWalletPayment implements PaymentMethod {

    private String namaLayanan;
    private double nominalPembayaran;
    private double saldo;

    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldo) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldo = saldo;
    }

    @Override
    public String processPayment() {
        double total = nominalPembayaran + getTransactionFee();

        if (saldo >= total) {
            saldo -= total;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan +
               ", nominal: " + nominalPembayaran +
               ", fee: " + getTransactionFee();
    }

    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
