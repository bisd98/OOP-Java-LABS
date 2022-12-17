package Zadanie_3;

class Trojkat extends Figura implements IFigury{
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst,String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	public String opis(){
		return "Trojkat o wymairach: "+wys+" x "+podst;
	}
	public void skaluj(float skala){
		wys = wys * (int)skala;
		podst = podst * (int)skala;
	}

	@Override
	public float getPowierzchnia() {
		return 0;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}