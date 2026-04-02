package Edu.University.SmartDevice;

public class MainAppSmartDevice {

    public static void main(String[] args) {

        SmartWatch watch = new SmartWatch();

        System.out.println("\n>> Status Awal:");
        watch.tampilkanStatus();

        System.out.println("\n>> Mengisi baterai selama 30 menit...");
        watch.chargeBattery(30);

        System.out.println("\n>> Mencoba koneksi WiFi dengan SSID kosong...");
        watch.connectWifi("");

        System.out.println("\n>> Mencoba koneksi WiFi 'Eduroam'...");
        watch.connectWifi("EduroamIlkom");

        System.out.println("\n>> Status Akhir:");
        watch.tampilkanStatus();
    }
}
