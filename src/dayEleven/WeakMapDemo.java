package dayEleven;

import java.util.WeakHashMap;

public class WeakMapDemo {
	public static void main(String[] args) {
		WeakHashMap<MyKey, String> wm = new WeakHashMap<MyKey, String>();
		
		MyKey key1 = new MyKey("aaa");
		MyKey key2 = new MyKey("bbb");
		
		wm.put(key1, "ramu");
		wm.put(key2, "somu");
		
		key1 = null;
		
		System.out.println(wm);
		
		System.gc();
		
		System.out.println(wm);
	}
}
