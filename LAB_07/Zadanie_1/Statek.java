package Zadanie_1;

public class Statek implements Plyn{

    String statek = "Oro Jackson";

    public String getStatek() {
        return statek;
    }

    public void plyn() {
        System.out.println(statek + " płynie");
    }
}
