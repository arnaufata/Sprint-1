package Classes;

public class Telefon {

	// ATRIBUTS

	protected String marca;
	protected String model;

	// CONSTRUCTOR

	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	// GETTERS & SETTERS

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// MÈTODES

	public void trucar(int numTelf) {
		System.out.println("S'està trucant al número de telèfon " + numTelf);
	}
}
