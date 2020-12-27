package day8;

public class SingleTonDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Single single1 = Single.createSingleObject();
			}
			
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Single single2 = Single.createSingleObject();
			}
			
		}).start();
		
		//Single single1 = Single.createSingleObject();
		//Single single2 = Single.createSingleObject();
	}
}

class Single {
	private static Single single;
	
	private Single() {
		System.out.println("single class object created...");
	}
	//factory method
	
	synchronized public static Single createSingleObject() {
		if(single == null) {//in case if two threads enter the condition - two object will be created
			//double dip problem...and this problem is solved using keyword synchromized
			try {Thread.sleep(5000);}catch(Exception e) {}
			single = new Single();
		}
		return single;
	}
}