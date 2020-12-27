package satrevision;

import java.util.Scanner;

public class FanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BadFan badFan = new BadFan();
		GoodFan goodFan = new GoodFan();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("press a key and enter...");
			scan.next();
			//badFan.pull();
			goodFan.pull();
		}
	}
}
