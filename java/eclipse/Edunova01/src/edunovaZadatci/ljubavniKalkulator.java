package edunovaZadatci;

import java.util.Scanner;

public class ljubavniKalkulator {
	private static int findSum(int ne) {
		int zbroj = 0;
		while (ne > 0) {
			zbroj += ne % 10;
			ne /= 10;
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

			if (prvoIme.equals("q")) {
				break;
			}
			System.out.println("Unesi drugo ime : ");
			drugoIme = sc.nextLine();

		

}
	}
}
