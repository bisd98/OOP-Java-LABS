import java.util.Arrays;
import java.util.Scanner;

public class LAB_01 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Zadanie 1.
        System.out.println(getName());
        System.out.println(getAge());
        //Zadanie 2.
        simpleEquations(scanner.nextDouble(), scanner.nextDouble());
        //Zadanie 3.
        System.out.println(checkEven(scanner.nextDouble()));
        //Zadanie 4.
        System.out.println(checkMod3and5(scanner.nextDouble()));
        //Zadanie 5.
        System.out.println(cubeNumber(scanner.nextDouble()));
        //Zadanie 6.
        System.out.println(sqrtNumber(scanner.nextDouble()));
        //Zadanie 7.
        System.out.println(randNumbers(scanner.nextDouble(), scanner.nextDouble()));
    }

    public static String getName() {
        return "Dawid";
    }

    public static Integer getAge() {
        return 23;
    }

    public static void simpleEquations(double a, double b) {
        System.out.println("suma: " + (a + b) + "\nroznica: "
                + (a - b) + "\niloczyn: " + (a * b) + "\niloraz: " + (a / b));
    }

    public static boolean checkEven(double n) {
        return n % 2 == 0;
    }

    public static boolean checkMod3and5(double n) {
        return (n % 3 == 0 && n % 5 == 0);
    }

    public static double cubeNumber(double n) {
        return (n * n * n);
    }

    public static double sqrtNumber(double n) {
        return Math.sqrt(n);
    }

    public static boolean randNumbers(double a, double b) {
        double[] numbers = new double[3];
        for (int i = 0; i < 3; i++) {
            double any_nr = Math.random() * b + a;
            numbers[i] = (int) (any_nr);
        }
        return possibleTriangle(numbers);
    }

    public static boolean possibleTriangle(double[] a) {
        Arrays.sort(a);
        return (a[0] + a[1]) < a[2];
    }
}
