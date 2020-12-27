package exerciseday1;

public class Prime {

	public static void main(String[] args) {
		IsPrime isPrime = new IsPrime();
		System.out.println("The numeber is "+isPrime.findIsPrime(113));
	}

}

class IsPrime {
	
	String prime = "prime";
	String notPrime = "not a prime";
	public String findIsPrime(int num) {
		if(num == 2 || num == 3 || num == 5)
			return prime;
		else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) 
			return notPrime;
		for(int factor = 7; factor <= Math.sqrt(num); factor = factor + 2) {
			if(num % factor == 0) return notPrime;
		}
		return prime;
	}
}