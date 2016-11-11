
import java.util.ArrayList;

public class Felter {
	private static String feltnavn;
	
	
	/* Henter det nuværende felt navn */
	public static String hentFeltNavn () {
		return feltnavn; 
	}
	
	
	public static String feltNavn (int sum) {
	
		/*
		 * ArrayList over felternes navn, lavet som udefinerbart langt array
		 * Felt [0] & [1] er tomme da vi kun kan slå værdierne 2-12
		 */
		ArrayList <String> feltNavn = new ArrayList <String> ();
			feltNavn.add("START");
			feltNavn.add("Tribe Encampment");
			feltNavn.add("Crater");
			feltNavn.add("Mountain");
			feltNavn.add("Cold Desert");
			feltNavn.add("Black cave");
			feltNavn.add("The Werewall");
			feltNavn.add("Mountain village");
			feltNavn.add("South Citadel");
			feltNavn.add("Palace gates");
			feltNavn.add("Tower");
			feltNavn.add("Castle");
			feltNavn.add("Walled city");
			feltNavn.add("Monastery");
			feltNavn.add("Huts in the mountain");
			feltNavn.add("The pit");
			feltNavn.add("Goldmine");
			feltNavn.add("Caravan");
			feltNavn.add("Second Sail");
			feltNavn.add("Sea Grover");
			feltNavn.add("The Buccaneers");
			feltNavn.add("Privateer armade");
			
			String navn = feltNavn.get(sum);
			
			return navn;
		}
		
		
		public static int feltVærdi (int sum) {
		
		/*
		 * ArrayList over felternes værdi, til brug i pengeholdningen
		 */
		ArrayList <Integer> feltVærdi = new ArrayList <Integer> (); 
			feltVærdi.add(0);
			feltVærdi.add(0);
			feltVærdi.add(250);
			feltVærdi.add(-100);
			feltVærdi.add(100);
			feltVærdi.add(-20);
			feltVærdi.add(180);
			feltVærdi.add(0);
			feltVærdi.add(-70);
			feltVærdi.add(60);
			feltVærdi.add(-80);
			feltVærdi.add(-50);
			feltVærdi.add(650);
			
			int værdi = feltVærdi.get(sum);
			
			return værdi;
		}
		
	public static String felttekst (int sum) {
			
		/*
		 * ArrayList for Felternes tekstbeskrivelse
		 */
		ArrayList <String> feltTekst = new ArrayList <String> ();
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
			feltTekst.add("");
				
			String tekst = feltTekst.get(sum);
			
				
			return tekst;
		}
			
		/*
		 * Laver en metode til at brugeren, kan spille spillet i et passende tempo.
		 * Kan tage alle testede inputs, dog optæller den inputs
		 */ 
		public static void trykEnter () {
			System.out.println("Tryk 'enter' for at forsætte.");
			try 
			{ System.in.read(); }
			catch (Exception e) {}
		}
	}
