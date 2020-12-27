package exerciseday1;

import java.util.Scanner;
public class Occurance {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 2 , 7, 8, 1, 1, 8, 7, 8, 3, 9};
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to search...");
		num = scan.nextInt();
		findOccurance(arr,num);
	}
	public static void findOccurance(int arr[],int num) {
		if(isOccured(arr,num)) {
			int noOfOccurance = 0;
			System.out.println("The locations");
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == num ) {
					noOfOccurance++;
					System.out.print(i+"\t");
				}
			}
			System.out.println("\nThe number "+ num +" is present "+ noOfOccurance + " times");
		}
		else {
			System.out.println("Not present...");
		}
	}
	
	public static boolean isOccured(int arr[],int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num ) return true;
		}
		return false;
	}
	

}
