package exerciseday1;

public class DisplayMatrix11 {

	public static void main(String[] args) {
		int arr[][] = {
				{ 1 },
				{ 2, 3 },
				{ 4, 5, 6},
				{ 7, 8, 9, 10 }
		};
		displayMatrix(arr);
	}
	public static void displayMatrix(int arr[][]) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
