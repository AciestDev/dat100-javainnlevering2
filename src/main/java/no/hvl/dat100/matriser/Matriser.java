package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] h : matrise) {
        	for (int l : h) {
            	System.out.print(l + ",");
        	}
        	System.out.println();
   		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String returnString = "";

		for (int h = 0; h < matrise.length; h++) { 
			for (int l = 0; l < matrise[h].length; l++) {
				returnString = returnString + Integer.toString(matrise[h][l]) + " ";
			}
			returnString = returnString + "\n";
		}

		return returnString;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][];
		
		
		for (int h = 0; h < matrise.length; h++) {
			nyMatrise[h] = new int[matrise[h].length];
			
			for (int l = 0; l < matrise[h].length; l++) {
				nyMatrise[h][l] = matrise[h][l] * tall;
			}
		}

		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length == b.length) {
			for (int h = 0; h < a.length; h++) {
				if (a[h].length == b[h].length) {
					for (int l = 0; l < a[h].length; l++) {
						if (a[h][l] != b[h][l]) {
							return false;
						}
					}
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
