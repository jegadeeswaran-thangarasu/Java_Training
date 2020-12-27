package myPractice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterfaceSubjectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human jegadees = new Human();
		AllopathyMedicalCollege allopathy = new AllopathyMedicalCollege();
		AyushvedMedicalCollege ayush = new AyushvedMedicalCollege();
		JetAcademy jet = new JetAcademy();
		
		Object object = (Doctor) Proxy.newProxyInstance(
				Human.class.getClassLoader(), new Class[] {Doctor.class, Pilot.class},
				new MyInvocationHandler(new Object[] {allopathy,jet}));
		
		Doctor doctorJegadees = (Doctor)object;
		doctorJegadees.doCure();
		
		Pilot pilotJegadees = (Pilot)object;
		pilotJegadees.doFly();
	}
}

class MyInvocationHandler implements InvocationHandler {

	Object obj[];
	Object o;
	public MyInvocationHandler(Object obj[]) {
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		for(int i = 0; i < obj.length; i++) {
			try {
				o = method.invoke(obj[i], args);
			}catch(Exception e) {}
		}
		return o;
	}
	
}
class Human {
	
}

interface Doctor {
	public void doCure();
}

class AllopathyMedicalCollege implements Doctor {

	@Override
	public void doCure() {
		// TODO Auto-generated method stub
		System.out.println("Allopathy treatment and medician ....");
	}
}
class AyushvedMedicalCollege implements Doctor {

	@Override
	public void doCure() {
		// TODO Auto-generated method stub
		System.out.println("ayushved treatment and medician...");
	}
}

interface Pilot {
	public void doFly();
}

class JetAcademy implements Pilot {

	@Override
	public void doFly() {
		// TODO Auto-generated method stub
		System.out.println("i am flying .....");
	}
}