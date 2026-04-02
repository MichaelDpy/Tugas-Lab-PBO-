package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable {

    private int     batteryLevel;
    private boolean connected;
    private String  ssid;

    public SmartWatch() {
        this.batteryLevel = 20;
        this.connected    = false;
        this.ssid         = "";
    }

    @Override
    public void chargeBattery(int menit) {
        batteryLevel = Math.min(100, batteryLevel + menit);
        System.out.printf("  [Charging] +%d%% → Baterai sekarang: %d%%%n", menit, batteryLevel);
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void connectWifi(String ssid) {
        if (ssid != null && !ssid.isBlank()) {
            this.ssid      = ssid;
            this.connected = true;
            System.out.println("  [WiFi] Berhasil terhubung ke: " + ssid);
        } else {
            this.connected = false;
            System.out.println("  [WiFi] Gagal: SSID tidak boleh kosong.");
        }
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    public void tampilkanStatus() {
        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("│        STATUS SMARTWATCH            │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.printf ("│  Baterai  : %3d%%                    │%n", batteryLevel);
        System.out.printf ("│  WiFi     : %-26s│%n", connected ? "Terhubung (" + ssid + ")" : "Tidak Terhubung");
        System.out.println("└─────────────────────────────────────┘");
    }
}
