public class ZarzadzanieZoo {
    public static void main(String[] args) {

        Ssak lew = new Ssak("lew", 7, "kremowy", "chód lub bieg", "roar", "sawanna");

        Ptak wrobel = new Ptak("wróbel", 2, 21, "lot", "chirp", "wieś");

        Gad krokodyl = new Gad("krokodyl", 20, 500, "chód lub pływanie", "???", "mokradło");

        System.out.println(lew.wyswietlInformacje());
        System.out.println(wrobel.wyswietlInformacje());
        System.out.println(krokodyl.wyswietlInformacje());

        lew.wyswietlKolorFutra();
        wrobel.wyswietlRozmiarSkrzydel();
        krokodyl.wyswietlDlugoscCiala();


    }
}
