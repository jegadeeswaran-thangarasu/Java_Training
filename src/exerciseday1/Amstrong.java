package exerciseday1;

import java.util.Scanner;
import java.lang.Math;

public class Amstrong {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numer...");
		num = scan.nextInt();
		if(isPrime(num)) {
			System.out.println("It is a Prime number...");
		}
		else if(isAmstrong(num)) {
			System.out.println("It is Amstrong number...");
		}
		else if(isPerfect(num)) {
			System.out.println("It is perfect number...");
		}
		else {
			System.out.println("None of these...");
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
	
	public static boolean isAmstrong(int num) {
		int safe = num;
		int digits = 0;
		int remainder;
		int sum = 0;
		while(num != 0) {
			num = num / 10;
			digits = digits + 1;
		}
		num = safe;
		
		while(num != 0) {
			remainder = num % 10;
			sum = (int) (sum + Math.pow(remainder, digits));
			num = num / 10;
		}
		
		if( safe == sum) return true;
		return false;
	}
	
	public static boolean isPerfect(int num) {
		int sum = 1;
		for(int divisor = 2 ; divisor <= num / 2; divisor++) {
			if(num % divisor == 0) sum = sum + divisor;
		}
		if(sum == num) return true;
		return false;
	}
}
