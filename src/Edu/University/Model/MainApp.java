package Edu.University.Model;

public class MainApp {

    public static void main(String[] args) {

        Mahasiswa[] daftarMahasiswa = {
                new Mahasiswa("2414000", "Badzlina",   4.00),
                new Mahasiswa("2414001", "Atika",   3.78),
                new Mahasiswa("2414002", "Salsa",     3.60),
                new Mahasiswa("2414003", "Bila",    3.80),
        };

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m);
        }
    }
}