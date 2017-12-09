/*
	pseudocode:
	
	QuickSort(A, p, r)
		if p < r
			q = Partition(A, p, r)
			QuickSort(A, p, q - 1)
			QuickSort(A, q + 1, r)

	Partition(A, p, r) 
		x = A[r]
		i = p - 1
		for j = p to r - 1
			if A[j] <= x
				i = i + 1
				exchange A[i] with A[j]
		exchange A[i + 1] with A[r]
		return i + 1
*/

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] A = null;
		QuickSort.quickSort(A);
		System.out.println(Arrays.toString(A));

		A = new int[]{1,2,3,4,5};
		QuickSort.quickSort(A);
		System.out.println(Arrays.toString(A));

		A = new int[]{5,4,3,2,1};
		QuickSort.quickSort(A);
		System.out.println(Arrays.toString(A));

		A = new int[]{5,3,4,7,2,1,6};
		QuickSort.quickSort(A);
		System.out.println(Arrays.toString(A));
	}
	public static void quickSort(int[] A) {
		if (A == null) {
			return;
		}
		quickSortHelper(A, 0, A.length - 1);
	}
	public static void quickSortHelper(int[] A, int l, int r) {
		if (l >= r) {
			return;
		}
		int q = partition(A, l, r);
		quickSortHelper(A, l, q - 1);
		quickSortHelper(A, q + 1, r);
	}
	public static int partition(int[] A, int l, int r) {
		int pivot = A[r];
		int i = l - 1;
		for (int j = l; j < r; j++) {
			if (A[j] <= pivot) {
				i++;
				swap(A, i, j);
			}
		}
		swap(A, i + 1, r);
		return i + 1;
	}
	public static void swap(int[] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
}