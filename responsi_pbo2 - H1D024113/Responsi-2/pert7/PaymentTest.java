public class PaymentTest {

    public static void main(String[] args) {

        EWalletPayment ovo = new EWalletPayment("OVO", 50000, 150000);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.println("Saldo awal: " + ovo.getBalance());
        System.out.println("Memproses pembayaran sebesar " + 50000 + "...");

        System.out.println(ovo.processPayment());

        System.out.println("Sisa saldo: " + ovo.getBalance());
        System.out.println("Detail Transaksi: " + ovo.getPaymentDetails());
    }
}
