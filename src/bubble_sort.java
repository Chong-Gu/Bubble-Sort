
public class bubble_sort {
	public static void main (String args[]) {
		int[] arr = {5, 3, 1, 6, 7, 2, 4, 8};
		bubbleSort(arr);
		
		for(int i : arr)
			System.out.print(i + " ");
	}
	
	private static void bubbleSort(int[] arr) {
		for (int p = 0; p < arr.length; p++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i+1])
					swap(arr, i, i+1);
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

