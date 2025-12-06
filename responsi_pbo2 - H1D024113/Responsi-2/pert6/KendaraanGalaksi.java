public abstract class KendaraanGalaksi {

    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    protected void setLevelEnergi(int energi) {
        if (energi > 100) energi = 100;
        if (energi < 0) energi = 0;
        this.levelEnergi = energi;
    }

    public final void tampilStatus() {
        System.out.println(getNamaKendaraan() + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }

    public abstract void aktifkanMesin();

    public abstract void jelajah(int jarak);

    public abstract void isiEnergi(int jumlah);
}
