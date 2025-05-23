import java.sql.SQLOutput;

public abstract class Zwierze {

    protected String nazwa;
    protected int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public abstract String wydajDzwiek();

    public abstract String poruszajSie();

    public abstract String srodowiskoNaturalne();

    public String wyswietlInformacje() {
        return nazwa + ", " + wiek + " lat, " + wydajDzwiek() + ", " + poruszajSie();
    }


}
