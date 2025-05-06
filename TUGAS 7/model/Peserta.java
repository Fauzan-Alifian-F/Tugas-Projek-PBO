package model;

public abstract class Peserta {
    private String nama;
    private int umur;

    public Peserta(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() { return nama; }
    public int getUmur() { return umur; }

    public abstract void tampilPeran();
}