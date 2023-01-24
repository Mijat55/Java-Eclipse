package edunovaVjezbe;

import javax.swing.JOptionPane;

public class Z06 {
	public static void main(String[] args) {
		// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veći od 10
		// inače ispisuje Edunova
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		if(i+j>10) {
			System.out.println("Osijek");
		}else
		{System.out.println("Edunova");
	}

}
}
