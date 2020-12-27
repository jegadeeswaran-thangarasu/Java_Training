package exerciseday4;

import java.util.InputMismatchException;
import java.util.Scanner;

class HandleNegativeException extends Exception {
	public HandleNegativeException(String str) {
		System.out.println(str+" Please enter valid mark..");
	}
}

public class MyNegativeException {

	public static void main(String[] args) {
		
		MyNegativeException obj = new MyNegativeException();
		// TODO Auto-generated method stub
		int students;
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter number of students...");
		students = scan.nextInt();
		
		for(int i = 0; i < students; i++) {
			int marks[] = new int [5];
			for(int ind = 0; ind < 5; ind++) {
				System.out.println("student "+(i+1)+" mark "+ (ind+1));
				ind = obj.getMark(marks,ind);
			}
			System.out.println("Average mark "+ obj.getAverageMark(marks));
		}
	}
	
	public int getMark(int marks[], int i) {
		
		Scanner scan = new Scanner(System.in);
		try {
			marks[i] = scan.nextInt();
			//System.out.println(marks[i]);
			if(marks[i] < 0) {
				new HandleNegativeException("Negative value");
				i--;
			}
			else if(marks[i] > 100) {
				new HandleNegativeException("Out of Range"); 
				i--;
			}
		}catch(InputMismatchException ie) {
			System.out.println("please enter a valid mark");
			i--;
		}
		return i;
	}
	
	public int getAverageMark(int mark[]) {
		
		int sum = 0;
		for(int i = 0; i < mark.length; i++) {
			sum = sum + mark[i];
		}
		return sum / mark.length;
	}
}
