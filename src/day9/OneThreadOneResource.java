package day9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OneThreadOneResource {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->{
			Computer c = ComputerManager.getComputer();
			c.setOwner("ramu");
			//after some time
			try{Thread.sleep(5000);}catch(Exception e) {}
			
			Computer c2 = ComputerManager.getComputer();
			System.out.println("Thread 1..."+c2.getOwner());
			try {Thread.sleep(5000);}catch(Exception e) {}
			
			Computer c3 = ComputerManager.getComputer();
			System.out.println("Thread 1..."+c3.getOwner());
			
			ComputerManager.returnComputer();
			Computer c4 = ComputerManager.getComputer();
			System.out.println("thread 1...."+c4.getOwner());
		});
		
		es.execute(()->{
			try {Thread.sleep(10000);}catch(Exception e) {}
			Computer c = ComputerManager.getComputer();
			System.out.println("Thread 2 - The owner..."+c.getOwner());
			c.setOwner("somu");
			
			try {Thread.sleep(10000);}catch(Exception e) {}
			Computer c2 = ComputerManager.getComputer();
			System.out.println("Thread 2 - The owner..."+c2.getOwner());
			c.setOwner("somu");
		});
	}
}

class ComputerManager {
	private final static ThreadLocal<Computer> tlocal = new ThreadLocal<Computer>();
	public static Computer getComputer() {
		Computer c = tlocal.get();
		if(c==null) {
			c = new Computer();
			tlocal.set(c);
			return c;
		}
		else {
			return c;
		}
	}
	public static void returnComputer() {
		Computer c = tlocal.get();
		if(c!=null) {
			tlocal.remove();
		}
	}
}

class Computer {
	String owner;
	public Computer() {
		System.out.println("computer object is created...");
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return this.owner;
	}
}