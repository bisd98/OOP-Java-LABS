package Zadanie_1;

public class Punkt {
    public int x, y;

    public Punkt() {
        x = 0;
        y = 0;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void zeruj() {
        x = 0;
        y = 0;
    }

    String opis() {
        return "x: " + x + ", y: " + y;
    }

    public void przesun(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

