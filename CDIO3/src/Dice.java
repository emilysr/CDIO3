
public class Dice {
	
	/*
	 * Den maksimale værdi terningen kan slÂ, lavet som final int
	 * En variabel med den nuværende øjen værdi
	 */
	private final int MAX = 6; 	
	private static int faceValue; 

	/*
	 * Vores konstruktør
	 */
	public Dice() {
		faceValue = 0;
	}



	/*
	 * Kaster terning og returner øjen værdi
	 */
	public int roll() {
		faceValue = (int)(Math.random() * MAX) + 1;
		return faceValue;
	}

	/*
	 * Henter øjen-værdien 
	 */
	public int getFaceValue() {
		return faceValue;
	}
}