package latihantugasInheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("223040025","Daffaa Aprilino", "Bandung");
        System.out.println(mhs.getNrp() + "-" + mhs.getNama() + "-" + mhs.getAlamat());
    }
}
       