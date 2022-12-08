package Zadanie_1;

public class Prostokat extends Figura {
    double wys = 0, szer = 0;

    Prostokat() {
    }

    Prostokat(double wys, double szer) {
        this.wys = wys;
        this.szer = szer;
    }

    Prostokat(float wys, float szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    void przesun(float x, float y) {
        this.punkt.przesun((int) x, (int) y);
    }

    String opis() {
        return "Klasa Porstokat." + "\n"
                + "Wysokość: " + wys + ", szerokość: " + szer + "\n"
                + "Kolor obiektu: " + kolor;
    }
}
