package day4;

public class ExcepDemo {

	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			String s = args[0];
			int i = 1 / Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}catch(NumberFormatException ne) {
			System.out.println(ne);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally called...");
		}
		System.out.println("after exception...");
		try {
			new ThrowDemo().met(1);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
//never ever have a try catch block for system exception
//system exception are supposed to be solved before execution
//validation should be performed before using the data

// throw - explicity throw a exception

class MyException extends Exception {
	
	String msg;
	public MyException( String msg) {
		this.msg = msg;
	}
	public String toString() {
		return "My Exception....";
	}
}
class ThrowDemo {
	public void met(int i) throws Exception {
		if(i == 1) {
			//throw new MyException();
		}
	}
}