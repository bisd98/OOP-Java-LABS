package Zadanie_1;

public class Main {
    public static void main(String[] args) {
        Punkt pkt1 = new Punkt();
        Punkt pkt2 = new Punkt(1, 1);
        Punkt pkt3 = new Punkt(1, 2);

        System.out.println(pkt1.getX());
        System.out.println(pkt1.getY());
        pkt1.setX(2);
        pkt1.setY(4);
        System.out.println(pkt1.opis());
        System.out.println(pkt2.opis());
        pkt2.zeruj();
        System.out.println(pkt2.opis());
        pkt2.przesun(1, 3);
        System.out.println(pkt2.opis());

        Figura fig1 = new Figura();
        System.out.println(fig1.getKolor());
        fig1.opis();

        Prostokat pr1 = new Prostokat(2, 4);
        System.out.println(pr1.getPowierzchnia());

        Trojkat tr1 = new Trojkat(1, 3);

        pr1.przesun(3, 5);

        Kwadrat kw1 = new Kwadrat(3);

        System.out.println(pr1.opis());
        System.out.println(tr1.opis());
        System.out.println(kw1.opis());

        Okrag okr1 = new Okrag(new Punkt(2, 4), 5);
        System.out.println(okr1.opis());
        System.out.println(okr1.getPowierzchnia());
        System.out.println(okr1.wSrodku(new Punkt(3, 3)));

    }
}