package Zadanie_3;

public class Powiesc extends Ksiazka {

    String gatunek;

    Powiesc(String nazwa, String autor, String rokWydania, String gatunek) {
        super(nazwa, autor, rokWydania);
        this.gatunek = gatunek;
    }

    String opis() {
        return super.opis() + "Gatunek: " + gatunek + "\n";
    }
}
