package TugasInheritance;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("2210", "Hendri Adrian", "algoritma");
        System.out.println(dosen.getNip() + " - " + dosen.getNama() + " - " + dosen.getJurusan());
    }
}