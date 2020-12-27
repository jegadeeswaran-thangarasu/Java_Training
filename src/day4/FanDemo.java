package day4;
import java.util.Scanner;
public class FanDemo {
	public static void main(String[] args) {
		//BadFan shaitan=new BadFan();
		GoodFan haitan = new GoodFan();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Press a key and enter to pull the string.....");
			scan.next();
			//shaitan.pull();
			haitan.pull();
		}
	}
}

