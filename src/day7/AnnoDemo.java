package day7;

import java.lang.reflect.Field;

public class AnnoDemo {
	public static void main(String[] args) throws Exception{
		AnnoTest obj = new AnnoTest();
		Class c = obj.getClass();
		Scope s = (Scope)c.getAnnotation(Scope.class);
		System.out.println("Class Level..:"+s.i()+"..:"+s.s()+"..:"+s.sarr()[1]);
		
//		Field f = c.getDeclaredField("obj");
//		f.setAccessible(true);
//		s=(Scope)f.getAnnotation(Scope.class);
//		System.out.println("Cs Level..:"+s.i()+"..:"+s.s()+"..:"+s.sarr()[1]);
	}
}

class AnnoTest {
	@Scope(s="String value...",i=20,sarr= {"aaa","bbb","ccc"})
	String obj;
	@Scope(i=30)
	public void met() {
		
	}
}
@interface Scope {
	String s() default "Default value...";
	int i();
	String[] sarr() default {"a","b","c"};
}