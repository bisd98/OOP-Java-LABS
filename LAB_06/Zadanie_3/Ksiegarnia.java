package Zadanie_3;

import java.util.ArrayList;

import static Zadanie_3.Main.scanner;

public class Ksiegarnia {

    ArrayList<Ksiazka> zasoby = new ArrayList<>();
    ArrayList<Ksiazka> wypozyczone = new ArrayList<>();
    ArrayList<Klient> klienci = new ArrayList<>();


    Ksiegarnia() {
    }

    void dodajKsiazke(Ksiazka book) {
        zasoby.add(book);
    }

    void sprawdzZasoby() {
        int i = 0;
        for (Ksiazka n : zasoby) {
            System.out.println(i + ". " + n.nazwa);
            i++;
        }
    }

    void sprawdzWypozyczone() {
        int i = 0;
        for (Ksiazka n : wypozyczone) {
            System.out.println(i + ". " + n.nazwa);
            i++;
        }
    }

    void sprawdzKlientow() {
        int i = 0;
        for (Klient n : klienci) {
            System.out.println(i + ". " + n.opis());
            i++;
        }
    }

    void pozyczKsiazke(Klient klient) {
        System.out.println("Podaj pozycję książki: ");
        int index = scanner.nextInt();
        wypozyczone.add(zasoby.get(index));
        klient.wypozyczoneKsiazki.add(zasoby.get(index));
        zasoby.remove(index);
    }

    void oddajKsiazke(Klient klient) {
        System.out.println("Książki wypożyczone przez klienta: ");
        int i = 0;
        for(Ksiazka n:klient.wypozyczoneKsiazki){
            System.out.println(i + ". " + n.nazwa);
        }
        System.out.println("Podaj pozycję książki: ");
        int index = scanner.nextInt();
        zasoby.add(klient.wypozyczoneKsiazki.get(index));
        klient.wypozyczoneKsiazki.remove(index);
        wypozyczone.remove(index);
    }
}
