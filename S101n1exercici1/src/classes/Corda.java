package classes;

public class Corda extends Instrument {

	// CONSTRUCTOR

	public Corda(String nom, double preu) {
		super(nom, preu);
	}

	// MÈTODES

	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
	}
}
