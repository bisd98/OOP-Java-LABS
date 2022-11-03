import java.util.Random;
import java.util.Scanner;

public class LAB_03 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Zadanie 1.
        meanPoints();
        //Zadanie 2.
        statsNegative();
        //Zadanie 3.
        int[] example_arr = {2, 4, 5, 8, 9, 10};
        sumEvenArray(example_arr);
        //Zadanie 4.
        randomEvenArray();
        //Zadanie 5.
        System.out.println(palindrome());
    }

    public static void meanPoints() {
        double points;
        double sum = 0;
        System.out.println("Podaj liczbe studentow w grupie: ");
        int students = scanner.nextInt();
        if (students > 0) {
            for (int i = 1; i <= students; i++) {
                System.out.println("Podaj liczbę punktów " + i + ". studenta: ");
                points = scanner.nextDouble();
                sum += points;
            }
            System.out.println("Średnia liczba punktów: " + (sum / students));

        } else System.out.println("W grupie musi byc conajmniej 1 odoba!");
    }

    public static void statsNegative() {
        double sum = 0;
        int amount = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nWpisz " + i + ". liczbę: ");
            double number = scanner.nextDouble();
            if (number < 0) {
                sum += number;
                amount++;
            }
        }
        System.out.println("Ilość liczb ujemnych: " + amount);
        System.out.println("Średnia liczb ujemnych: " + (sum / amount));
    }

    public static void sumEvenArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println("\nSuma liczb parzystych ciągu wynosi: " + sum);
    }

    public static void randomEvenArray() {
        System.out.println("\nWprowadź ilość liczb losowanych: ");
        int n = scanner.nextInt();
        Random rand = new Random();
        int[] rand_array = new int[n];
        for (int i = 0; i < n; i++) {
            rand_array[i] = rand.nextInt(56) - 10;
        }
        sumEvenArray(rand_array);
    }

    public static String palindrome() {
        System.out.println("\nWprowadź wyraz: ");
        String word = scanner.next();
        for (int i = 0; i < (int) (word.length() / 2); i++) {
            if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length() - 1 - i)) {
                return "Słowo " + word + " nie jest palindromem.";
            }
        }
        return "Słowo \"" + word + "\" jest palindromem.";
    }
}