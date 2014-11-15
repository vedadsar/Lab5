package com.zvedad.lab5;

import java.util.Scanner;
/** program trazi od nas da unesemo vrijednost jedne stranice a zatim izracunava
 * povrsinu i obim kvadrata/kruga te zapreminu valjka. Visina valjka je random broj
 * 
 * @author Vedad
 *
 */
public class Input {
	public static void main(String[] args) {

		int stranica;
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite broj ");
		stranica = in.nextInt();

		int povrsinaKvadrata = stranica * stranica;
		int obimKvadrata = 4 * stranica;
		double povrsinaKruga = stranica * stranica * Math.PI;
		double obimKruga = 2 * Math.PI * stranica;
		int odnos = (int) (povrsinaKruga / povrsinaKvadrata);
		double valjakMin = 0.37;
		double valjakMax = 37.7;
		double visinaValjka = (double) (valjakMin + Math.random()
				* (valjakMax - valjakMin + 1));
		int zapreminaValjka = (int) (visinaValjka * povrsinaKruga);

		System.out.println("Povrsina kvadrata je " + povrsinaKvadrata
				+ " a njegov obim je " + obimKvadrata);
		System.out.println("Povrsina kruga je " + povrsinaKruga
				+ " a njegov obim je " + obimKruga);
		System.out.println("Kvadrat moze stati u krug " + odnos + " puta");
		System.out.println("Zapremina valjka iznosi " + zapreminaValjka
				+ " pri visini od " + visinaValjka);

	}
}
