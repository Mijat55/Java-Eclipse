package Edunova02;

public class Z18 {
	// Program unosi imena dvije osobe
	// i ispisujue koliko se vole
	// metodom slučajnog broja od 10 do 90
	public static void main(String[] args) {
		String ime1=Test.obavezanUnosStringa("Unesi svoje ime");
		String ime2=Test.obavezanUnosStringa("Unesi ime simpatije");
		
		int slucajniBroj=Test.slucajniBrojUrasponu(10, 90);
		
		System.out.println(ime1+" i "+ime2+" se vole "+slucajniBroj+"%");
	}
}


