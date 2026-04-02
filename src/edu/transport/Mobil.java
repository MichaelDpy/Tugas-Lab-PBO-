package edu.transport;

public class Mobil extends Kendaraan {

    private static final double EFISIENSI = 0.80;

    public Mobil(String nama, double kecepatanMaks) {
        super(nama, kecepatanMaks);
    }

    public double getKecepatanEfektif() {
        return kecepatanMaks * EFISIENSI;
    }

    @Override
    public double hitungWaktuTempuh(double jarak) {
        return jarak / getKecepatanEfektif();
    }

    @Override
    public String toString() {
        return String.format("[Mobil] %-15s | Kec. Maks: %.0f km/h | Kec. Efektif: %.0f km/h",
                nama, kecepatanMaks, getKecepatanEfektif());
    }
}
