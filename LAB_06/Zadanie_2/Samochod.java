package Zadanie_2;

import java.time.LocalDate;

public class Samochod {
    String marka;
    String model;
    String nadwozie;
    String kolor;
    LocalDate rokProdukcji;
    int przebieg;

    Samochod(String marka, String model, String nadwozie, String kolor, String rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = LocalDate.parse(rokProdukcji);
        this.przebieg = przebieg;
    }

    String opis() {
        return "Marka: " + marka + "\n"
                + "Model: " + model + "\n"
                + "Nadwozie: " + nadwozie + "\n"
                + "Kolor: " + kolor + "\n"
                + "Rok produkcji: " + rokProdukcji + "\n"
                + "Przebieg: " + przebieg + "\n";
    }

}
