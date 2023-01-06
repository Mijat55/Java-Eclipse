package zimskiZadatci;

public class ciklicnaMatrica {
	public static void main(String[] args) {
		// postaviti velicinu matrice
		int velicina = 5;

		// kreirati matricu
		int[][] matrica = new int[velicina][velicina];

		// dodati brojcane varijable
		int brojac = 1;
		int red = 0;
		int col = 0;
		int smjer = 1; // 1 = desno, 2 = dolje, 3 = lijevo, 4 = gore
		while (brojac <= velicina * velicina) {
			matrica[red][col] = brojac;
			brojac++;

			switch (smjer) {
			
		case 1 :// desno
				if (col + 1 >= velicina || matrica[red][col + 1] != 0) {
					smjer = 2;
					red++;
				} else {
					col++;
				}
				break;
		case 2 :// dolje
				if (red + 1 >= velicina || matrica[red + 1][col] != 0) {
					smjer = 3;
					col--;
				} else {
					red++;
				}
				break;
		case 3 : // lijevo
				if (col - 1 < 0 || matrica[red][col - 1] != 0) {
					smjer = 4;
					red--;
				} else {
					col--;
				}
				break;
		case 4 : // gore
				if (red - 1 < 0 || matrica[red - 1][col] != 0) {
					smjer = 1;
					col++;
				} else {
					red--;
				}
				break;
			}
		}

		// Print matricu
		for (int i = 0; i < velicina; i++) {
			for (int j = 0; j < velicina; j++) {
				System.out.print(matrica[i][j] + " ");

			}

			System.out.println();
		}
	}
}
