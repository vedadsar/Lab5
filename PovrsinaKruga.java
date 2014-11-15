package com.zvedad.lab5;

/**Program izracunava povrsinu kruga i obim ( radijus poznat )
 * 
 * @author Vedad
 *
 */
public class PovrsinaKruga {
	public static void main(String[] args) {
		int radijus = 5;
		double povrsina = (double) (radijus * radijus * Math.PI);
		double obim = (double) (2 * radijus * Math.PI);
		System.out.println("povrsina kruga je " + povrsina);
		System.out.println("obim kruga je " + obim);
	}

}
