package s101n1exercici2;

public class S101n1exercici2 {

	public static void main(String[] args) {
		
		// Comprovem que els tres objectes tenen el mateix atribut MARCA i MODEL, ja que són STATIC
		
		Cotxe cotxe1 = new Cotxe(150);
		Cotxe cotxe2 = new Cotxe(90);
		Cotxe cotxe3 = new Cotxe(110);
		
		System.out.println(cotxe1.toString());
		System.out.println(cotxe2.toString());
		System.out.println(cotxe3.toString());

		// Si canviem el valor del model al cotxe1, aquest canvi afectara a tots els objectes
		
		cotxe1.setModel("Leon");
		
		System.out.println(cotxe1.toString());
		System.out.println(cotxe2.toString());
		System.out.println(cotxe3.toString());
		
		// Mètodes estàtic i no estàtic
		
		Cotxe.frenar();     // Tot i no haver especificat cap cotxe en concret, puc cridar el mètode i aquest em retorna el seu valor
		
		cotxe3.accelerar(); // En aquest cas necessito especificar un objecte Cotxe concret per poder cridar el mètode
	}

}
