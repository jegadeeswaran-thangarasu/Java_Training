package day2;

public class PBROnArrays {
	public static void main(String[] args) {
		int iarr[] = new int[5];
		
		int jarr[] = iarr;
		System.arraycopy(iarr, 0, jarr, 0, iarr.length);
		new PBROnArrays().getArray(iarr);
		
		System.out.println(iarr[1]);
		
		System.out.println("jarray value is ...:"+jarr[1]);
	}
	
	public void getArray(int i[]) {
		i[1] = 10;
	}
}
