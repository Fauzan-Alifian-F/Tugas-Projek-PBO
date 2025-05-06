package main;

import model.Pembalap;
import model.Mekanik;
import service.TimBalap;

public class App {
    public static void main(String[] args) {
        TimBalap<Pembalap> timPembalap = new TimBalap<>();
        timPembalap.tambahAnggota(new Pembalap("Ciki", 32, "9"));
        timPembalap.tambahAnggota(new Pembalap("Deri", 22, "45"));

        TimBalap<Mekanik> timMekanik = new TimBalap<>();
        timMekanik.tambahAnggota(new Mekanik("Cahya", 27, "Mesin"));
        timMekanik.tambahAnggota(new Mekanik("Ijam", 20, "Mesin"));

        System.out.println("=== Daftar Pembalap ===");
        timPembalap.tampilAnggota();

        System.out.println("=== Daftar Mekanik ===");
        timMekanik.tampilAnggota();

        System.out.println("=== Proses Antrian Pembalap ===");
        timPembalap.prosesAntrian();
    }
}