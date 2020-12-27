package day9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TwoThreadExample {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		ReservationCounter central = new ReservationCounter();
		
		es.execute(()->{Thread.currentThread().setName("ramu");central.bookTicket(200);});
		es.execute(()->{Thread.currentThread().setName("somu");central.bookTicket(30);});
		es.shutdown();
		
//		central.bookTicket(200);
//		System.out.println("the first line is executed first and then the second line is started...");
//		central.bookTicket(30);
		
	}
}

class ReservationCounter {
	public void bookTicket(int amt) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("ticket booking started..."+t.getName());
		if(amt >= 100 ) {
			try {Thread.sleep(5000);}catch(Exception e) {}
		}
		System.out.println("ticket booked for "+name);
	}
}