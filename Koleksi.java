import java.util.ArrayList;
import java.util.ArrayDeque;

public class Koleksi {
    public static void main(String[] args) {
        // Menggunakan ArrayList
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Citra");

        System.out.println("Isi ArrayList:");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }

        // Menggunakan ArrayDeque
        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.offer("Andi");
        antrian.offer("Budi");
        antrian.offer("Citra");

        System.out.println("\nProses Antrian (ArrayDeque):");
        while (!antrian.isEmpty()) {
            System.out.println("Memproses: " + antrian.poll());
        }
    }
}