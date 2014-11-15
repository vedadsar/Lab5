package com.zvedad.lab5;

/**Program izracunava ukupan dug koji ce biti vracen
 *  na osnovu promjenjive kamate i poznate glavnice.
 * @author Vedad
 *
 */
public class Kredit {
	public static void main(String[] args) {
		int glavnica = 20000;
		double min = 1.16;
		double max = 37.7;
		double rata = (double) (min + Math.random() * (max - min + 1));
		double kredit = rata * glavnica;
		System.out.println("Ukupan kredit iznosi " + kredit
				+ "pri kamatnoj stopi od " + rata);

	}
}
