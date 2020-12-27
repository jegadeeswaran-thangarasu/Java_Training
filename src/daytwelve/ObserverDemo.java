package daytwelve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ObserverDemo {
	public static void main(String[] args) {
		FireAlarm shakti=new FireAlarm();
		Student coda=new Student();
		Teacher shoiab=new Teacher();
		//assign knowledge
		shakti.addObserver(coda);
		shakti.addObserver(shoiab);
		
		shakti.setFire();
	}
}
class CustomObservable extends Observable{
	ExecutorService es;
	public CustomObservable() {
		es=Executors.newFixedThreadPool(10);
	}
	List<Observer> list=new ArrayList<Observer>();
	@Override
	public synchronized void addObserver(Observer o) {
		list.add(o);
	}
	@Override
	public void notifyObservers(Object msg) {
		Iterator<Observer> iter=list.iterator();
		while(iter.hasNext()) {
			Observer obs=iter.next();
			es.execute(()->{
				obs.update(this, msg);
			});
		}
		es.shutdown();
	}
}
class FireAlarm extends CustomObservable{
	public void setFire() {
		setChanged();
		notifyObservers("fire in the mountain run run run.........bhago....");
	}
}
class Student implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		String msg=(String)arg;
		System.out.println("Student running...:"+msg);
	}
}
class Teacher implements Observer{
@Override
	public void update(Observable o, Object arg) {
		System.out.println("Teacher is thinking...........not able to decide....");
		try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("Teacher running...:"+(String)arg);
		
	}	
}