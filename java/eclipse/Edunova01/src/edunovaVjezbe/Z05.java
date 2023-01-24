package edunovaVjezbe;

import javax.swing.JOptionPane;

public class Z05 {
	public static void main(String[] args) {
		// Korisnik unosi cijeli broj
		// Program ispisuje da li je 
		// paran ili nije
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		if(i%2==0) {
			System.out.println("Paran");
		}else
		{System.out.println("Neparan");
	}

}
}
