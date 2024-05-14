package classes;

public class Percusio extends Instrument {

	// CONSTRUCTOR
	
	public Percusio(String nom, double preu) {
		super(nom, preu);
	}

	// MÈTODES

	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");
	}
}
