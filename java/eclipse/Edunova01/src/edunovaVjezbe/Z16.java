package edunovaVjezbe;

import javax.swing.JOptionPane;

public class Z16 {
	// Metoda od korisnika traži
		// unos broja između 1 i 10
		// te vraća ispravno unesen broj
	public static int broj() {
		int i;
		while(true) {
			i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj izmedju 1 i 10"));
		if(i>=1 && i<=10) {
			return i;
		}
	}

}
}
