package day7;

import java.lang.reflect.Constructor;

public class ReflectionDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Constructor cons1 = Class.forName("day7.Test").getConstructor(new Class[] {String.class});
		Constructor cons2 = Class.forName("day7.Test").getConstructor(new Class[] {String.class,Employee.class});

		Test t1 = (Test)cons1.newInstance(new Object[] {"fdfdf"});
		Test t2 = (Test)cons1.newInstance(new Object[] {"fdfdf", new Employee()});

	}
}
class Test {
	public Test(String s) {
		System.out.println("test objtect created with string constructor...");
	}
	public Test(String s, Employee e) {
		System.out.println("Test object created with string and employee...");
	}
}

class Employee {
	
}