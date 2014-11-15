package com.zvedad.lab5;
/**Ispisuje nasumican broj izmedju vec unesena dva broja.
 * 
 * @author Vedad
 *
 */
public class IntervalRandom {
	public static void main(String[] args) {
		int broj1 = 7;
		int broj2 = 2;
		int rez = (int) (broj2 + Math.random() * (broj1 - broj2 + 1));
		System.out.println(rez);
	}
}