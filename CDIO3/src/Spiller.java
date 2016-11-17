
import java.util.Scanner;
import java.util.ArrayList;

public class Spiller {
		
		/*
		 * Opretter en scanner til at fange spillerens navn
		 * ArrayList med spiller navne, udefinerbart langt
		 */
		private Scanner scan = new Scanner(System.in);
		private static ArrayList <String> spillerNavn = new ArrayList <String> ();
		private static ArrayList <Integer> spillerID = new ArrayList <Integer> ();
		
	public void spiller (int bruger) {
		
		/* 
		 * for l¯kke for at oprette spillere, med navn og pengebeholdning
		 */
		for(int i = 0; i < bruger; i++) {
			System.out.println("Hvad hedder spiller " + (i+1) + "?");
			spillerNavn.add(scan.next());
			Konto.nyKonto();
			System.out.println("Spiller " + spillerNavn.get(i) + " er oprettet.");
			System.out.println("Konto i har en penge beholdning pÂ " + Konto.Pengebeholdning.get(i));
		}
	}
	
	/* Henter spillerens navn */
	public static String hentNavn (int i) {
		return spillerNavn.get(i);
	}
	
	/* Henter spillerens ID */
	public static int hentID (int j) {
		return spillerID.get(j);
	}	
}



