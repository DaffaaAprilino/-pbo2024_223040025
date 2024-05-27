package tugas2;

public class Matakuliah {
    private String kode;
    private String nama;
    private String nilai;
    private int sks;
    private Dosen dosenPengajar; // Menyatakan relasi dengan kelas Dosen

    public Matakuliah(String kode, String nama, String nilai, int sks, Dosen dosenPengajar) {
        this.kode = kode;
        this.nama = nama;
        this.nilai = nilai;
        this.sks = sks;
        this.dosenPengajar = dosenPengajar; // Relasi dengan objek Dosen
    }

    public String display() {
        return "Kode: " + kode + ", Nama: " + nama + ", Nilai: " + nilai + ", SKS: " + sks +
                ", Dosen Pengajar: " + dosenPengajar.getNama();
    }
}
