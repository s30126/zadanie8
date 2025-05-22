public class Ssak extends Zwierze {

    protected String kolorFutra;
    protected String ruch;
    protected String dzwiek;
    protected String srodowisko;

    public String getKolorFutra() {
        return kolorFutra;
    }

    public void setKolorFutra(String kolorFutra) {
        this.kolorFutra = kolorFutra;
    }

    public String getRuch() {
        return ruch;
    }

    public void setRuch(String ruch) {
        this.ruch = ruch;
    }

    public String getDzwiek() {
        return dzwiek;
    }

    public void setDzwiek(String dzwiek) {
        this.dzwiek = dzwiek;
    }

    public String getSrodowisko() {
        return srodowisko;
    }

    public void setSrodowisko(String srodowisko) {
        this.srodowisko = srodowisko;
    }

    public Ssak(String nazwa, int wiek, String kolorFutra, String ruch, String dzwiek, String srodowisko) {
        super(nazwa, wiek);
        this.kolorFutra = kolorFutra;
        this.ruch = ruch;
        this.dzwiek = dzwiek;
        this.srodowisko = srodowisko;
    }

    public void wyswietlKolorFutra() {
        System.out.println("kolor futra tego ssaka to " + kolorFutra);
    }

    @Override
    public String wydajDzwiek() {
        return "ten ssak wydaje dźwięk " + dzwiek;
    }

    @Override
    public String poruszajSie() {
        return "sposób poruszania się tego ssaka to " + ruch;
    }

    @Override
    public String srodowiskoNaturalne() {
        return "ssaki mogą zamieszkiwać wszystkie ekosystemy Ziemi, w tym przypadku " + srodowisko;
    }
}
