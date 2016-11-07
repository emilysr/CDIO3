
public class Dice {
	
	/*
	 * Den maksimale vÊrdi terningen kan slÂ, lavet som final int
	 * En variabel med den nuvÊrende ¯jen vÊrdi
	 */
	private final int MAX = 6; 	
	private static int faceValue; 

	/*
	 * Vores konstrukt¯r
	 */
	public Dice() {
		faceValue = 0;
	}



	/*
	 * Kaster terning og returner ¯jen vÊrdi
	 */
	public int roll() {
		faceValue = (int)(Math.random() * MAX) + 1;
		return faceValue;
	}

	/*
	 * Henter ¯jen-vÊrdien 
	 */
	public int getFaceValue() {
		return faceValue;
	}
}