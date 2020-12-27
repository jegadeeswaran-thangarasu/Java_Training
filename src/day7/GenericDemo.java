package day7;

public class GenericDemo {
	public static void main(String[] args) {
		GenericArrayProcessor gap = new GenericArrayProcessor();
		String s[] = {"aa","bb","cc"};
		Integer i[] = {34,45,67,89,56};
		
		gap.acceptAnyArray(s);
		gap.acceptAnyArray(i);
	}
}

class GenericArrayProcessor {
	public <E> void acceptAnyArray(E[] elements) {
		for(E e:elements) {
			System.out.println(e);
		}
	}
}