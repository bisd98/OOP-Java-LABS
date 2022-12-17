package Zadanie_2;

public class Ptak extends Zwierze implements Latanie{

    @Override
    public String lec() {
        return nazwa + " leci";
    }

    @Override
    public String wyladuj() {
        return nazwa + " laduje";
    }
}
