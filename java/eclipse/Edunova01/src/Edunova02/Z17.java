package Edunova02;

public class Z17 {

	// Program od korisnika traži ukupan broj
	// predmeta u školi
	// Program unosi ocjene za svaki predmet
	// i ispisuje prosjek ocjena

	public static void main(String[] args) {
		int suma = 0;

		int ukupnoPredmeta = Test.ucitajCijeliPozitivniBroj("Unesite ukupan broj predmeta za koji želite prosjek");
		for (int i = 0; i < ukupnoPredmeta; i++) {

			suma += Test.ucitajCijeliBrojURasponu("Unesite " + (i + 1) + ". ocjenu", 1, 5);
		}

		System.out.println(suma / (float) ukupnoPredmeta);
	}
}
