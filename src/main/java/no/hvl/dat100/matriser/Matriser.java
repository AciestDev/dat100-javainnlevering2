package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] temp = {{1,2},
						{3,4},
						{5,6},
						{7,8} };
		int[][] temp2 = {{1,2,3},
						 {4,5,6} };

		int[][] newList = multipliser(temp, temp2);
		skrivUt(newList);
	}
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

		int[][] newList = new int[matrise[0].length][matrise.length];

		for (int h = 0; h < newList.length; h++) {
			for(int l = 0; l < newList[h].length;l++) {
			newList[h][l] = matrise[l][h];
			}
		}
		
		return newList;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] nyTabell = new int[0][0];

		if (a[0].length == b.length || a.length == b[0].length) {
			if (a.length > b.length) {
				nyTabell = new int[a.length][];
			
				for (int h = 0; h < a.length; h++) {
					nyTabell[h] = new int[b[0].length];
			}

			} else {
				nyTabell = new int[b.length][];
			
				for (int h = 0; h < b.length; h++) {
					nyTabell[h] = new int[a[0].length];
				}
			}

        } else {
			throw new IllegalArgumentException("Cannot multiply: a[0].length != b.length");
		}
		return nyTabell;
	}
}
