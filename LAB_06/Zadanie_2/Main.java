package Zadanie_2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        SamochodOsobowy sam = new SamochodOsobowy("BMW", "M3", "Sedan", "Atlantis Blue",
                "2022-06-26", 17000, 1705, 2993, 5);

        Samochod sam1 = new Samochod("BMW", "M2", "Coupe", "Sunset Orange",
                "2022-02-20", 15000);
        Samochod sam2 = new Samochod("BMW", "M4", "Coupe", "Aventurine Red",
                "2022-01-12", 14000);

        System.out.println(sam.opis());
        System.out.println(sam1.opis());
        System.out.println(sam2.opis());
    }
}
