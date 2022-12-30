package zimskiZadatci;

public class Zimski02boljaverzija {
	public static void main(String[] args) {
		String crtice = "";
		for(int i = 0;i < 41;i++) {
			crtice += "-";
		}
		System.out.println(crtice);
		
		System.out.format("%s %3s %3s %19s %3s %3s %3s %n",":",":",":","TABLICA MNOZENJA",":",":",":");
		System.out.println(crtice);
		System.out.format("%s %3s %3d %3d %3d %3d %3d %3d %3d %3d %3d %n","*","|",1,2,3,4,5,6,7,8,9);
		System.out.println(crtice);
		String [][] tablica = new String[9][11];
		for(int i =0;i<9;i++) {
			tablica[i][0]=String.valueOf(i + 1);
			tablica[i][1]="|";
			for(int j=2;j<11;j++) {
				tablica[i][j] = String.valueOf((i+1)*(j-1));
			}
		}
		for (String [] redUTablici : tablica) {
			System.out.format("%s %3s %3s %3s %3s %3s %3s %3s %3s %3s %3s %n",redUTablici);
		}
		System.out.println(crtice);
		System.out.format("%s %3s %3s %3s %3s %3s %10s by Marko",":",":",":",":",":",":",":");
	}

}
