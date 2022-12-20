package edunova;

import javax.swing.JOptionPane;

public class E06 {
	public static void main(String[] args) {
		String ime = "Marko";
		
		int i = 1996;
		
		System.out.println(ime +"     " + i);
		
		
		String ime1 = JOptionPane.showInputDialog("Unesi prvo ime");
		String ime2 = JOptionPane.showInputDialog("Unesi drugi ime");
		
		int ljubav = (int)(Math.random()*100);
		
		System.out.println(ime1 + " i " + ime2 + " se vole "+ljubav+"%");
		
				}

}
