package edu.smartdevice;

public class MainAppSmartDevice {

    public static void main(String[] args) {

        SmartWatch watch = new SmartWatch();

        System.out.println("\n>> Status Awal:");
        watch.tampilkanStatus();

        System.out.println("\n>> Mengisi baterai selama 50 menit...");
        watch.chargeBattery(50);

        System.out.println("\n>> Mencoba koneksi WiFi dengan SSID kosong...");
        watch.connectWifi("");

        System.out.println("\n>> Mencoba koneksi WiFi 'RumahKu_5G'...");
        watch.connectWifi("RumahKu_5G");

        System.out.println("\n>> Status Akhir:");
        watch.tampilkanStatus();
    }
}
