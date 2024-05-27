package TugasInheritance;

public class Dosen extends Karyawan{
    private String jurusan;
    public Dosen(String nip, String nama, String jurusan){
        super(nip, nama);
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
}