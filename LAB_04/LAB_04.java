import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class LAB_04 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Zadanie 1.
        sumMean(getArray());
        //Zadanie 2.
        double[] tab1 = {1, 2, 3, 4, 5, 6, 76, 8, 9, 10};
        double[] tab2 = {1, 2, 3, 4, 5, 6, 76, 8, 9};
        jumpEven(tab1);
        jumpEven(tab2);
        //Zadanie 3.
        String[] words_x = {"ala", "ma", "kota"};
        toUpper(words_x);
        //Zadanie 4.
        backW();
        //Zadanie 5.
        sortInt();
        //Zadanie 6.
        factorial();
        //Zadanie 7.
        String[] strArray1 = {"One", "Two", "Three"};
        String[] strArray2 = {"One", "Two", "Three"};
        compareStrArr(strArray1, strArray2);

    }

    public static double[] getArray() {
        int total;
        double min, max;
        System.out.println("Ile elementów chcesz wylosować?: ");
        total = scanner.nextInt();
        double[] arr = new double[total];
        System.out.println("Wpisz dolną granicę zakresu losowania: ");
        min = scanner.nextDouble();
        System.out.println("Wpisz górną granicę zakresu losowania: ");
        max = scanner.nextDouble();
        for (int i = 0; i < total; i++) {
            arr[i] = (Math.random() * (max - min)) + min;
        }
        return arr;
    }

    public static void sumMean(double[] tab_x) {
        double sum = 0;
        double sum2 = 0;

        for (int i = 0; i < tab_x.length; i++) {
            sum += tab_x[i];
        }

        for (double v : tab_x) {
            sum2 += v;
        }

        System.out.println("Suma elementów to: " + sum);
        System.out.println("Suma elementów (for eac) hto: " + sum);
        System.out.println("Średnia elementów to: " + (sum / tab_x.length));
    }

    public static void jumpEven(double[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 != 0) {
                System.out.println(tab[i]);
            }
        }
    }

    public static void toUpper(String[] words_x) {
        for (String j : words_x) {
            System.out.println(j.toUpperCase());
        }
    }

    public static void backW() {
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Wpisz " + (i + 1) + ". słowo: ");
            words[i] = scanner.next();
        }
        for (int i = words.length - 1; i >= 0; i--) {
            StringBuilder word = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) {
                word.append(words[i].charAt(j));
            }
            System.out.println(word);
        }
    }

    public static void sortInt() {
        int[] intArr = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Wpisz " + (i + 1) + ". liczbę: ");
            intArr[i] = scanner.nextInt();
        }
        for (int i = intArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j + 1];
                    intArr[j + 1] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }

    public static void factorial() {
        int[] intArr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Wpisz " + (i + 1) + ". liczbę: ");
            intArr[i] = scanner.nextInt();
        }

        for (int n : intArr) {
            int result = 1;
            if (n == 0) {
                System.out.println("0!= " + 1);
            } else {
                for (int i = 1; i <= n; i++) {
                    result *= i;
                }
                System.out.println(n + "!= " + result);
            }

        }
    }

    public static void compareStrArr(String[] first, String[] second) {
        if (first.length == second.length) {
            boolean flag = true;
            for (int i = 0; i < first.length; i++) {
                if (!Objects.equals(first[i], second[i])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Tablice są jednakowe");
            } else {
                System.out.println("Tablice nie są jednakowe");
            }
        } else {
            System.out.println("Tablice nie są jednakowe");
        }

    }

}