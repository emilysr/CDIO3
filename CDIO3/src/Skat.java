
import java.util.Scanner;

public class Skat extends Felter{

	private final static int procentSats = 10;
	static Scanner scan = new Scanner(System.in);
	
	public static int skat (int j) {
		System.out.println("1: Vil du betale 4000?\n2: Vil du betale 10% af din formue?");
		int valg = scan.nextInt(); int betalt = 0;
		if (valg == 1) {
			System.out.println("Du har betalt 4000,- i skat.");
			Konto.setPengebeholdning(-4000, j);	
			betalt = -4000;
		}
		if (valg == 2) {
			System.out.println("Du har betalt " + procentSats + " af din formue. ");
			Konto.setPengebeholdning(Konto.Pengebeholdning.get(j)-((Konto.Pengebeholdning.get(j)/100)*procentSats), j);
			betalt = (Konto.Pengebeholdning.get(j)/100) * procentSats ;
		}
		return betalt;
	}
}
