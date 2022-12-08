package Zadanie_3;

import java.time.LocalDate;

public class Ksiazka {

    String nazwa;
    String autor;
    LocalDate rokWydania;

    Ksiazka(String nazwa, String autor, String rokWydania) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.rokWydania = LocalDate.parse(rokWydania);
    }

    String opis() {
        return "Nazwa: " + nazwa + "\n"
                + "Autor: " + autor + "\n"
                + "Rok wydania: " + rokWydania + "\n";
    }
}
