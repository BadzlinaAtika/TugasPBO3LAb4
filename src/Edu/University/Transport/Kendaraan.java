package Edu.University.Transport;

public class Kendaraan {
    protected String nama;
    protected double kecepatanMaks; // km/jam

    public Kendaraan(String nama, double kecepatanMaks) {
        this.nama          = nama;
        this.kecepatanMaks = kecepatanMaks;
    }

    public double hitungWaktuTempuh(double jarak) {
        return 0;
    }

    public String getNama()           { return nama; }
    public double getKecepatanMaks()  { return kecepatanMaks; }
}
