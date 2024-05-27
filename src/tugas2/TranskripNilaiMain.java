package tugas2;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create objek Dosen
        Dosen dosen1 = new Dosen("Nama Dosen 1");
        Dosen dosen2 = new Dosen("Nama Dosen 2");

        // Create objek matakuliah dengan dosen pengajar
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3, dosen1);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3, dosen1);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3, dosen2);

        // Create objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("20222");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        // Create Objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.display();
    }
}
