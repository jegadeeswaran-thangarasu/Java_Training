package day2diffpac;

import day2.HelloWorld;

public class HelloWorldDiffPackSub extends HelloWorld {
	
	public void met() {
		System.out.println(pub);;
		//System.out.println(pri);
		System.out.println(pro);
		//System.out.println(nomod);
	}
}

class HelloWorldDiffPackNonSub {
	HelloWorld obj = new HelloWorld();
	
	public void met() {
		System.out.println(obj.pub);;
		//System.out.println(obj.pri);
		//System.out.println(obj.pro);
		//System.out.println(obj.nomod);
	}
	
}