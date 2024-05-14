package Classes;

public class Smartphone extends Telefon implements InterficieCamera, Rellotge {

	// CONSTRUCTOR
	
	public Smartphone(String marca, String model) {
		super(marca, model);
	}
	
	// MÈTODES 
	
	public void fotografiar() {
		System.out.println("S'està fent una foto");
	}
	
	public void alarma() {
		System.out.println("Està sonant l'alarma");
	}

	@Override
	public String toString() {
		return "Smartphone [Marca=" + marca + ", Model=" + model + "]";
	}

}
