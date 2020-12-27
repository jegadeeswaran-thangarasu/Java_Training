package day6;

public class EncapsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KaliMark kali = new KaliMark();
		Pepsi pepsi = new Pepsi();
		
		kali.makeCola();
		pepsi.makeCola();
	}
}

abstract class Cola {
	public abstract void makeCola();//functional classes/ interfaces - the abstract class or interface with one method
}

class KaliMark {
	int t;
	public void makeCola() {
		//this is called - local inner class
		new Cola() {
			
			@Override
			public void makeCola() {
				System.out.println("cola made....");
				
			}
		}.makeCola();;
		/*
		class CampaCola extends Cola {
			String s;
			@Override
			public void makeCola() {
				//makeCola();
				//System.out.println(t);
				System.out.println("cola made by campa cola");
			}
		}
		Cola cola = new CampaCola();
		cola.makeCola(); */
		
		System.out.println("kalimark packs this cola and sells it...");
	}
	static String a;
	static class Demo {
		public void test() {
			System.out.println("test called..."+a);
		}
	}
//	public Cola trojen() {
//		return new CampaCola();
//	}
}
class Pepsi {
	public void makeCola() {
		KaliMark.Demo kd = new KaliMark.Demo();
		kd.test();
		//Cola cola = new KaliMark().new CampaCola();
		//Cola cola = new KaliMark().trojen();
		//Cola cola = new KaliMark().makeCola();
		// cola.makeCola();
		System.out.println("pepsi packs this cola and sells it...");
	}
}