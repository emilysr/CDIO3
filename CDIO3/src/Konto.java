import java.util.ArrayList;

public class Konto {
	
	
	//Opretter objekter

	
	
	/*
	 * Laver en int ArrayList til at holde styr pÂ spillernes pengebeholdning
	 */
	public ArrayList <Integer> Pengebeholdning = new ArrayList <Integer>();
	
	/*
	 *En metode der tilf¯jer et nyt element i arrayet Pengebeholdning 
	 * og sætter penge beholdningen til 1000 som default
	 */
	public void nyKonto(){
	Pengebeholdning.add(1000);
	}
	
	/*
	 * En metode til at hente Pengebeholdning i en bestemt konto
	 */
	public Integer getPengebeholdning (int j) {
		return Pengebeholdning.get(j);
	}
	
	/*
	 * En metode til at ændre pengebeholdningen i en bestemt  konto
	 */
	public void setPengebeholdning(int pengefund, int j)
	{
		int nykonto = Pengebeholdning.get(j) + pengefund;
		
		/* Forhindre negativ konto balance */
		if(nykonto < 0){
			nykonto=0;
		}
		
		/* returnere en boolean pÂ om der er en vinder */
		if(nykonto >=3000){
			Main.konto3000=true; //
		}
		Pengebeholdning.set(j,nykonto);
	}

	}
