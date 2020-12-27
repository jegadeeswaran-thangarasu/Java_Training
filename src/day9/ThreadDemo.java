package day9;

public class ThreadDemo {
	public ThreadDemo() {
		Thread t = new Thread(new JobOfThread());
		t.start();
	}
	public static void main(String[] args) throws Exception{
//		Thread t = Thread.currentThread();
//		System.out.println(t);
		new ThreadDemo();
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(10000);
		}
	}
}

class JobOfThread implements Runnable {
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}
//by default java runs a prgm by thread...