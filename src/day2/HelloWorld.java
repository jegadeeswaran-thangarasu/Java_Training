package day2;

public class HelloWorld {
	
	//access specifiers
	public int pub;
	private int pri;
	protected int pro;
	int nomod;
	
	public void met() {
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(nomod);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to java.....");
	}
}

class HelloWorldSub extends HelloWorld {
	
	public void met() {
		System.out.println(pub);
		//System.out.println(pri);
		System.out.println(pro);
		System.out.println(nomod);
	}
	
}

class HelloWorldNonSub {
	
	HelloWorld obj = new HelloWorld();
	public void met() {
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
	}
	
}