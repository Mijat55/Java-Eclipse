package zimskiZadatci;

import javax.swing.JOptionPane;

public class Zimski01 {
	public static void main(String[] args) {
		int prviBroj= Integer.parseInt(JOptionPane.showInputDialog("Unos 1. broja"));
		int drugiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 2. broja"));
		int treciBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 3. broja"));
		int cetvrtiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 4. broja"));
		int petiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 5. broja"));
		int sestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 6. broja"));
		int sedmiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 7. broja"));
		int osmiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 8. broja"));
		int devetiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 9. broja"));
		int desetiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 10. broja"));
		int jedanaestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 11. broja"));
		int dvanaestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 12. broja"));
		int trinaestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 13. broja"));
		int cetrnaestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 14. broja"));
		int petnaestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 15. broja"));
		int sesnaestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 16. broja"));
		int sedamnaestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 17. broja"));
		int osamnaestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 18. broja"));
		int devetnaestiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 19. broja"));
		int dvadesetiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 20. broja"));
		int dvadesetprviBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 21. broja"));
		int dvadesetdrugiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 22. broja"));
		int dvadesettreciBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 23. broja"));
		int dvadesetcetvrtiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unos 24. broja"));
		
	
		
		
		int zbroj=prviBroj + drugiBroj + treciBroj + cetvrtiBroj + petiBroj + sestiBroj + sedmiBroj + osmiBroj + devetiBroj + desetiBroj +jedanaestiBroj + dvanaestiBroj + trinaestiBroj
				+ cetrnaestiBroj + petnaestiBroj + sesnaestiBroj + sedamnaestiBroj + osamnaestiBroj + devetnaestiBroj + dvadesetiBroj + dvadesetprviBroj + dvadesetdrugiBroj +
				 dvadesettreciBroj + dvadesetcetvrtiBroj;
		int max=prviBroj;
		if(drugiBroj>max)max=drugiBroj;if(treciBroj>max)max=treciBroj;if(cetvrtiBroj>max)max=cetvrtiBroj;if(petiBroj>max)max=petiBroj;if(sestiBroj>max)max=sestiBroj;
		if(sedmiBroj>max)max=sedmiBroj;if(osmiBroj>max)max=osmiBroj;if(devetiBroj>max)max=devetiBroj;if(desetiBroj>max)max=desetiBroj;if(jedanaestiBroj>max)max=jedanaestiBroj;
		if(dvanaestiBroj>max)max=dvanaestiBroj;if(trinaestiBroj>max)max=trinaestiBroj;if(cetrnaestiBroj>max)max=cetrnaestiBroj;if(petnaestiBroj>max)max=petnaestiBroj;
		if(sesnaestiBroj>max)max=sesnaestiBroj;if(sedamnaestiBroj>max)max=sedamnaestiBroj;if(osamnaestiBroj>max)max=osamnaestiBroj;if(devetnaestiBroj>max)max=devetnaestiBroj;
		if(dvanaestiBroj>max)max=dvadesetiBroj;if(dvadesetprviBroj>max)max=dvadesetprviBroj;if(dvadesetdrugiBroj>max)max=dvadesetdrugiBroj;if(dvadesettreciBroj>max)max=dvadesettreciBroj;
		if(dvadesetcetvrtiBroj>max)max=dvadesetcetvrtiBroj;
		
		int min=prviBroj;
		if(drugiBroj<min)min=drugiBroj;if(treciBroj<min)min=treciBroj;if(cetvrtiBroj<min)min=cetvrtiBroj;if(petiBroj<min)min=petiBroj;if(sestiBroj<min)min=sestiBroj;
		if(sedmiBroj<min)min=sedmiBroj;if(osmiBroj<min)min=osmiBroj;if(devetiBroj<min)min=devetiBroj;if(desetiBroj<min)min=desetiBroj;if(jedanaestiBroj<min)min=jedanaestiBroj;
		if(dvanaestiBroj<min)min=dvanaestiBroj;if(trinaestiBroj<min)min=trinaestiBroj;if(cetrnaestiBroj<min)min=cetrnaestiBroj;if(petnaestiBroj<min)min=petnaestiBroj;
		if(sesnaestiBroj<min)min=sesnaestiBroj;if(sedamnaestiBroj<min)min=sedamnaestiBroj;if(osamnaestiBroj<min)min=osamnaestiBroj;if(devetnaestiBroj<min)min=devetnaestiBroj;
		if(dvanaestiBroj<min)min=dvadesetiBroj;if(dvadesetprviBroj<min)min=dvadesetprviBroj;if(dvadesetdrugiBroj<min)min=dvadesetdrugiBroj;if(dvadesettreciBroj<min)min=dvadesettreciBroj;
		if(dvadesetcetvrtiBroj<min)min=dvadesetcetvrtiBroj;
		
		
		System.out.println(" Zbroj svih unesenih brojeva" + " " +zbroj);
		System.out.println("Maksimalni uneseni broj" + " " +max);
		System.out.println("Minimalni uneseni broj" + " " +min);
		
			
		}
	
	}



