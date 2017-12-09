/*
	pseudocode:

	Insertion-Sort(A)
		for j = 2 to A.length
			key = A[j]
			// Insert A[j] into the sorted sequence A[1...j - 1]
			i = j - 1
			while (i > 0 && A[i] > key) 
				A[i + 1] = A[i]
				i = i - 1
			A[i + 1] = key
*/

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = new int[]{3,5,4,7,2,1,6};
		InsertionSort.insertionSort(arr);
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public static void insertionSort(int[] A) {
		if (A == null || A.length == 0) {
			return;
		}
		for (int j = 1; j < A.length; j++) {
			int key = A[j];
			int i = j - 1;
			while (i >= 0 && A[i] > key) {
				A[i + 1] = A[i];
				i--;
			}
			A[i + 1] = key;
		}
	}
}