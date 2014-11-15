package com.zvedad.lab5;

/**Program izracunava povrsinu i obim kruga/kvadrata te zapreminu valjka.
 * Visina valjka je random broj. 
 * @author Vedad
 *
 */
public class PovrsinaObimZapremina {
	public static void main(String[] args) {
		int stranica = 5;
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
