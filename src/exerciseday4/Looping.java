package exerciseday4;

import java.util.Scanner;

public class Looping {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String numerator;
		String divisor;
		int numeratorInt;
		int divisorInt;
		while(true) {
			System.out.println("enter numerator...");
			numerator = scan.next();
			System.out.println("enter divisor...");
			divisor = scan.next();
			if( numerator.charAt(0) == 'q' || numerator.charAt(0) == 'Q' ) {
				return ;
			}else {
				try {
					numeratorInt = Integer.parseInt(numerator);
					divisorInt = Integer.parseInt(divisor);
					System.out.println(numeratorInt / divisorInt);
				}catch(ArithmeticException ae) {
					ae.printStackTrace();
				}catch(NumberFormatException ne) {
					ne.printStackTrace();
				}
			}
		}
	}
}
