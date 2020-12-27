package exerciseday4;

public class Sample {
	
	public void mth1(String []args) {
		mth2(args);
		System.out.println("caller...");
	}
	public void mth2(String []args) {
		try {
			int i = 1 / Integer.parseInt(args[0]);
			return ;
			//System.exit(0);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("catch mth2...");
		}
		finally {
			System.out.println("finally mth2...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.mth1(args);
	}
}
