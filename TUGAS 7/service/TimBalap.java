package service;

import model.Peserta;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

public class TimBalap<T extends Peserta> {
    private ArrayList<T> anggota = new ArrayList<>();
    private Deque<T> antrian = new ArrayDeque<>();

    public void tambahAnggota(T peserta) {
        anggota.add(peserta);
        antrian.offer(peserta);
    }

    public void tampilAnggota() {
        for (T p : anggota) {
            p.tampilPeran();
        }
    }

    public void prosesAntrian() {
        while (!antrian.isEmpty()) {
            T p = antrian.poll();
            System.out.println("Memproses: " + p.getNama());
        }
    }
}