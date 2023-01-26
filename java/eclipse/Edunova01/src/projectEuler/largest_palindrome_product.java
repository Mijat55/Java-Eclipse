package projectEuler;

public class largest_palindrome_product {
	public static void main(String[] args) {
		//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

				//Find the largest palindrome made from the product of two 3-digit numbers.
	       int max3broja = 999;
	        int maxPalindrom = 0;
	        for (int i = 100; i <= max3broja; i++) {
	        	 for (int j = i; j <= max3broja; j++){
	                 int zbroj = i * j;
	                 if (jePalindrom(zbroj) && zbroj > maxPalindrom) {
	                     maxPalindrom = zbroj;
	                 }
	        	 }
	        }
	        System.out.println("Maksimalno 3-broja palindrom broja: " + maxPalindrom);
	    }
	    

	    public static boolean jePalindrom(int broj) {
	        int orginal = broj;
	        int obrnuto = 0;
	        while (broj != 0) {
	            int ostatak = broj % 10;
	            obrnuto = obrnuto * 10 + ostatak;
	            broj /= 10;
	        }
	        return orginal == obrnuto;
	    }
	
	}


