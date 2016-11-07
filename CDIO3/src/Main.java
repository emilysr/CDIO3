
import java.util.Scanner;

public class Main {
public static boolean konto3000=false;
	public static void main (String [] agrs) {

		Dice dice = new Dice();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); 
		Spiller spil = new Spiller();
		
		/* Initiallisere vores variabler */
		int kast1 = 0;
		int kast2 = 0;
		int bruger = 2; 

		/* Lavet med henblik pÂ udvidelser af yderligere bruger.	
		 *System.out.println("Velkommen \nHvor mange spillere er i?");
		 *int bruger = scan.nextInt(); 
		 */

		/* Spillet starter */
		spil.spiller(bruger);

		System.out.println("\nLad spillet begynde. \n \n" + spil.hentNavn(0) + " starter");
	
	
	/* 
	 * Henter pengebeholdning fra konto
	 */
	while (konto3000==false) { 
		
		/*
		 * for l¯kke over antal brugere, der skal vÊre med i spillet.
		 */
		for (int j = 0; j < bruger; j++) {
			int sum = 0;
			
			/*
			 * Input fra brugeren, for at komme videre i spillet.
			 * Forhindre at spillet spiller sig selv. 
			 */
			Felter.trykEnter();
			if (konto3000== true)
				return;
			
			/*  
			 * L¯kke for ekstra tur, kunne argumentere for at lave det som en do- while l¯kke
			 */
			for (int n = 0; n < 1; n++) {
				dice.roll();
				kast1 = dice.getFaceValue();
				dice.roll();
				kast2 = dice.getFaceValue();
				sum=kast1+kast2;
				
				/*
				 * Udskrift til spilleren om felt, penge beholdning osv. 
				 */
				System.out.println("Du er landet pÂ felt " + sum);
				System.out.println(  Felter.felttekst(sum));
				System.out.println( spil.hentNavn(j) + " landte pÂ " + Felter.feltNavn(sum) + 		
						" & din penge beholdning Êndres med " + Felter.feltVÊrdi(sum)) ; 
				
				/*
				 * Retter spillerens konto, sÂ den passer med den nye pengebeholdning
				 */
				Konto.setPengebeholdning(Felter.feltVÊrdi(sum), j);
				System.out.println(spil.hentNavn(j) + "'s pengebeholdning er nu " + Konto.Pengebeholdning.get(j));
				System.out.println("");
				
				/* Ekstra tur ved vareulvemur */
				if (sum == 10){
					n = -1;
				} 	
			}
			/* Annoncere vinderen */
			if (konto3000 == true){
				System.out.println("Tillykke du har vundet " + spil.hentNavn(j) + "!");
			return;
			}
		}
	
		
	}
		scan.close();
	}
}
