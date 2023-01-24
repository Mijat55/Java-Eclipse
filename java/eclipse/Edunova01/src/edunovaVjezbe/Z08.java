package edunovaVjezbe;

import javax.swing.JOptionPane;

public class Z08 {
	public static void main(String[] args) {
		// Za upisana 3 cijela broja
		// program ispisuje najveći
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int k = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));

		if (i >= j && i >= k) {
			System.out.println(i);

		} else if (j >= k && j >= i) {
			System.out.println(j);
		} else if (k >= j && k >= i) {
			System.out.println(k);
		}

	}

}
