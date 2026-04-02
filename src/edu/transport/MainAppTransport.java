package edu.transport;

public class MainAppTransport {

    public static void main(String[] args) {

        final double JARAK = 120.0; // km

        Kendaraan mobil = new Mobil("Toyota Avanza", 120.0);
        Kendaraan motor = new Motor("Honda Vario",   100.0);

        for (Kendaraan k : new Kendaraan[]{ mobil, motor }) {
            double waktuJam   = k.hitungWaktuTempuh(JARAK);
            int    jam        = (int) waktuJam;
            int    menit      = (int) Math.round((waktuJam - jam) * 60);

            System.out.println(k);
            System.out.printf("         Waktu tempuh %.0f km : %.2f jam (%d jam %d menit)%n%n",
                    JARAK, waktuJam, jam, menit);
        }
    }
}
