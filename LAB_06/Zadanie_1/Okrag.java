package Zadanie_1;

public class Okrag extends Figura {
    Punkt srodek_okregu;
    double promien;

    Okrag() {
        srodek_okregu = new Punkt(0, 0);
        promien = 0;
    }

    Okrag(Punkt srodek_okregu, double promien) {
        this.srodek_okregu = srodek_okregu;
        this.promien = promien;
    }

    public double getPowierzchnia() {
        return Math.PI * (promien * promien);
    }

    public double getSrednica() {
        return promien * 2;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public boolean wSrodku(Punkt p) {
        return (p.x - srodek_okregu.x) * (p.x - srodek_okregu.x) + (p.y - srodek_okregu.y) * (p.y - srodek_okregu.y) <= (promien * promien);
    }

    String opis() {
        return "Klasa Okrąg." + "\n" + "Srodek okregu: " + srodek_okregu.opis() + "\n" + "Promień: " + promien;
    }
}
