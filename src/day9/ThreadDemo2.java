package day9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {
	public ThreadDemo2() {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.execute(()->{System.out.println("child thread called...");});
		es.execute(()->{System.out.println("child thread 2 called...");});
		es.shutdown();
	}
	public static void main(String[] args) throws Exception {
		new ThreadDemo2();
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
