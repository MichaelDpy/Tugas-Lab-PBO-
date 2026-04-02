package edu.university.staff;

public class MainAppPegawai {

    public static void main(String[] args) {

        Pegawai[] daftarPegawai = {
            new Dosen("Pak Fauzan",    8_000_000, 12),
            new Dosen("Pak Handrizal",  10_000_000, 18),
            new StafAdministrasi("Pak Amer",   4_000_000, 10),
            new StafAdministrasi("Bu Hayatunnufus", 3_500_000, 5),
        };

        for (Pegawai p : daftarPegawai) {
            System.out.println(p);
        }
    }
}
