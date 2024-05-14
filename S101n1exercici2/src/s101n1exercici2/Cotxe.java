package s101n1exercici2;

public class Cotxe {
	
	// ATRIBUTS
	
	private static final String MARCA = "Seat"; // Al ser "static final" s'ha d'inicialitzar directament o en un bloc estàtic
	                                             // És una constant a nivell de classe: totes les instancies comparteixen el mateix valor, i aquest no és pot canviar
	
	private static String model = "Ibiza"; // Tots els objectes tenen el mateix valor en aquest atribut, PERÒ, si un objecte canvia el valor, aquest canviarà per A TOTS
	
	private final int POTENCIA; // Els camps "final" han d'inicialitzar-se en la seva declaració o EN EL CONSTRUCTOR de la classe. No es poden modificat
	
	// CONSTRUCTOR
	
	public Cotxe(int potencia) {
		this.POTENCIA = potencia;
	}
	
	// GETTERS & SETTERS

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return MARCA;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}
	
	// MÈTODES
	
	public static void frenar() {         // Puc cridar aquest mètode encara que no sigui un objecte cotxo o no se n'hagi instanciat cap.
		System.out.println("El vehicle està frenant");
	}
	
	public void accelerar() { 
		System.out.println("El vehicle està accelerant");
	}

	@Override
	public String toString() {
		return "Marca: " + MARCA + ", Model: " + model + ", Potencia: " + POTENCIA;
	}

}
