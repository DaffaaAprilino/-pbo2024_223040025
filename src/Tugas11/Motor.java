package Tugas11;

public class Motor extends Kendaraan implements Pengoperasian {
    private String tipeMesin;

    public Motor(String nama, int tahun, String tipeMesin) {
        super(nama, tahun);
        this.tipeMesin = tipeMesin;
    }

    @Override
    public String deskripsi() {
        return "Motor: " + nama + ", Tahun: " + tahun + ", Tipe Mesin: " + tipeMesin;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin motor " + nama + " dinyalakan.");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mesin motor " + nama + " dimatikan.");
    }
}
