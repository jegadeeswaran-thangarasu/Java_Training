 package day6;

public class StringDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world";
		String ss = new String("hello world");
		
		String temp = s;
		
		s = s + " india";
		
		System.out.println(s);
		System.out.println("temp value..:"+temp);
		
		StringBuilder sb = new StringBuilder("hello world builder...");//non sysnchronized - so not thread safe but fast
		StringBuffer sbf = new StringBuffer("hello world buffer");//sysnchronized - so thread safe but slow
		
		StringBuilder buildtemp = sb;
		
		sb.append("   india...");
		System.out.println(sb);
		System.out.println(buildtemp);
		
		//methods of string class 
		System.out.println(sb.charAt(9));
		System.out.println(sb.capacity());
		System.out.println(sb.codePointAt(9));
		System.out.println(sb.codePointBefore(9));
		System.out.println(sb.indexOf("w"));
		
		
		String sf = String.format("%s", "hello world",100);
		System.out.println("sf print\n"+sf);
		new StringDemo().test("aaa","bbb","cccc");
		
		/*
		 * % is a special character to say that formatting instruction follows... 
		 * %s,d,f represent string integer and float
		 * after % - flag- can have a flag - (+ or -) - to indicate padding on left(-) or right
		 *after flag - width is what u gave -n denoted the minimum number of spaces/output characters..
		 *[.] denotes the precision of output
		 *
		 * 
		*/
		System.out.printf("%-12s %-12s %s","Column1","Column2","Column2");
	}
	public void test(String...strings) {
		for(String a:strings) {
			System.out.println(a);
		}
	}
}
