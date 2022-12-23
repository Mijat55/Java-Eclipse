package edunova;

import javax.swing.JOptionPane;

public class Z08novi {
	public static void main(String[] args) {
		 // Korisnik unosi dva cijela broja
		 // Program ispisuje 
		 // zbroj svih parnih brojeva
		 // između dva unesena broja
		
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unos prvog broja"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unos drugog broja"));
		int min = prviBroj<drugiBroj ? prviBroj : drugiBroj;
		int max = prviBroj>drugiBroj ? prviBroj: drugiBroj;
		int zbroj=0;
		for(int i=min;i<=max;i++) {
			if(i%2==0) {
				zbroj+=i;
			}
		}
		
			System.out.println(zbroj);
		
		
		
	}

}
