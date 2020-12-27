package exerciseday4;

public class NewException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//int i = 1 / 0;
			int ae = 1 / Integer.parseInt("ab");
		}catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("array index...");
		}catch(NumberFormatException ne) {
			ne.printStackTrace();
			System.out.println("number format...");
		}catch(ArithmeticException are) {
			are.printStackTrace();
			System.out.println("arithmetc ...");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception...");
		}
		finally {
			System.out.println("finally checked...");
		}
	}
}
