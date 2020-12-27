package dayEleven;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo2 {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet(new MyComparator());
		set.add(new Student("ffffff"));
		set.add(new Student("cccccc"));
		set.add(new Student("eeeeee"));
		set.add(new Student("aaaaaa"));
		set.add(new Student("zzzzzz"));
		set.add(new Student("bbbbbb"));
		System.out.println(set);
		
		for(Student s:set) {
			System.out.println(s);
		}
//		for(int i=0;i<set.size();i++) {
//			System.out.println(set.);
//		}
		
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
class Student implements Comparable<Student>{
	String name;
	public Student(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}