package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt1(int[][] matrise) {
		
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
				if (h == 0) {
					returnString = returnString + matrise[0][l] + " ";
				}

			}
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

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
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
