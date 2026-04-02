package edu.university.staff;

public class StafAdministrasi extends Pegawai {

    private int jamLembur;

    public StafAdministrasi(String nama, double gajiPokok, int jamLembur) {
        super(nama, gajiPokok);
        this.jamLembur = jamLembur;
    }

    public int getJamLembur() { return jamLembur; }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jamLembur * 50_000);
    }

    @Override
    public String toString() {
        return String.format("[Staf Admin]   Nama: %-20s | Lembur: %2d jam | Gaji Pokok: Rp%,12.0f | Total Gaji: Rp%,12.0f",
                nama, jamLembur, gajiPokok, hitungGaji());
    }
}
