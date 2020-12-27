package dayEleven;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		Vector<String> list = new Vector<>(10,5);//using generics  u r actually making the collection specific
		list.add("hello world");
		list.add("123");
		list.add("asdfasdf");
		
		System.out.println(list);
		for(Object o:list) {
			String s = (String)o;
			System.out.println(s);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		ListIterator<String> liter = list.listIterator();
		//list.add("asd");
		liter.hasPrevious();
		//liter.previous();
		
		Enumeration<String> e = list.elements();
		list.add("gggggggggggggggggggg");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}

class Test {
	
}