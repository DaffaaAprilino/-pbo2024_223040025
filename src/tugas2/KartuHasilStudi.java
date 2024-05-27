package tugas2;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMataKuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMataKuliah) {
            sb.append(mk.display());
            sb.append("\n"); // Menggunakan \n untuk newline
        }
        return sb.toString();
    }

    public void hitungIPS() {
        // Implementasi hitung IPS
    }

    // Getter dan setter untuk atribut semester dan ips
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }
}
