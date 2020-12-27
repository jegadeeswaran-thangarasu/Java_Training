package day9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo3 {

	public ThreadDemo3() throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future future = es.submit(new MyCallable());
		String result = (String) future.get();
		
		System.out.println("The value is..."+ result);
		es.shutdown();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new ThreadDemo3();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}

class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "child thread value returned...";
	}
}