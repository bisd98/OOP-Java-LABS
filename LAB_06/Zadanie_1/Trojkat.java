package Zadanie_1;

public class Trojkat extends Figura {
    double wys = 0, podst = 0;

    Trojkat(double wys, double podst) {
        this.wys = wys;
        this.podst = podst;
    }

    Trojkat(float wys, float podst, String kolor) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    String opis() {
        return "Klasa Trójkąt." + "\n"
                + "Wysokość: " + wys + ", podstawa: " + podst + "\n"
                + "Kolor obiektu: " + kolor;
    }
}
