public class Sorting {
	
	public static int[] arr;
	
	static void sortArray(String option) {
		int l = arr.length;
		
		for (int i = 0; i < l; i++)
			for (int j = 1; j < (l - i); j++)
				if (arr[j - 1] > arr[j]) {
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			
		if (option == "M") {
			for (int i = 0; i < arr.length / 2; i++) {
				int tmp = arr[i];
				arr[i] = arr[arr.length - i - 1];
				arr[arr.length - i - 1] = tmp;
			}
		} else if (option != "R")
			throw new IllegalArgumentException();
		
	}
	
	static void showArray() {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
	}
	
	static boolean isSorted(String option) {
		if (option == "R") {
			for (int i = 1; i < arr.length; i++)
				if (arr[i - 1] > arr[i])
					return false;
				
			return true;
		} else if (option == "M") {
			for (int i = 1; i < arr.length; i++)
				if (arr[i - 1] < arr[i])
					return false;
				
			return true;
		} else
			throw new IllegalArgumentException();
		
	}
}