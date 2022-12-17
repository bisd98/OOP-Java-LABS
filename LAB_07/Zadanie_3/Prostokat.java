package Zadanie_3;

class Prostokat extends Figura implements IFigury {
    int wys = 0;
    int szer = 0;

    Prostokat(int wys, int szer, String kolor) {
        this.wys = wys;
        this.szer = szer;
        super.kolor = kolor;
    }

    public String opis() {
        return "Prostokat o wymairach: " + szer + " x " + wys;
    }

    public void skaluj(float skala) {
        wys = wys * (int) skala;
        szer = szer * (int) skala;
    }

    @Override
    public float getPowierzchnia() {
        return wys * szer;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }
}