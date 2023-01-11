package Edunova02;

import javax.swing.JOptionPane;

public class Z07 {
	public static void main(String[] args) {
		// Za unesena dva cijela broj
		// program ispisuje drugi
		// 3 i 5 -> 5
		// 5 i 3 -> 3
		// 5 i 5 ->
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		if(i==3 && j==5) {
			System.out.println(j);
		}else if(i==5 && j==3) {
			System.out.println(j);
		}else if(i==5 && j==5) {
			System.out.println(j);
		}
		
	}

}
