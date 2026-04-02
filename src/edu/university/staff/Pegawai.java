package edu.university.staff;

public class Pegawai {

    protected String nama;
    protected double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama      = nama;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public String getNama()      { return nama; }
    public double getGajiPokok() { return gajiPokok; }

    @Override
    public String toString() {
        return String.format("Nama: %-20s | Gaji Pokok: Rp%,12.0f | Total Gaji: Rp%,12.0f",
                nama, gajiPokok, hitungGaji());
    }
}
