package edunova;

import javax.swing.JOptionPane;

public class PrviProgram {
	public static void main(String[] args) {
		
	
	
	int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
	
	int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
	
	int rezultat = prviBroj + drugiBroj;
	
	System.out.println(rezultat);
	
	
	long a = Long.parseLong(JOptionPane.showInputDialog("Unos"));
	
	long b = Long.parseLong(JOptionPane.showInputDialog("Unos"));
	
	long r = a + b;
	
	System.out.println(r);
	
	
	
	
	
	
			
	}

}
