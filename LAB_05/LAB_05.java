import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LAB_05 {
    public static void main(String[] args) {

        //Zadanie 1.
        Rectangle exampleRec = new Rectangle(3, 6);
        System.out.println(exampleRec.getArea());
        System.out.println(exampleRec.getCircOfRec());
        System.out.println(exampleRec.getDiagonal());
        //Zadanie 2.
        Building[] buildings = new Building[3];
        buildings[0] = new Building("Skyscraper", "2019-06-12", 90);
        buildings[1] = new Building("High-rise building", "2015-12-21", 40);
        buildings[2] = new Building("Middle-rise building", "2011-09-11", 9);
        for (Building e : buildings) {
            e.getInfo();
            e.howOld();
        }
        //Zadanie 3.
        Species human = new Species("Human", "Homo sapiens",
                21, "XX", "default");
        human.getInfo();
        human.getName();
        human.getHaploid();
        Species human2 = human.copySpecies();
        human2.getInfo();
    }
}

class Rectangle {
    private double height = 0, width = 0;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return (height * width);
    }

    public double getCircOfRec() {
        return (2 * (height + width));
    }

    public double getDiagonal() {
        return Math.sqrt((height * height + width * width));
    }
}

class Building {
    private String name;
    private LocalDate year;
    private int floors;

    Building(String name, String year, int floors) {
        this.name = name;
        this.year = LocalDate.parse(year);
        this.floors = floors;
    }

    public void getInfo() {
        System.out.println("Nazwa budynku: " + name + "\n" + "Rok budowy: "
                + year.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))
                + "\n" + "Liczba pięter: " + floors);
    }

    public void howOld() {
        System.out.println("Wiek budynku: " + (Period.between(year, LocalDate.now()).getYears()));
    }
}

class Species {
    private String speciesName, genusName, desc, chromX;
    private int chrom2N;

    Species(String speciesName, String genusName, int chrom2N, String chromX, String desc) {
        this.speciesName = speciesName;
        this.genusName = genusName;
        this.chrom2N = chrom2N;
        this.chromX = chromX;
        this.desc = desc;
    }

    public void getInfo() {
        System.out.println("Rodzaj: " + speciesName + "\n" + "Gatunek: " + genusName
                + "\n" + "Liczba chromosomów 2n: " + chrom2N
                + "\n" + "Liczba chromosomów x: " + chromX);
    }

    public void getName() {
        System.out.println("Pełna nazwa: " + speciesName + ", " + genusName);
    }

    public double getHaploid() {
        return (double) chrom2N / 2;
    }

    public Species copySpecies(){
        return new Species(speciesName, genusName, chrom2N, chromX, desc);
    }
}