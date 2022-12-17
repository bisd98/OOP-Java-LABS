package Zadanie_2;

public class Ryba extends Zwierze implements Plywanie{

    String jedz(){
        return nazwa + " je";
    }

    String wydalaj(){
        return nazwa + " wydala";
    }

    @Override
    public String plyn() {
        return nazwa + " plynie";
    }

    @Override
    public String wynurz() {
        return nazwa + " wynurza";
    }

    @Override
    public String zanurz() {
        return nazwa + " zanurza";
    }
}
