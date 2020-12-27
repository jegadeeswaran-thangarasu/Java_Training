package exerciseday1;

import java.lang.Math;

public class PrimeOneToHundred {

	public static void main(String[] args) {
		for(int num = 1; num <= 100; num++) {
			if(isPrime(num)) {
				System.out.print(num + "\t");
			}
		}
	}
	
	public static boolean isPrime(int num) {
		if(num == 1) return false;
		else if(num == 2 || num ==3 || num == 5) return true;
		else if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0) return false;
		else {
			for(int factor = 7; factor <= Math.sqrt(num); factor = factor + 2) {
				if(num % factor == 0) return false;
			}
			return true;
		}
	}

}
