public class Havn extends Felter {

	public static int afgift (int sum, int j) { 
		int i = 0; int afgift = 0;
		if (Ejerskab.ejerskab.get(sum) == j)
			afgift = 0; 
		else if (Ejerskab.ejerskab.get(sum) == Ejerskab.ejerskab.get(19))
			i++;
		else if (Ejerskab.ejerskab.get(sum) == Ejerskab.ejerskab.get(20))
			i++; 
		else if (Ejerskab.ejerskab.get(sum) == Ejerskab.ejerskab.get(21))
			i++; 
		else if (Ejerskab.ejerskab.get(sum) == Ejerskab.ejerskab.get(22))
			i++; 
		switch (i) {
		case 1: afgift = 500; 
		break;
		case 2: afgift = 1000;
		break; 
		case 3: afgift = 2000;
		break;
		case 4: afgift = 4000; 
		break;
		}
		return afgift;
	}
}
