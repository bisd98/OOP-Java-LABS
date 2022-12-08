package Zadanie_3;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Ksiegarnia lib = new Ksiegarnia();
        while (true) {
            int wybor = -1;
            System.out.println("\nWybierz opcje: \n" +
                    "1. Dodaj klienta, \n" +
                    "2. Dodaj książkę, \n" +
                    "3. Wyświetl klientow, \n" +
                    "4. Wyświetl zasoby, \n" +
                    "5. Wypożycz książkę, \n" +
                    "6. Oddaj książkę, \n" +
                    "7. Wyświetl wypożyczone, \n" +
                    "0. Wyjdź.");
            wybor = scanner.nextInt();
            if (wybor == 1) {
                System.out.println("Wpisz imię oraz nazwisko: ");
                lib.klienci.add(new Klient(scanner.next(), scanner.next()));
            } else if (wybor == 2) {
                System.out.println("Wybierz rodzaj: \n" +
                        "1. Powieść, \n" +
                        "2. Podręcznik \n" +
                        "3. Inna. \n");
                int rodzaj = scanner.nextInt();
                if (rodzaj == 1) {
                    System.out.println("Wpisz nazwę(nazwa_dalej), autora(imie_nazwisko), rok wydania(YYYY-MM-DD) oraz gatunek(gatunek_dalej): ");
                    lib.dodajKsiazke(new Powiesc(scanner.next(), scanner.next(), scanner.next(), scanner.next()));
                } else if (rodzaj == 2) {
                    System.out.println("Wpisz nazwę(nazwa_dalej), autora(imie_nazwisko), rok wydania(YYYY-MM-DD) oraz przedmiot(przedmiot_dalej): ");
                    lib.dodajKsiazke(new Podrecznik(scanner.next(), scanner.next(), scanner.next(), scanner.next()));
                } else if (rodzaj == 3) {
                    System.out.println("Wpisz nazwę(nazwa_dalej), autora(imie_nazwisko) oraz rok wydania(YYYY-MM-DD): ");
                    lib.dodajKsiazke(new Ksiazka(scanner.next(), scanner.next(), scanner.next()));
                }
                lib.sprawdzKlientow();
            } else if (wybor == 3) {
                System.out.println("Lista klientów: ");
                lib.sprawdzKlientow();
            } else if (wybor == 4) {
                System.out.println("Zasoby: ");
                lib.sprawdzZasoby();
            } else if (wybor == 5) {
                System.out.println("Ktory klient z listy wypozycza?: ");
                int indexKlienta = scanner.nextInt();
                lib.pozyczKsiazke(lib.klienci.get(indexKlienta));
            } else if (wybor == 6) {
                System.out.println("Ktory klient z listy oddaje?: ");
                int indexKlienta = scanner.nextInt();
                lib.oddajKsiazke(lib.klienci.get(indexKlienta));
            } else if (wybor == 7) {
                System.out.println("Wypozyczone: ");
                lib.sprawdzWypozyczone();
            } else if (wybor == 0) {
                break;
            } else {
                System.out.println("Zły wybór, spróbuj ponownie");
                continue;
            }
        }
    }
}
