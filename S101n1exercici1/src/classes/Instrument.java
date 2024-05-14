package classes;

public abstract class Instrument {
	
	// ATRIBUTS
	
	protected String nom;
	protected double preu;
	
	// CONSTRUCTOR(S)
	
	public Instrument() {
		
	}
	
	public Instrument(String nom, double preu) {
		this.nom  = nom;
		this.preu = preu;
	}
	
	// MÈTODES
	
	public abstract void tocar();
	
	// BLOC ESTÀTIC per indicar quan es carrega la classe Instrument + declaració d'una constant estàtica per poder comprovar-ho
	
	public static int comprovacio = 10;
	
	static {
		System.out.println("La classe instrument d'està carregant...");
	}
	
	/*
	 * EXPLICACIÓ: el missatge del static només es mostrarà la primera vegada que es carregui la classe Instrument, ja sigui pq instanciem per primera vegada aquesta
	 *             classe o per l'accés a un camp static.
	 *             Això es pq el bloc estàtic s'executa quan es carrega una classe, no quan es crea una instància.
	 */
}
