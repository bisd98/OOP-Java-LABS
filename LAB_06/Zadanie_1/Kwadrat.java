package Zadanie_1;

public class Kwadrat extends Prostokat{

    Kwadrat(double wys){
        this.wys = wys;
    }
    void setWys(double wys){
        this.wys = wys;
    }

    void setSzer(double szer){
        this.szer = szer;
    }
    @Override
    double getPowierzchnia() {
        return super.getPowierzchnia();
    }

    @Override
    String getKolor() {
        return super.getKolor();
    }
}
