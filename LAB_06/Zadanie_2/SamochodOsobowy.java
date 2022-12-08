package Zadanie_2;

import java.time.LocalDate;

public class SamochodOsobowy extends Samochod{
    double waga;
    double pojemnosc;
    int miejsca;

    SamochodOsobowy(String marka, String model, String nadwozie, String kolor, String rokProdukcji, int przebieg,
                    double waga, double pojemnosc, int miejsca){
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnosc = pojemnosc;
        this.miejsca = miejsca;
    }

    String opis(){
        return super.opis() + "Waga: " + waga + "\n"
                + "Pojemność: " + pojemnosc + "\n"
                + "Miejsca: " + miejsca + "\n";
    }

}
