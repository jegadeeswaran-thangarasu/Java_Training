package dayTen;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkAndJoinDemo {
	public static void main(String[] args) {
		StringArray sa = new StringArray();
		//System.out.println(sa.arr[8000000]);
		ForkJoinPool pool1 = ForkJoinPool.commonPool();
		
		OurTask task1 = new OurTask(0,2000000,sa.arr,"monu");
		OurTask task2 = new OurTask(2000001,4000000,sa.arr,"monu");
		OurTask task3 = new OurTask(4000001,7000000,sa.arr,"monu");
		OurTask task4 = new OurTask(7000001,9000000,sa.arr,"monu");
		
		int result1 = pool1.invoke(task1);
		int result2 = pool1.invoke(task2);
		int result3 = pool1.invoke(task3);
		int result4 = pool1.invoke(task4);
		//int total = result1+result2+result3+result4;
		//System.out.println(result2);
		System.out.println("The count of monu is ....:"+(result1+result2+result3+result4));
	}
}

class OurTask extends RecursiveTask<Integer> {
	int start,end;
	String arr[];
	String searchElement;
	public OurTask(int start, int end, String arr[],String searchElement) {
		this.start = start;
		this.end = end;
		this.searchElement = searchElement;
		this.arr = arr;
	}
	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=start;i<end;i++) {
			if(arr[i].equals(searchElement)) {
				count++;
			}
		}
		return count;
	}
	
}
class StringArray {
	String arr[] = new String[9000000];
	String data[]= {"ranu","somu","jonu","monu"};
	public StringArray() {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=data[j];
			if(j==3) {
				j=0;
			}
			j++;
		}
	}
}

//
//package dayTen;
//import java.util.concurrent.ForkJoinPool;
//import java.util.concurrent.RecursiveTask;
//public class ForkAndJoinDemo {
//	public static void main(String[] args) {
//		StringArray sa=new StringArray();
//		//System.out.println(sa.arr[8000000]);
//		ForkJoinPool pool1=ForkJoinPool.commonPool();
//		
//		OurTask task1=new OurTask(0, 2000000, sa.arr, "monu");
//		OurTask task2=new OurTask(2000001, 4000000, sa.arr, "monu");
//		OurTask task3=new OurTask(4000001, 7000000, sa.arr, "monu");
//		OurTask task4=new OurTask(7000001, 9000000, sa.arr, "monu");
//		
//		int result1=pool1.invoke(task1);
//		int result2=pool1.invoke(task2);
//		int result3=pool1.invoke(task3);
//		int result4=pool1.invoke(task4);
//		System.out.println(result1+":"+result2+":"+result3+":"+result4);
//		int total=result1+result2+result3+result4;
//		System.out.println("The count of monu is..:"+(result1+result2+result3+result4));
//		
//	}
//}
//class OurTask extends RecursiveTask<Integer>{
//	int start,end;
//	String arr[];
//	String searchElement;
//	public OurTask(int start,int end,String arr[],String searchElement) {
//		this.start=start;
//		this.end=end;
//		this.searchElement=searchElement;
//		this.arr=arr;
//	}
//	@Override
//	protected Integer compute() {
//		int count=0;
//		for(int i=start;i<end;i++) {
//			if(arr[i].equals(searchElement)) {
//				count++;
//			}
//		}
//		return count;
//	}
//}
//class StringArray{
//	String arr[]=new String[9000000];
//	String data[]= {"ramu","somu","jonu","monu"};
//	public StringArray() {
//		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=data[j];
//			if(j==3) {
//				j=0;
//			}
//			j++;
//		}
//	}
//}