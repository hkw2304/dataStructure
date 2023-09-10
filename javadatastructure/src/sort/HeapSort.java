package sort;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] arr = {7,5,6,2,4,9,1, 12, 26, 13, 17};
		heapsort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void heapsort(int[] arr) {
		int size = arr.length;
		if(size < 2)
			return;
		int parentIdx = getParent(size - 1);
		for(int i = parentIdx; i >=0; i--) {
			heapify(arr, i, size - 1);
		}
		for(int i = size - 1; i > 0; i--) {
			swap(arr, 0, i);
			heapify(arr, 0, i - 1);
		}
	}
	private static int getParent(int child) {
		return (child - 1) / 2;
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private static void heapify(int[] arr, int parentIdx, int lastIdx) {
		int leftChildIdx = 2 * parentIdx + 1;
		int rightChildIdx = 2 * parentIdx + 2;
		int largestIdx = parentIdx;
		
		if(leftChildIdx <= lastIdx && arr[largestIdx] < arr[leftChildIdx]) {
			largestIdx = leftChildIdx;
		}
		if(rightChildIdx <= lastIdx && arr[largestIdx] < arr[rightChildIdx]) {
			largestIdx = rightChildIdx;
		}
		if(parentIdx != largestIdx) {
			swap(arr, largestIdx, parentIdx);
			heapify(arr, largestIdx, lastIdx);
		}
	}
}
