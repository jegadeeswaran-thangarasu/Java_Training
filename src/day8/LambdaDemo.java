package day8;

public class LambdaDemo {
	public static void main(String[] args) {
		//simple syntax
		DemoInterface di=()->{System.out.println("logic for demo method called...");};
		di.demoMethod();
		
		//for return method 
		DemoInterface2 di2 = ()->{return "hello and welcome lambdas...";};
		di2.demoMethod();
		System.out.println(di2.demoMethod());

		//for parametric method
		
		//without defining types + parameter + return
		DemoInterface3 di3 = (s1,s2)->{return s1+s2;};
		di3.demoMethod("hello", "world");
		//myComment/ System.out.println(di3.demoMethod("hello", "world"));

		//define type
		DemoInterface3 di33 = (String s1,String s2)->{return s1+s2;};
		di33.demoMethod("hello", "world");
		//myComment/ System.out.println(di33.demoMethod("hello", "world"));
		
		//without return statement
		DemoInterface3 di333 = (String s1,String s2)->(s1+s2);
		di333.demoMethod("hello", "world");
		//myComment/ System.out.println(di333.demoMethod("hello", "world"));

	}
}

@FunctionalInterface
interface DemoInterface {
	public void demoMethod();
}
@FunctionalInterface
interface DemoInterface2 {
	public String demoMethod();
}
@FunctionalInterface
interface DemoInterface3 {
	public String demoMethod(String s1, String s2);
}