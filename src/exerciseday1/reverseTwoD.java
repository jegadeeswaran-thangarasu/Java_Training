package exerciseday1;

public class reverseTwoD {

	public static void main(String[] args) {
		int arr[][] = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};
		System.out.println("Array before reversing...");
		printArray(arr);
		reverseTwoD(arr);
		System.out.println("Array after reversing...");
		printArray(arr);
	}
	
	public static void reverseTwoD(int arr[][]) {
		int start;
		int end;
		int temp;
		for(int i = 0; i < arr.length; i++) {
			start = 0;
			end = arr[i].length - 1;
			while(start < end) {
				temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
				start++;
				end--;
			}
		}
	}
	public static void printArray(int arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
