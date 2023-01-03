package zimskiZadatci;

import javax.swing.JOptionPane;

public class Zimski03 {
	public static void main(String[] args) {
		// Kreirati program koji za dva unesena broja ispisuje sve prim brojeve između
		// njih.
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int min = prviBroj < drugiBroj ? prviBroj : drugiBroj;
		int max = prviBroj > drugiBroj ? prviBroj : drugiBroj;

		for (int i = min; i < max; i++) {
			int ispis = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					ispis++;

				}

			}
			if (ispis == 0) {
				System.out.println(i);

			}

		}
	}
}
