package Edunova02;

public class Z15 {
	// Napišite metodu koja prima
		// tri cijela broja i vraća najveći
	public static int najveci(int a, int b, int c) {
		if(a>=b && a>=c) {
			return a;
		}
		if(b>=a && b>=c) {
			return b;
		}
		return c;
	}

}
