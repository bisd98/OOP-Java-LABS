import java.util.Scanner;

public class LAB_02 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Zadanie 1.
        quadFunction();
        //Zadanie 2.
        threeFunc();
        //Zadanie 3.
        sortThreeNumbers();
        //Zadanie 4.
        roadToAcademy();
        //Zadanie 5.
        buyCar();
        //Zadanie 6.
        equations();
    }

    public static void quadFunction() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        char bSign = '+';
        char cSign = '+';
        if (b < 0) {
            bSign = '-';
        }
        if (c < 0) {
            cSign = '-';
        }
        System.out.println("Twoja funckja to: " + a + "x^2" + bSign + b + 'x' + cSign + c);
        double delta = b * b - 4 * a * c;
        if (delta > 0 && a != 0) {
            double x_1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x_2 = (-b - Math.sqrt(delta)) / 2 * a;
            if (a > 0) {
                System.out.println("Wynik: x= <" + String.format("%.2f", x_1) + "; " +
                        String.format("%.2f", x_2) + ">");
            } else {
                System.out.println("Wynik: x= (-∞; " + String.format("%.2f", x_1) +
                        "> ∪ <" + String.format("%.2f", x_2) + "; ∞)");
            }
        } else if (delta == 0 && a != 0) {
            double x_0 = -b / (2 * a);
            System.out.println("Wynik: x= " + x_0);
        } else {
            System.out.println("Brak pierwiastków");
        }
    }

    public static void threeFunc() {
        double aResult;
        double bResult;
        double cResult;
        double x = scanner.nextDouble();
        if (x > 0) {
            aResult = 2 * x;
        } else if (x == 0) {
            aResult = 0;
        } else {
            aResult = -3 * x;
        }
        System.out.println("Wartość dla a(x)= " + aResult);

        if (x >= 1) {
            bResult = x * x;
        } else {
            bResult = x;
        }
        System.out.println("Wartość dla b(x)= " + bResult);

        if (x > 2) {
            cResult = 2 + x;
        } else if (x == 2) {
            cResult = 8;
        } else {
            cResult = x - 4;
        }
        System.out.println("Wartość dla c(x)= " + cResult);
    }

    public static void sortThreeNumbers() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double[] numbers = {a, b, c};
        int i = 0;
        for (int n = 0; n < 2; n++) {
            while (i < 2) {
                if (numbers[i] > numbers[i + 1]) {
                    double extra = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = extra;
                }
                i++;
            }
            i = 0;
        }
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
    }

    public static void roadToAcademy() {
        System.out.print("\nCzy pada deszcz?(T/N): ");
        char rain = scanner.next().charAt(0);
        System.out.print("Czy jest autobus?(T/N): ");
        char bus = scanner.next().charAt(0);
        if (rain == 'T' && bus == 'T') {
            System.out.println("Weź parasol, dostaniesz się na uczelnie.");
        } else if (rain == 'T' && bus != 'T') {
            System.out.println("Nie dostaniesz się na uczelnię.");
        } else if (rain != 'T' && bus == 'T') {
            System.out.println("Dostaniesz się na uczelnie, miłego dnia i pięknej pogody.");
        } else {
            System.out.println("Dobra pogoda na spacer, miłej przechadzki na uczelnię.");
        }
    }

    public static void buyCar() {
        System.out.print("\nCzy jest zniżka na auto?(T/N): ");
        char discount = scanner.next().charAt(0);
        System.out.print("Czy otrzymałeś podwyżkę?(T/N): ");
        char rise = scanner.next().charAt(0);
        if (discount != 'T' || rise == 'T') {
            System.out.println("Możesz kupić samochód, zniżki na samochód nie ma.");
        } else if (discount != 'T' || rise != 'T') {
            System.out.println("Zakup samochód trzeba odłożyć na później..., zniżki na samochód nie ma.");
        } else if (discount == 'T' || rise == 'T') {
            System.out.println("Możesz kupić samochód !");
        } else {
            System.out.println("Jest zniżka na samochód, ale nie ma kasy ;/.");
        }
    }

    public static void equations(){
        System.out.println("\nWybierz opcje:");
        System.out.println("1. dodawanie\n2. odejmowanie\n3. iloczyn\n4. iloraz\nWybór: ");
        int choice = scanner.nextInt();
        System.out.println("Wpisz wartość pierwszej liczby: ");
        double a = scanner.nextDouble();
        System.out.println("Wpisz wartość drugiej liczby: ");
        double b = scanner.nextDouble();
        switch(choice){
            case 1:
                System.out.println("Suma: " + (a + b));
                break;
            case 2:
                System.out.println("Różnica: " + (a - b));
                break;
            case 3:
                System.out.println("Iloczyn: " + (a * b));
                break;
            case 4:
                System.out.println("Iloraz: " + (a / b));
                break;
        }
    }

}
