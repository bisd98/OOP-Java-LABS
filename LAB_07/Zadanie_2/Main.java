package Zadanie_2;

public class Main {
    public static void main(String[] args) {
        Ryba rb = new Ryba();
        rb.nazwa = "Wieloryb";
        System.out.println(rb.wynurz());
        System.out.println(rb.zanurz());
        System.out.println(rb.plyn());
        System.out.println(rb.jedz());
        System.out.println(rb.wydalaj());
    }
}
