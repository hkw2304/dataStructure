package sort;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class HeapSort3 {
	public static void main(String[] args) {
		int[] arr = { 7, 8, 1, 9, 3, 2, 5 };
		System.out.println(Arrays.toString(arr));
		System.out.println("HeapSort.....");
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		int size = arr.length - 1;
		if(size < 2)
			return;
		int parentIndex = getParentIndex(size);
		for(int i = parentIndex; i >= 0; i--) {
			heap(arr, i, size);
		}
		for(int i = size; i > 0; i--) {
			swap(arr, 0 ,i);
			heap(arr, 0, i - 1);
		}
	}

	private static void heap(int[] arr, int parentIndex, int lastIndex) {
		// TODO Auto-generated method stub
		int rightIndex = parentIndex * 2 + 2;
		int leftIndex = parentIndex * 2 + 1;
		int maxIndex = parentIndex;
		if (rightIndex <= lastIndex && arr[rightIndex] > arr[maxIndex])
			maxIndex = rightIndex;
		if (leftIndex <= lastIndex && arr[leftIndex] > arr[maxIndex])
			maxIndex = leftIndex;
		if (maxIndex != parentIndex) {
			swap(arr, parentIndex, maxIndex);
			heap(arr, maxIndex, lastIndex);
		}

	}

	private static void swap(int[] arr, int parentIndex, int maxIndex) {
		// TODO Auto-generated method stub
		int temp = arr[parentIndex];
		arr[parentIndex] = arr[maxIndex];
		arr[maxIndex] = temp;
	}

	private static int getParentIndex(int size) {
		// TODO Auto-generated method stub
		return (size - 1) / 2;
	}
}
