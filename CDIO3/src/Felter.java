
import java.util.ArrayList;

public class Felter {
	private static String feltnavn;
	private static String felttekst;
	
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
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("");
			
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
			feltTekst.add("Du har overtaget tÂrnet og til dit store held finder du en skattekiste med 250 penge!");
			feltTekst.add("ÿv, du landede lige midt i et krater, din pung ryger ud af lommen og du mister 100 penge.");
			feltTekst.add("Du er endelig nÂet frem til paladsets porte, som tak for dit heltmod, giver kongen dig 100 penge.");
			feltTekst.add("Du er strandet midt i den kolde ¯rken. Du k¯ber et tæppe af en beduiner for 20 penge.");
			feltTekst.add("Et forunderligt syn m¯der dig pÂ din vej. Midt i mellem bjergene finder du en smuk by, de er alle meget rige og du modtager 180 penge");
			feltTekst.add("Du ankommer til et kloster. Det ser ikke ud som om der har været nogle her i mange Âr? Der er heller ingen penge at finde.");
			feltTekst.add("Din fakkel er gÂet ud og du stÂr nu i komplet m¯rke. Noget r¯rer ved dit ben. Du kan h¯re en hvislelys i det fjerne. Da du endelig finder ud igen har du mistet 70 penge");
			feltTekst.add("Oppe i bjergene st¯der du pÂ et par træhytter. Du gÂr ind og fÂr varmen og tilfældigvis ligger der 60 penge");
			feltTekst.add("Du kommer til den skræmmende vareulve mur, du bliver bidt og mÂ bruge 80 penge pÂ en modeliksir, men du fÂr en ekstra tur. Skynd dig væk!");
			feltTekst.add("Du er blevet udfordret til en kamp i pitten, desværre taber du og mister 50 penge");
			feltTekst.add("Du finder en grotte og gÂr der ind. Der er noget der skinner... Du opdager det er en mine fyldt med guld! Du tager sÂ meget som du kan bære pÂ. Du fÂr 650 penge! ");
				
			String navn = feltTekst.get(sum);
			
				
			return navn;
		}
			
		/*
		 * Laver en metode til at brugen, kan spille spillet i et passende tempo.
		 * Kan tage alle testede inputs, dog optæller den inputs
		 */ 
		public static void trykEnter () {
			System.out.println("Tryk 'enter' for at forsætte.");
			try 
			{ System.in.read(); }
			catch (Exception e) {}
		}
	}
