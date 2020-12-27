package exerciseday1;

public class FindLocation {

	public static void main(String[] args) {
		int arr[] = { 45, 23, 12, 65, 34, 32, 79, 14};
		System.out.println("The Location is... : "+findLocation(arr,14));
	}
	
	public static String findLocation(int arr[], int num) {
		String notFound = "Not Found";
		String found = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) return found+i;
		}
		return notFound;
	}
} 
