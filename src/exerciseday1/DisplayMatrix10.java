package exerciseday1;

public class DisplayMatrix10 {

	public static void main(String[] args) {
		
		int arr[][] = {
				{ 1, 2, 3, 4},
				{ 5, 6, 7, 8},
				{ 9, 10, 11, 12},
				{ 13, 14, 15, 16}
		};
		
		displayMatrix(arr);
	}
	public static void displayMatrix(int arr[][]) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
