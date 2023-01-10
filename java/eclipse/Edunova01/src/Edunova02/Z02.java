package Edunova02;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Z02 {
	public static void main(String[] args) {
		
	int broj=0;
	int zbroj=0,min=0,max=0;
	
	for (int i=0;i<=4;i++){
		broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi"+( i + 1)+"Broj"));
		zbroj+=i;
		
		
		
	}
	System.out.println(zbroj);
	
	
	
	for (int j=0;j<=4;j++) {
		if(broj> min) {
			j=min;
		}
		
		
 
	 
		
	}
	
	for (int k=0;k<=4;k++) {
		if(broj<max) {
			k=max;
		}
	}
	
	
	for (int i=0;i<=4;i++) {
		zbroj+=i;
	}
	
		
		
		
		
	}
}


