import java.util.Scanner;

public class Main {
public static boolean konto3000=false;
	public static void main (String [] agrs) {

		Dice dice = new Dice();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); 
		Spiller spil = new Spiller();
	
		
		/* Initiallisere vores variabler */


		// Lavet med henblik pÂ udvidelser af yderligere bruger.	
		 System.out.println("Velkommen \nHvor mange spillere er i?");
		 int bruger = scan.nextInt(); 
		 

		/* Spillet starter */
		spil.spiller(bruger);

		System.out.println("\nLad spillet begynde. \n \n" + Spiller.hentNavn(0) + " starter");
	
	
	/* 
	 * Henter pengebeholdning fra konto
	 */
	while (konto3000==false) { 
		
		/*
		 * for løkke over antal brugere, der skal være med i spillet.
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
				sum = dice.getFaceValue();
				
				/*
				 * Udskrift til spilleren om felt, pengebeholdning osv. 
				 */
				System.out.println("Du er landet pÂ felt " + sum);
				
		//		if (Ejerskab.ejet(sum) == true)
			//		Ejerskab.købFelt(sum, j);
				
				System.out.println( j + " landte på " + Felter.feltNavn(sum) + 
						" & din penge beholdning ændres med " + Felter.feltVærdi(sum, j)) ;
				
				
				/*
				 * Retter spillerens konto, sÂ den passer med den nye pengebeholdning
				 */
				Konto.setPengebeholdning(Felter.feltVærdi(sum, Spiller.hentID(j)), j);
				System.out.println(Spiller.hentNavn(j) + "'s pengebeholdning er nu " + Konto.Pengebeholdning.get(j));
				System.out.println("");
				
			
				} 	
			
			/* Annoncere vinderen */
			if (konto3000 == true){
				System.out.println("Tillykke du har vundet " + Spiller.hentNavn(j) + "!");
			return;
			}
		}
	}
		
	
		scan.close();
	}
}