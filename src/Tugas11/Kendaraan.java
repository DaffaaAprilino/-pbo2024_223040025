package Tugas11;

public abstract class Kendaraan {
    protected String nama;
    protected int tahun;

    public Kendaraan(String nama, int tahun) {
        this.nama = nama;
        this.tahun = tahun;
    }

    public String getNama() {
        return nama;
    }

    public int getTahun() {
        return tahun;
    }

    public abstract String deskripsi();
}