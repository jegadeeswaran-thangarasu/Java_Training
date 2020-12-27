package day2;

public class SimpleArrayDemo {
	public static void main(String[] args) {
		int []iarr = new int[5];
		iarr[0] = 100;
		iarr[1] = 200;
		
		String sarr[] = new String[4];
		sarr[0] = "hello world";
		sarr[1] = args[0];
		
		System.out.println(iarr[1]);
		System.out.println(sarr[1]);
		
		int iarr2[] = {1,2,5,3,8,10};
		String sarr2[] = { "a","hello", "args[0", "hai"};
		
		int iarrtwo[][] = {
				{ 23,4,3,56},
				{11,5,8,22},
				{45,23,6,4}
		};
		
		System.out.println(iarrtwo[0][2]);
		for(int i = 0; i<iarrtwo.length;i++) {
			for( int j = 0; j < iarrtwo[i].length;j++) {
				System.out.println(iarrtwo[i][j]);
			}
		}
		
		for( int i:iarr2) {
			System.out.println(i);
		}
		
		for(int i[]:iarrtwo) {
			for(int j:i) {
				System.out.println(j + "\t");
			}
			System.out.println("\n");
		}
		
	}
}
