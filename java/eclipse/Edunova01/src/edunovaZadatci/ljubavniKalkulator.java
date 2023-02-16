package edunovaZadatci;

import java.util.Scanner;

public class ljubavniKalkulator {
	private static int pronadjiZbroj(int slovo) {
		int zbroj = 0;
		while (slovo > 0) {
			zbroj += slovo % 10;
			slovo /= 10;
		}
		return zbroj;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String Ljubav = "ljubav";

		String prvoIme;
		String drugoIme;

		int prviZbroj;
		int drugiZbroj;
		int ljubavniZbroj;
		int ukupniZbroj;

		while (true) {

			System.out.println("Unesi prvo ime : ");
			prvoIme = sc.nextLine();

			if (prvoIme.equals("m")) {
				break;
			}
			System.out.println("Unesi drugo ime : ");
			drugoIme = sc.nextLine();

		
			prviZbroj = 0;
			drugiZbroj = 0;
			ljubavniZbroj = 0;

		prvoIme = prvoIme.toLowerCase();
			drugoIme = drugoIme.toLowerCase();

			for (char i = 0; i < prvoIme.length(); i++) {
				prviZbroj += prvoIme.charAt(i);
			}

			for (char i = 0; i < drugoIme.length(); i++) {
				drugiZbroj += drugoIme.charAt(i);
			}

			for (char i = 0; i < Ljubav.length(); i++) {
				ljubavniZbroj += Ljubav.charAt(i);
			}
			ukupniZbroj = pronadjiZbroj(prviZbroj + drugiZbroj);
			ljubavniZbroj = pronadjiZbroj(ljubavniZbroj);
			if (ukupniZbroj > ljubavniZbroj) {
				ukupniZbroj = ljubavniZbroj - (ukupniZbroj - ljubavniZbroj);
			}

			System.out.println("Ljubav % : " + (ukupniZbroj * 100 / ljubavniZbroj));

		}

	}
}
//prvo ime
//drugo ime
// napraviti u netbeansu

