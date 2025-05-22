public class Gad extends Zwierze {

    protected int dlugoscCiala;
    protected String ruch;
    protected String dzwiek;
    protected String srodowisko;

    public int getDlugoscCiala() {
        return dlugoscCiala;
    }

    public void setDlugoscCiala(int dlugoscCiala) {
        this.dlugoscCiala = dlugoscCiala;
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

    public Gad(String nazwa, int wiek, int dlugoscCiala, String ruch, String dzwiek, String srodowisko) {
        super(nazwa, wiek);
        this.dlugoscCiala = dlugoscCiala;
        this.ruch = ruch;
        this.dzwiek = dzwiek;
        this.srodowisko = srodowisko;
    }

    public void wyswietlDlugoscCiala() {
        System.out.println("długość ciała tego gada wynosi " + dlugoscCiala + " centymetrów");
    }

    @Override
    public String wydajDzwiek() {
        return "ten gad wydaje dźwięk " + dzwiek;
    }

    @Override
    public String poruszajSie() {
        return "sposób poruszania się tego gada to " + ruch;
    }

    @Override
    public String srodowiskoNaturalne() {
        return "gady mogą zamieszkiwać prawie wszystkie ekosystemy Ziemi z wyjątkiem Antarktydy, w tym przypadku " + srodowisko;
    }

}
