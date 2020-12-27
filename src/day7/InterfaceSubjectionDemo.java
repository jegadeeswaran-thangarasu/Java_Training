package day7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterfaceSubjectionDemo {
	public static void main(String[] args) {
		Object shoiab = new Human();
		AlopathyMedicalCollege stanley = new AlopathyMedicalCollege();
		AyurvedMedicalCollege ayush = new AyurvedMedicalCollege();
		JetAcademy jet = new JetAcademy();
		//subjection
		//proxy - one who represent
		//loader - class subject to args 0
		//interface array to args 1
		//invokation handle args2
		Object object = (Doctor)Proxy.newProxyInstance
				(Human.class.getClassLoader(),new Class[] {Doctor.class,Pilot.class} , 
						new MyInvocationHandler(new Object [] {stanley,jet}) );
		Doctor doctorShoiab = (Doctor)object;
		doctorShoiab.doCure();
		
		
		Pilot pilotShoiab = (Pilot)object;
		pilotShoiab.doFly();
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
class AlopathyMedicalCollege implements Doctor {
	@Override
	public void doCure() {
		// TODO Auto-generated method stub
		System.out.println("do cure method called....allopathy medical callege...");
	}
}
class AyurvedMedicalCollege implements Doctor {
	@Override
	public void doCure() {
		// TODO Auto-generated method stub
		System.out.println("do cure method called.... ayurved medical college");
	}
}

interface Pilot {
	public void doFly();
}
class JetAcademy implements Pilot {

	@Override
	public void doFly() {
		// TODO Auto-generated method stub
		System.out.println("i am pilot...");
	}
}