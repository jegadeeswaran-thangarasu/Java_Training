package exerciseday1;

public class LargestEachRow {

	public static void main(String[] args) {
		int arr[][] = {
				{ 23,54,34,12 },
				{ 67,11,23,89 },
				{ 87,34,67,9 },
				{ 76,23,98,60 }
		};
		findLargest(arr);
	}
	public static void findLargest(int arr[][]) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(max < arr[i][j]) 
					max =arr[i][j];
			}
			System.out.println("Largest of row "+ i +" is ... :"+max);
			max = 0;
		}
	}
}
