package no.hvl.dat100.tabeller;

import java.util.stream.IntStream;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int _ : tabell) {
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

		return IntStream.of(tabell).sum();
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnes = true;
			}
		}

		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int finnes = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnes = i;
			}
		}

		return finnes;
		
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] nyTabell = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[tabell.length - 1 - i];
		}

		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean erSortert = true;

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] >= tabell [i+1]) {
				erSortert = false;
			}
		}

		return erSortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nyTabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {
			nyTabell[tabell1.length + i] = tabell2[i];
		}
		
		return nyTabell;
	}
}
