package projectEuler;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class largest_prime_factor {
	public static void main(String[] args) {
		//// What is the largest prime factor of the number 600851475143 ?
	      BigInteger number = new BigInteger("600851475066");
	        BigInteger largestPrime = number.nextProbablePrime();
	        System.out.println("Largest prime number: " + largestPrime);
	    }
	

	}


