package day8;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
public class GarbageDemo {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		r.gc();
		System.out.println("Free space in house before tathas birth..."+r.freeMemory());
		GrandFather tatha=new GrandFather();
		//SoftReference<GrandFather> sf=new SoftReference<GrandFather>(tatha);		
		WeakReference<GrandFather> weak = new WeakReference<GrandFather>(tatha);
		
		System.out.println("Free space in house after tathas birth..."+r.freeMemory());
		System.out.println("tatha dies...");
		tatha=null;
		System.out.println(tatha);
		System.out.println("tatha is no more...");
		System.out.println("Free space in house after tathas death..."+r.freeMemory());
		r.gc();
		System.out.println("after tatha left...."+r.freeMemory());
		//tatha=sf.get();
		//System.out.println(tatha.getGold());		
	}
}
class GrandFather{
	String age;
	private String gold;
	public GrandFather() {
		for(int i=0;i<10000;i++) {
			age=new String("   "+i);
		}
	}	
	protected String getGold() {
		return "The gold is under the banyan tree in the garden....";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized called,,, because this object is getting garbaged...");
		System.out.println(getGold());
	}
}
//package day8;
//
//import java.lang.ref.SoftReference;
//
//public class GarbageDemo {
//	public static void main(String[] args) {
//		Runtime r = Runtime.getRuntime();
//		System.out.println("free memory before thathas birth..."+r.freeMemory());
//		GrandFather tatha = new GrandFather();
//		//SoftReference <GrandFather> sf = new SoftReference<GrandFather>(tatha);
//		System.out.println("Free space after thathas birth..."+r.freeMemory());
//		System.out.println("tatha dies...");
//		tatha = null;
//		System.out.println(tatha);
//		System.out.println("tatha is no more....");
//		System.out.println("Free space after thathas death..."+r.freeMemory());
//		r.gc();
//		System.out.println("after tathas left..."+r.freeMemory());
//		//tatha = sf.get();
//		//System.out.println(tatha.getGold());
//	}
//}
//
//class GrandFather {
//	String age;
//	private String gold;
//	public GrandFather() {
//		for(int i = 0; i < 10000; i++) {
//			age = new String("   "+1);
//		}
//	}
//	protected String getGold() {
//		return "The gold is under the banyan tree in the garder...";
//	}
//	@Override
//	protected void finalize() throws Throwable {
//		// TODO Auto-generated method stub
//		super.finalize();
//		System.out.println("finalized called,,, because this object is getting garbaged...");
//		System.out.println(getGold());
//	}
//}