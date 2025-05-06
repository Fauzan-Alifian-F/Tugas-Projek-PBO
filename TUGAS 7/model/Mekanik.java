package model;

public class Mekanik extends Peserta {
    private String spesialisasi;

    public Mekanik(String nama, int umur, String spesialisasi) {
        super(nama, umur);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() { return spesialisasi; }

    @Override
    public void tampilPeran() {
        System.out.println(getNama() + " adalah Mekanik spesialis " + spesialisasi);
    }
}