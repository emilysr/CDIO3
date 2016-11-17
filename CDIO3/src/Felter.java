import java.util.ArrayList;

public class Felter {
	private static String feltnavn;
	public static ArrayList <Integer> feltType = new ArrayList <Integer> ();	
	
	/* Henter det nuværende felt navn */
	public static String hentFeltNavn () {
		return feltnavn; 
	}
	
	/* Tjekker om feltet kan ejes */
//	public static boolean ownable (int sum) {
	//	if (feltType.get(sum) == 1 || feltType.get(sum) == 3 || feltType.get(sum) == 5)
		//	return true;
		//else 
			//return false; 
//	}
	
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
		
		
		/*
		 * ArrayList over felternes værdi, til brug i pengeholdningen
	 	 */
		public static int feltVærdi (int sum, int j) {
	
		ArrayList <Integer> feltVærdi = new ArrayList <Integer> (); 
			feltVærdi.add(0);				/*Start*/
			feltVærdi.add(-100);				/*Tribe encampment*/
			feltVærdi.add(-300);				/*osv */
			feltVærdi.add(-500);
			feltVærdi.add(-700);
			feltVærdi.add(-1000);
			feltVærdi.add(-1300);
			feltVærdi.add(-1600);
			feltVærdi.add(-2000);
			feltVærdi.add(-2600);
			feltVærdi.add(-3200);
			feltVærdi.add(-4000);
			feltVærdi.add(5000);
			feltVærdi.add(500);
			feltVærdi.add(-100 /* Dice.roll*/);
			feltVærdi.add(-100 /* Dice.roll*/);
			feltVærdi.add(-2000);
			feltVærdi.add(Skat.skat(j));
			feltVærdi.add(Havn.afgift(sum, j));
			feltVærdi.add(Havn.afgift(sum, j));
			feltVærdi.add(Havn.afgift(sum, j));
			feltVærdi.add(Havn.afgift(sum, j));
			
			int værdi = feltVærdi.get(sum);
			
			return værdi;
		}
		
		/*
		 * ArrayList for Felternes tekstbeskrivelse
		 */
		public static int feltpris (int sum) {
			
		ArrayList <Integer> feltPris = new ArrayList <Integer> ();
				feltPris.add(-1000);
			feltPris.add(-1500);
			feltPris.add(-2000);
			feltPris.add(-3000);
			feltPris.add(-4000);
			feltPris.add(-4300);
			feltPris.add(-4750);
			feltPris.add(-5000);
			feltPris.add(-5500);
			feltPris.add(-6000);
			feltPris.add(-8000);
			feltPris.add(0);
			feltPris.add(0);
			feltPris.add(-2500);
			feltPris.add(-2500);
			feltPris.add(0);
			feltPris.add(0);
			feltPris.add(-4000);
			feltPris.add(-4000);
			feltPris.add(-4000);
			feltPris.add(-4000);
				
			int pris = feltPris.get(sum);
			
			return pris;
		}

	/*
		 * Henter feltets type som nummer format.
		 * 1:Territory 2:Refuge 3:Labor Camp 4:Skat 5:Havn
		 */
		private int hentFeltType (int sum) {
			feltType.add(0);
			feltType.add(1);
			feltType.add(1);
			feltType.add(1);
			feltType.add(1);
			feltType.add(1);
			feltType.add(1);
			feltType.add(1);
			feltType.add(1);
			feltType.add(1);
			feltType.add(1);
			feltType.add(1);
			feltType.add(15, 3);
			feltType.add(16, 3);
			feltType.add(19, 5);
			feltType.add(20, 5);
			feltType.add(21, 5);
			feltType.add(22, 5);
		
		int type = feltType.get(sum);
		return type;				
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
