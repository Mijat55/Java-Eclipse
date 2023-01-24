package edunovaVjezbe;

import javax.swing.JOptionPane;

public class z03 {
	public static void main(String[] args) {
		
	
	int Lista[] = new int[24];
	int zbroj = 0, min = Lista[0], max = Lista[0];

	for (int i = 0; i < 24; i++) {
		Lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Upišite " + (i + 1) + " broj"));

	}

	for (int i = 0; i < 24; i++) {
		if (Lista[i] < min) {
			min = Lista[i];
		}
	}

	for (int i = 0; i < 24; i++) {
		if (Lista[i] > max) {
			max = Lista[i];
		}
	}

	for (int i = 0; i < 24; i++) {
		zbroj += Lista[i];
	}

	System.out.println(min + " " + max + " " + zbroj);
}

}
	


