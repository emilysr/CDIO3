
import java.util.Scanner;
import java.util.ArrayList;

public class Spiller {
		
		/*
		 * Opretter en scanner til at fange spillerens navn
		 * ArrayList med spiller navne, udefinerbart langt
		 */
		private Scanner scan = new Scanner(System.in);
		private ArrayList <String> spillerNavn = new ArrayList <String> ();
		
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
	public String hentNavn (int i) {
		return spillerNavn.get(i);
	}		
	
}




//public class Spiller {
//
//    private static int antalSpillere=0; //klasse-attribut, som holder styr pÂ antal objekter der er oprettet
//
//    private Konto kto;   /* klassen Konto forudsættes importeret */
//
//    private int ID_nr;
//
//   
//
//    public Spiller() {
//    	
//    			//konstrukt¯rern skal optælle - klassevariablen (-attributten)
//                antalSpillere++; 
//                
//                // her tildeles spilleren et nummer - som klassearttrib. er nÂet til
//                ID_nr = antalSpillere;  
//                kto = new Konto();
//    }
//    
//    public int getAntalSp () {
//    	
//                return antalSpillere;
//    }
//
//    public int getPengebeholdning () {
//    	
//                return kto.getScore();
//    }
//
//    public int getSpillersNr() {
//
//                return ID_nr;
//    }
