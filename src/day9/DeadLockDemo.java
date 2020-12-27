package day9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLockDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		Crane crane = new Crane();
		Frog frog = new Frog();
		es.execute(()->{
			crane.eat(frog);
		});
		es.execute(()->{
			frog.escape(crane);
		});
	}
}

class Crane {
	synchronized public void eat(Frog f) {
		System.out.println("crane is trying to eat the frog...");
		f.leave();
		System.out.println("swaha......");
	}
	synchronized public void leave() {
		System.out.println("crane leave method is called....");
	}
}
class Frog {
	synchronized public void escape(Crane c) {
		System.out.println("the crane was bit easy so the frog wakes up and...");
		System.out.println("holds the neck of the crane...");
		c.leave();
		System.out.println("great escape....");
	}
	synchronized public void leave() {
		System.out.println("frog leave method is called...");
	}
}