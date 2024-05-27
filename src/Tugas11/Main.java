package Tugas11;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 2020, "Bensin");
        Motor motor = new Motor("Yamaha NMAX", 2021, "Bensin");

        System.out.println(mobil.deskripsi());
        mobil.nyalakanMesin();
        mobil.matikanMesin();

        System.out.println(motor.deskripsi());
        motor.nyalakanMesin();
        motor.matikanMesin();
    }
}
