package day9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OneObjectOneTaskManyThreadsDemo {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Gun bofors=new Gun();
		es.execute(()-> {
			for(int i=0;i<5;i++) {
				bofors.fill();
			}
		});		
		es.execute(()-> {
			for(int i=0;i<5;i++) {
				bofors.shoot();
			}
		});
		es.shutdown();
	}
}
class Gun{
	boolean flag;
	synchronized public void fill() {
		if(flag) {
			try {
				wait();
			}catch(Exception e) {}
		}
		System.out.println("fill the gun....");
		flag=true;
		notify();
	}
	synchronized public void shoot() {
		if(!flag) {
			try {
				wait();
			}catch(Exception e) {}
		}
		System.out.println("shoot the gun....");
		flag=false;
		notify();
	}
}