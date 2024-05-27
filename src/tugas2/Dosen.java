package tugas2;

import java.util.ArrayList;
import java.util.List;

public class Dosen {
    private String nama;
    private List<Matakuliah> mengajarMatakuliah;

    public Dosen(String nama) {
        this.nama = nama;
        this.mengajarMatakuliah = new ArrayList<>();
    }

    public void tambahMengajar(Matakuliah matakuliah) {
        mengajarMatakuliah.add(matakuliah);
    }

    public String getNama() {
        return nama;
    }

    public List<Matakuliah> getMengajarMatakuliah() {
        return mengajarMatakuliah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
