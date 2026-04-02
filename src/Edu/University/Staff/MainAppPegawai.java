package Edu.University.Staff;

public class MainAppPegawai {

    public static void main(String[] args) {

        Pegawai[] daftarPegawai = {
                new Dosen("Pak Andri",    6_000_000, 17),
                new Dosen("Bu Amalia",  8_000_000, 13),
                new StaffAdministrasi("Pak Andi",   2_000_000, 8),
                new StaffAdministrasi("Bu Amel", 2_500_000, 12),
        };

        for (Pegawai p : daftarPegawai) {
            System.out.println(p);
        }
    }
}