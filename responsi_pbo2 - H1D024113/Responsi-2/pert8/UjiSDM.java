public class UjiSDM {

    public static void main(String[] args) {

        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        andi.hitungGaji(160);

        System.out.println("Status Cuti: " + andi.getStatusCuti());

        andi.login("9999");

        andi.login("1234");

        System.out.println("Role Akses: " + andi.getRoleAkses());

        andi.perpanjangKontrak(6);

        andi.logout();
    }
}
