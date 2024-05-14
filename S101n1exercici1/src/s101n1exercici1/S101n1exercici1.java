package s101n1exercici1;

import classes.Corda;
import classes.Instrument;
import classes.Percusio;
import classes.Vent;

public class S101n1exercici1 {

	public static void main(String[] args) {
		
		// COMPROVACIO 1: en aquest cas la càrrega de la classe es donarà pq accedim al membre estàtic de la calsse Instrument
		
		Instrument.comprovacio++;
		
		System.out.println(Instrument.comprovacio);
		
		// COMPROVACIÓ 2: en aquest cas la càrrega es donarà abans d'instanciar el primer objecte, en aquest cas una flauta, i al instanciar els altres objectes veurem
		//                que el missatge de carregant instrument ja no surt més, pq ja s'ha carregat amb el primer

		Vent flute = new Vent("Flauta Travessera", 150);
		Corda violin = new Corda("Guitarra", 400);
		Percusio drum = new Percusio("Bateria", 1000);
		
		flute.tocar();
		violin.tocar();
		drum.tocar();
	}

}
