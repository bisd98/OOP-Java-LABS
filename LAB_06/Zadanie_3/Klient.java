package Zadanie_3;

import java.util.ArrayList;

public class Klient {

    String imie;
    String nazwisko;
    ArrayList<Ksiazka> wypozyczoneKsiazki = new ArrayList<>();

    Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    String opis(){
        return getImie() + " " + getNazwisko();
    }
}
