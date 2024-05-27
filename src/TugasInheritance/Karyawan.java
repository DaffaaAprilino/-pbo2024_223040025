package TugasInheritance;

public class Karyawan {
    protected String nama;
    protected String nip;
    
    public Karyawan(String nip, String nama){
      this.nama = nama;
      this.nip = nip;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
}