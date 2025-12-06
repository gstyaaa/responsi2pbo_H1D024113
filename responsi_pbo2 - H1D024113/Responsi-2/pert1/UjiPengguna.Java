public class UjiPengguna {
    public static void main(String[] args) {
        // Membuat objek dari class Pengguna
        Pengguna p = new Pengguna(25, 60.0, 170.0);

        p.tampilInfo();

        System.out.println();
        System.out.println("--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");
        System.out.println();
        System.out.println("Jika kita mencoba menulis:");
        System.out.println("p.faktorAktivitas = 1.5;");
        System.out.println();
        System.out.println("Maka compiler akan menolak dengan error:");
        System.out.println("'cannot assign a value to final variable faktorAktivitas'");
        
    }
}