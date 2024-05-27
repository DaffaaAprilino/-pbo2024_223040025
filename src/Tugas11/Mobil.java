package Tugas11;

public class Mobil extends Kendaraan implements Pengoperasian {
    private String tipeMesin;

    public Mobil(String nama, int tahun, String tipeMesin) {
        super(nama, tahun);
        this.tipeMesin = tipeMesin;
    }

    @Override
    public String deskripsi() {
        return "Mobil: " + nama + ", Tahun: " + tahun + ", Tipe Mesin: " + tipeMesin;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil " + nama + " dinyalakan.");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mesin mobil " + nama + " dimatikan.");
    }
}
