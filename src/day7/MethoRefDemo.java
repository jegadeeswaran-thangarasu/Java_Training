package day7;

class Impl {
	public Impl() {
		System.out.println("constructor logic called,,,");
	}
}
public class MethoRefDemo {
	
	public MethoRefDemo () {
		
	}
	public static void main(String[] args) {
		new SayHello() {

			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("hello.....");
			}
		}.hello(); //anonymous class
//		SayHello hello = MethoRefDemo::myHello; //method referencing
//		hello.hello();//lambda
//		
		//method reference implementation possible only with functional interface
		//static method
		SayHello shello = MethoRefDemo::myHello;
		shello.hello();
		
		//non static 
		SayHello shello2 = new MethoRefDemo()::myHello2;
		shello2.hello();
		
		SayHello shello3 = Impl::new;
		shello3.hello();
		
	}
	
	public void myHello2() {
		System.out.println("my hello non static ...implementation");
	}
	public static void myHello() {
		System.out.println("my hello custom implementation...");
	}
}

@FunctionalInterface
interface SayHello {
	public void hello();
}
class SayHelloImpl implements SayHello {

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("normal implementation...");
	}
	public void hello2() {
		
	}
}