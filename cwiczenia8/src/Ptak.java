public class Ptak extends Zwierze {

    protected int rozpietoscSkrzydel;
    protected String ruch;
    protected String dzwiek;
    protected String srodowisko;

    public int getRozpietoscSkrzydel() {
        return rozpietoscSkrzydel;
    }

    public void setRozpietoscSkrzydel(int rozpietoscSkrzydel) {
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
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

    public Ptak(String nazwa, int wiek, int rozpietoscSkrzydel, String ruch, String dzwiek, String srodowisko) {
        super(nazwa, wiek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
        this.ruch = ruch;
        this.dzwiek = dzwiek;
        this.srodowisko = srodowisko;
    }

    public void wyswietlRozmiarSkrzydel() {
        System.out.println("skrzydła tego ptaka mają rozpiętość " + rozpietoscSkrzydel + " centymetrów");
    }

    @Override
    public String wydajDzwiek() {
        return "ten ptak wydaje dźwięk " + dzwiek;
    }

    @Override
    public String poruszajSie() {
        return "sposób poruszania się tego ptaka to " + ruch;
    }

    @Override
    public String srodowiskoNaturalne() {
        return "ptaki mogą zamieszkiwać prawie wszystkie ekosystemy Ziemi, w tym przypadku " + srodowisko;
    }

}
