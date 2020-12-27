package exerciseday1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner scanInt = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = scanInt.nextInt();
		int avg = calculateAverage(n);
		System.out.println("Average is "+ avg);
	}
	
	public static int calculateAverage(int n) {
		int arr[] = new int[n];
		int sum = 0;
		System.out.println("Enter "+ n +" numbers...");
		Scanner scanArr = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			arr[i] = scanArr.nextInt();
		}
		for(int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		return sum/n;
	}

}
