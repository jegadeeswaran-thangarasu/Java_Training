package day9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class OneObjectTwoThread {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		RCounter central=new RCounter();
		
		es.execute(()->{
			Thread.currentThread().setName("ramu");
			synchronized(central) {
			central.bookTicket(1000);
			central.giveChange();}
			}
		);
		es.execute(()->{
			Thread.currentThread().setName("somu");
			synchronized(central) {
				central.bookTicket(500);
				central.giveChange();
			}
			//central.water();
			
		});
		es.shutdown();	
	}
}
class RCounter{
	int amt;
	synchronized public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket booked for ...:"+name);
		System.out.println("Amount brought by..:"+name+" is :"+amt);
		//try {Thread.sleep(5000);}catch(Exception e) {}
	}
	synchronized public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Change given to ...:"+name);
		System.out.println("Amount given to..:"+name+" is :"+(amt-100));
	}
	public void water() {
		System.out.println("drinking water.............");
	}
}









//package day9;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class OneObjectTwoThread {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ExecutorService es = Executors.newFixedThreadPool(2);
//		RCounter central = new RCounter();
//		
//		es.execute(()->{
//			Thread.currentThread().setName("ramu");
//			central.bookTicket(1000);
//			central.giveChange();
//		});
//		es.execute(()->{
//			Thread.currentThread().setName("somu");
//			central.bookTicket(500);
////			central.water();
////			central.giveChange();
//			es.shutdown();
//		});
//		
//	}
//}
//
//class RCounter {
//	int amt;
//	public void bookTicket(int amt) {
//		this.amt = amt;
//		Thread t = Thread.currentThread();
//		String name = t.getName();
//		
//		System.out.println("tickter booked for ..."+name);
//		System.out.println("amount bought by ..."+name+"  is "+amt);
//		
//	}
//	synchronized public void giveChange() {
//		Thread t = Thread.currentThread();
//		String name = t.getName();
//		System.out.println("Change given to ..."+name);
//		System.out.println("amount given to ..."+name+"  is "+(amt-100));
//		try {Thread.sleep(5000);}catch(Exception e) {}
//	}
//	public void water() {
//		System.out.println("drink water....");
//	}
//}