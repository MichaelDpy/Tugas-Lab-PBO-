package edu.university.main;

import edu.university.model.Mahasiswa;

public class MainApp {

    public static void main(String[] args) {

        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("2421001", "Michael",   3.90),
            new Mahasiswa("2421002", "Mario",   3.60),
            new Mahasiswa("2421003", "Aprichie",     3.80),
            new Mahasiswa("2421004", "Hagai",    3.50),
        };

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m);
        }
    }
}
