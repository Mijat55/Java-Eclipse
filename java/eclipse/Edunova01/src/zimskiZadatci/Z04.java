package zimskiZadatci;

public class Z04 {
	public static void main(String[] args) {
		int[][] matrica1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int[][] matrica2 = { { 1, 5, 9, 1 }, { 11, 1, 0, 1 }, { 54, 0, 12, 1 }, { 17, 8, 0, 1 } };

		int[][] rezultat = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				rezultat[i][j] = matrica1[i][j] + matrica2[i][j];

				System.out.print(rezultat[i][j] + " ");
			}
			System.out.println();
		}
		int zbroj = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				zbroj += matrica1[i][j] + matrica2[i][j];
			}
		}

		System.out.println("Zbroj " + zbroj);
	}

}
