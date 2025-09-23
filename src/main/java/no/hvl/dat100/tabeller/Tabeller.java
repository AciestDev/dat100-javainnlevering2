package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i : tabell) {
			System.out.print(tabell + " ");
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String[] skrivString = new String[tabell.length];
		String sammensattString = "[";
		String temp;
		
		for (int i = 0; i < tabell.length; i++) {
			skrivString[i] = Integer.toString(tabell[i]);
			temp = skrivString[i];
			if (i < tabell.length-1) {
			sammensattString = sammensattString + temp + ",";
			} else {
				sammensattString = sammensattString + temp;
			}
		}

		sammensattString = sammensattString + "]";

		return sammensattString;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
