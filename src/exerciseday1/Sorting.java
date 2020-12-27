package exerciseday1;

public class Sorting {

	public static void main(String[] args) {
		int arr [] = { 4, 12, 34, 7 ,13, 27, 1 };
		System.out.println("Array before sorting...");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		bubbleSort(arr);
		System.out.println("\nArray after sorting...");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	public static void bubbleSort(int arr[]) {
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
