
import java.util.ArrayList;

public class Felter {
	private static String feltnavn;
	private static String felttekst;
	
	/* Henter det nuvÊrende felt navn */
	public static String hentFeltNavn () {
		return feltnavn; 
	}
	
	
	public static String feltNavn (int sum) {
	
		/*
		 * ArrayList over felternes navn, lavet som udefinerbart langt array
		 * Fetl [0] & [1] er tomme da vi kun kan slÂ vÊrdierne 2-12
		 */
		ArrayList <String> feltNavn = new ArrayList <String> ();
			feltNavn.add("");
			feltNavn.add("");
			feltNavn.add("Tower.");
			feltNavn.add("Crater.");
			feltNavn.add("Palace Gates");
			feltNavn.add("Cold Desert");
			feltNavn.add("Walled City");
			feltNavn.add("Monastary");
			feltNavn.add("Black Cave");
			feltNavn.add("Huts in the mountain");
			feltNavn.add("The werewall");
			feltNavn.add("The pit");
			feltNavn.add("Goldmine");
			
			String navn = feltNavn.get(sum);
			
			return navn;
		}
		
		
		public static int feltVÊrdi (int sum) {
		
		/*
		 * ArrayList over felternes vÊrdi, til brug i pengeholdningen
		 */
		ArrayList <Integer> feltVÊrdi = new ArrayList <Integer> (); 
			feltVÊrdi.add(0);
			feltVÊrdi.add(0);
			feltVÊrdi.add(250);
			feltVÊrdi.add(-100);
			feltVÊrdi.add(100);
			feltVÊrdi.add(-20);
			feltVÊrdi.add(180);
			feltVÊrdi.add(0);
			feltVÊrdi.add(-70);
			feltVÊrdi.add(60);
			feltVÊrdi.add(-80);
			feltVÊrdi.add(-50);
			feltVÊrdi.add(650);
			
			int vÊrdi = feltVÊrdi.get(sum);
			
			return vÊrdi;
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
			feltTekst.add("Du er strandet midt i den kolde ¯rken. Du k¯ber et tÊppe af en beduiner for 20 penge.");
			feltTekst.add("Et forunderligt syn m¯der dig pÂ din vej. Midt i mellem bjergene finder du en smuk by, de er alle meget rige og du modtager 180 penge");
			feltTekst.add("Du ankommer til et kloster. Det ser ikke ud som om der har vÊret nogle her i mange Âr? Der er heller ingen penge at finde.");
			feltTekst.add("Din fakkel er gÂet ud og du stÂr nu i komplet m¯rke. Noget r¯rer ved dit ben. Du kan h¯re en hvislelys i det fjerne. Da du endelig finder ud igen har du mistet 70 penge");
			feltTekst.add("Oppe i bjergene st¯der du pÂ et par trÊhytter. Du gÂr ind og fÂr varmen og tilfÊldigvis ligger der 60 penge");
			feltTekst.add("Du kommer til den skrÊmmende vareulve mur, du bliver bidt og mÂ bruge 80 penge pÂ en modeliksir, men du fÂr en ekstra tur. Skynd dig vÊk!");
			feltTekst.add("Du er blevet udfordret til en kamp i pitten, desvÊrre taber du og mister 50 penge");
			feltTekst.add("Du finder en grotte og gÂr der ind. Der er noget der skinner... Du opdager det er en mine fyldt med guld! Du tager sÂ meget som du kan bÊre pÂ. Du fÂr 650 penge! ");
				
			String navn = feltTekst.get(sum);
			
				
			return navn;
		}
			
		/*
		 * Laver en metode til at brugen, kan spille spillet i et passende tempo.
		 * Kan tage alle testede inputs, dog optÊller den inputs
		 */ 
		public static void trykEnter () {
			System.out.println("Tryk 'enter' for at forsÊtte.");
			try 
			{ System.in.read(); }
			catch (Exception e) {}
		}
	}
