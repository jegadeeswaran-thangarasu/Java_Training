package day6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PoliceStation p1 = new PoliceStation();
		Politician pol = new Politician();
		p1.arrest(pol);
	}
}
class Politician {
	public String name = "Good Holy Man...";
	private String secretName = "Rowdy sheeter....cheater.....";
	public void work() {
		System.out.println("all good work....");
	}
	private void secretWork() {
		System.out.println("loot, decority, murder  etc etc....");
	}
	public void secretName() {
		System.out.println("secret name works...");
	}
}
class PoliceStation {
	public void arrest(Object o) throws Exception {
		Class c = o.getClass();
		Field f = c.getField("name");
		System.out.println(f.get(o));
		Field ff[] = c.getFields();
		for(Field field:ff) {
			System.out.println(field.getName());
		}
		Method m = c.getMethod("work");
		m.invoke(o);
		torturecell(c);
	}
	public void torturecell(Class o) throws Exception {
		Class c=o.getClass();
		Field f = o.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(o));
		
		Method m = c.getDeclaredMethod("secretName");
		m.setAccessible(true);
		m.invoke(o);
	}
}