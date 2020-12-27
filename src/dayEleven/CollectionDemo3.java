package dayEleven;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CollectionDemo3 {
	public static void main(String[] args) {
		Map<MyKey,String> map = new TreeMap<MyKey, String>(new MyComptr());
		map.put(new MyKey("s1"), "ramu");
		map.put(new MyKey("s2"), "somu");
		map.put(new MyKey("s3"), "monu");
		
		System.out.println(map);
		System.out.println(map.get(new MyKey("s2")));
		
		Set<Entry<MyKey,String>> set = map.entrySet();
		Iterator<Entry<MyKey,String>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<MyKey, String> me = iter.next();
			System.out.println(me.getKey()+"  :  "+me.getValue());
		}
		
	}
}

class MyComptr implements Comparator<MyKey> {

	@Override
	public int compare(MyKey o1, MyKey o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
class MyKey implements Comparable<MyKey> {
	String s;
	public MyKey(String s) {
		this.s = s;
	}
	
	public String toString() {
		return s;
	}

	@Override
	public int compareTo(MyKey o) {
		// TODO Auto-generated method stub
		return this.s.compareTo(o.s);
	}
}