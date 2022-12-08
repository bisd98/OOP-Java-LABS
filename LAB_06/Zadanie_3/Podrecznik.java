package Zadanie_3;

public class Podrecznik extends Ksiazka {

    String przedmiot;

    Podrecznik(String nazwa, String autor, String rokWydania, String przedmiot) {
        super(nazwa, autor, rokWydania);
        this.przedmiot = przedmiot;
    }

    String opis() {
        return super.opis() + "Przedmiot: " + przedmiot + "\n";
    }
}
