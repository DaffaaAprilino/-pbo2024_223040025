package kelas;

public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    // Konstruktor
    public Matakuliah(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    // Mendapatkan nilai index berdasarkan nilai
    public double nilaiIndex() {
        // Berdasarkan index matakuliah
        // A = 4, AB = 3.5, B = 3, BC = 2.5, C = 2, D = 1, E = 0
        double indexNilai;
        switch (index) {
            case "A":
                indexNilai = 4;
                break;
            case "AB":
                indexNilai = 3.5;
                break;
            case "B":
                indexNilai = 3;
                break;
            case "BC":
                indexNilai = 2.5;
                break;
            case "C":
                indexNilai = 2;
                break;
            case "D":
                indexNilai = 1;
                break;
            default:
                indexNilai = 0;
                break;
        }
        return indexNilai;
    }

    public String display() {
        return kode + " - " + nama + " - " + index;
    }

    public int getSks() {
        return sks;
    }
}
