package zimskiZadatci;


public class Zimski02 {
	public static void main(String[] args) {
//		Kreiraj program koji će koristeći for petlje automatizirati ispis tablice množenja u ovom obliku:
//		-------------------------------
//		: : :  TABLICA  MNOZENJA  : : :
//		-------------------------------
//		 * |  1  2  3  4  5  6  7  8  9
//		-------------------------------
//		 1 |  1  2  3  4  5  6  7  8  9
//		 2 |  2  4  6  8 10 12 14 16 18
//		 3 |  3  6  9 12 15 18 21 24 27
//		 4 |  4  8 12 16 20 24 28 32 36
//		 5 |  5 10 15 20 25 30 35 40 45
//		 6 |  6 12 18 24 30 36 42 48 54
//		 7 |  7 14 21 28 35 42 49 56 63
//		 8 |  8 16 24 32 40 48 56 64 72
//		 9 |  9 18 27 36 45 54 63 72 81
//		-------------------------------
//		:  :  :  :  :  :   :by Tomislav
//		-------------------------------
//		Umjesto "Ime" treba ispisati ime uneseno s konzole i pri tome pripaziti da zadnje slovo imena bude poravnato s desnim rubom tablice.

		 {
			for (int a = 0; a < 31; a++) {
				System.out.print("-");
			}

			System.out.println();
			System.out.println(": : :  TABLICA  MNOZENJA  : : : ");

			for (int a = 0; a < 31; a++) {
				System.out.print("-");
			}

			System.out.println();
			System.out.println(" * |  1  2  3  4  5  6  7  8  9");

			for (int a = 0; a < 31; a++) {
				System.out.print("-");
			}

			System.out.println();
			int kocka[][] = new int[15][15];
			for (int a = 1; a <= 9; a++) {
				System.out.print(" " + a + " " + "|");
				for (int b = 1; b <= 9; b++) {

					kocka[a][b] = a * b;
					{

						if (kocka[a][b] >= 10) {
							System.out.print(" " + kocka[a][b]);
						} else

							System.out.print("  " + kocka[a][b]);

					}
				}
				System.out.println();

			}

			for (int a = 0; a < 31; a++) {
				System.out.print("-");

			}
			System.out.println();
			
			System.out.format("%s %3s %3s %7s by Marko",":  :",":  :",":  :",":");
	
			}
				

			}
	    
		


		 }
	

	


