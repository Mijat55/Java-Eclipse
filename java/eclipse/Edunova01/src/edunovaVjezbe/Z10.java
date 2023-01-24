package edunovaVjezbe;

import javax.swing.JOptionPane;

public class Z10 {
	public static void main(String[] args) {
		// Program unosi 2 broja
		// Ako su oba broja parni
		// ispisuje njihov zbroj
		// inače ispisuje njihovu razliku
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		boolean zbroj=true;
		if(i%2==0 && j%2==0) {
			zbroj=true;
				System.out.println(i+j);
			}else 
				{zbroj=false; 
				System.out.println(i-j);
				
			
				
			}
		
		
	}

}
