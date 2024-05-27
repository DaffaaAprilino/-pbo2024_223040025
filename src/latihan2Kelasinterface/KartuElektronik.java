package latihan2Kelasinterface;

public class KartuElektronik implements Kartu{
    private String pin;

    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.pin = pin;
    }

    @Override
    public boolean otentikasi(String pinInput) {
        if(pin.equals(pinInput))
            return true;
            else
                return false;
        }

    @Override
    public String encode(String pin) {
        return null;
    }
}