import java.util.ArrayList;
import java.util.Scanner;

public class Ejerskab extends Felter {

	public static ArrayList <Integer> ejerskab = new ArrayList <Integer> ();
	static Scanner scan = new Scanner(System.in);
		
	public static boolean ejet (int sum) {
		if (Felter.ownable(sum) == true && ejerskab.get(sum) != 0)
			return true;
		else
			return false;
	}
	
	public static void købFelt (int sum, int j) {
		if ( ejerskab.get(sum) == 0 && feltType.get(sum) == 1 || ejerskab.get(sum) == 0 && feltType.get(sum) == 3 ||
				ejerskab.get(sum) == 0 && feltType.get(sum) == 5) {
			System.out.println("Vil du gerne købe dette felt? (j/n)");
			String svar = scan.next();
			if (svar.equalsIgnoreCase("j"));
			konto.setPengebeholdning(Felter.feltpris(sum), j);
			setEjerskab(sum, j);
		}		
	}
	
	private String typeTekst (int sum) {
		String typeTekst = "Neutral groud"; 
		switch (feltType.get(sum)) {
		case (1): typeTekst = "Territory"; 
		break;
		case (2): typeTekst = "Refuge"; 
		break;
		case (3): typeTekst = "Labor camp"; 
		break;
		case (4): typeTekst = "Skat"; 
		break;
		case (5): typeTekst = "Havn"; 
		break;}
			return typeTekst;
	}
	
	/* */
	private static void setEjerskab ( int sum, int j) {
		ejerskab.add(sum, Spiller.hentID(j));
	}
	
	public String getEjerskab (int sum) {
		String getEjerskab = Spiller.hentNavn(ejerskab.get(sum));
		return getEjerskab;
	}
}
