package edunovaZadatci;

import javax.swing.JOptionPane;

public class ciklicnaMatrica {
	
		public static void main(String[] args) {
			
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite Visinu"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Unesite Sirinu"));

			int Matrica[][] = new int[x][y];
			int counter = 1;

			int Maxvisina = x - 1;
			int Minvisina = 0;
			int Maxsirina = y - 1;
			int Minsirina = 0;

			izvan: 
			for (; counter <= x * y;) {

				for (int j = Maxsirina; j >= Minsirina; j--) {
					if (counter > x * y) {
						break izvan;
					} else {
						Matrica[Maxvisina][j] = counter++;
					}

				}
				Maxvisina--;

				for (int j = Maxvisina; j >= Minvisina; j--) {

					if (counter > x * y) {
						break izvan;
					} else {
						Matrica[j][Minsirina] = counter++;
					}
				}
				Minsirina++;

				for (int j = Minsirina; j <= Maxsirina; j++) {

					if (counter > x * y) {
						break izvan;
					} else {
						Matrica[Minvisina][j] = counter++;
					}
				}
				Minvisina++;

				for (int j = Minvisina; j <= Maxvisina; j++) {

					if (counter > x * y) {
						break izvan;
					} else {
						Matrica[j][Maxsirina] = counter++;
					}
				}
				Maxsirina--;
			}

			for (

					int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.print(Matrica[i][j] + "\t");
				}
				System.out.println();
			}
		}

	}
