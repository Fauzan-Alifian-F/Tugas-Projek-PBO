package model;

public class Pembalap extends Peserta {
    private String nomorBalap;

    public Pembalap(String nama, int umur, String nomorBalap) {
        super(nama, umur);
        this.nomorBalap = nomorBalap;
    }

    public String getNomorBalap() { return nomorBalap; }

    @Override
    public void tampilPeran() {
        System.out.println(getNama() + " adalah Pembalap dengan nomor " + nomorBalap);
    }
}