import java.util.Arrays;
import java.util.Comparator;

class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] daftarMesin = new defaultMesin[5];

        daftarMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftarMesin[1] = new mesinTraktor("Kubota MX5200", 520, 4.5);
        daftarMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        daftarMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        daftarMesin[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (defaultMesin m : daftarMesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        for (defaultMesin m : daftarMesin) {
            System.out.print(m.namaMesin + " → ");

            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
        }

        // Cari performa tertinggi
        defaultMesin terbaik = daftarMesin[0];
        for (defaultMesin m : daftarMesin) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = m;
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());

        // Sorting descending performa
        Arrays.sort(daftarMesin, Comparator.comparingDouble(defaultMesin::nilaiPerforma).reversed());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + daftarMesin[i].namaMesin + " → " + daftarMesin[i].nilaiPerforma());
        }
    }
}
