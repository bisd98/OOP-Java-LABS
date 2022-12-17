package Zadanie_3;

public class Okrag extends Figura implements RuchFigury{

    int promien;

    Okrag(Punkt punkt, int promien){
        this.punkt = punkt;
        this.promien = promien;
    }
    @Override
    String opis() {
        return "Środek:\nx: " + punkt.x + "\ny: " + punkt.y +"\npromień: " + promien;
    }

    @Override
    void skaluj(float skala) {

    }

    @Override
    public void przesun(int x, int y) {
        punkt.x += x;
        punkt.y += y;
    }
}
