package exerciseday1;

public class arrayReverse {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Array before reverse...");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		reverseArray(arr);
		System.out.println("\nArray after reverse...");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	public static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start = start + 1;
			end = end - 1;
		}
	}

}
