package classes;

public class Vent extends Instrument {

	// CONSTRUCTOR

	public Vent(String nom, double preu) {
		super(nom, preu);
	}

	// MÈTODES

	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
	}
}
