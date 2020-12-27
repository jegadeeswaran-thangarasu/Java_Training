package myPractice;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericArrayProcessor gap = new GenericArrayProcessor();
		Integer iarr[] = {12, 23, 34, 45, 56, 67, 78 };
		String sarr[] = {"aaaaa","bbbbb","ccccc"};
		
		gap.acceptAnyArray(iarr);
		gap.acceptAnyArray(sarr);
	}

}
class GenericArrayProcessor {
	public <E> void acceptAnyArray(E[] elements) {
		for(E e :elements) {
			System.out.println(e);
		}
	}
}