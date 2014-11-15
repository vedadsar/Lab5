package com.zvedad.lab5;
/**program simulira nasumicno bacanje dvije kockice.
 * 
 * @author Vedad
 *
 */
public class BacanjeKockica {
public static void main(String[] args) {
  
	int kockica1 = (int) (1+ Math.random()*6);
	int kockica2 = (int) (1+ Math.random()*6);
	
	System.out.println("kockica broj jedan je " +kockica1);
	System.out.println("kockica broj dva je " +kockica2);
}
}

