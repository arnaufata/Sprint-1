package s101n2exercici1;

import java.util.Scanner;

import Classes.Smartphone;

public class S101n2exercici1 {

	public static void main(String[] args) {
		
		Scanner teclat = new Scanner(System.in);
		
		Smartphone mobil = new Smartphone("Xaomi", "Redmi 10");
		System.out.println(mobil.toString());
		
		System.out.println("Introdueixi el número de telèfon al que vol trucar: ");
		int numTelf = teclat.nextInt();
		mobil.trucar(numTelf);
		
		mobil.fotografiar();
		mobil.alarma();

	}

}
