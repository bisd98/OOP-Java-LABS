package Zadanie_3;

class Main {
    public static void main(String[] arg) {
        Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
        Trojkat rownoboczny = new Trojkat(7, 4, "biały");
        Punkt pkt1 = new Punkt(3, 4);
        Kwadrat kw1 = new Kwadrat(3, "zielony");


        System.out.println(maly_punkt.opis());
        System.out.println(rownoboczny.opis());
        //Figura fig1 = new Figura("��ty");


        Figura[] tablicaFigur = new Figura[10];
        for (int i = 0; i < tablicaFigur.length; i++) {
            if (i < 5) {
                tablicaFigur[i] = new Prostokat(5, 3, "niebieski");
            } else {
                tablicaFigur[i] = new Trojkat(2, 5, "czerwony");
            }
        }

        for (Figura x : tablicaFigur) {
            x.opis();
        }

        IFigury[] tabIFigury = new IFigury[3];
        tabIFigury[0] = new Prostokat(2, 3, "fioletowy");
        tabIFigury[1] = new Kwadrat(2, "zielony");
        tabIFigury[2] = new Trojkat(5, 4, "bordowy");

        for (IFigury n:tabIFigury){
            System.out.println("Dla " + n.opis() + ":");
            System.out.println("Powierzchnia: " + n.getPowierzchnia());
            System.out.println("W polu: " + n.wPolu(new Punkt(1, 1)));
        }

        Okrag okr = new Okrag(new Punkt(1,1), 5);
        System.out.println(okr.opis());
        okr.przesun(2,3);
        System.out.println(okr.opis());
    }
}