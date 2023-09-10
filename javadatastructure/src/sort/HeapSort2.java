package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HeapSort2 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
//		System.out.print("size : ");
//		int size = sc.nextInt();
		int[] arr = {9,3,5,7,8,2,1};
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(10);
//		}
		System.out.println(Arrays.toString(arr));
		System.out.println("HeapSortting.....");
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		int size = arr.length - 1;
		if (size < 2)
			return;
		int parentIndex = getParentIndex(size);
		for (int i = parentIndex; i > 0; i--) {
			heap(arr, i, size);
		}
		for(int i = size; i > 0; i--) {
			swap(arr, 0, i);
			heap(arr, 0, i - 1);
		}
	}

	private static void heap(int[] arr, int parentIndex, int lastIndex) {
		// TODO Auto-generated method stub
		int leftIndex = parentIndex * 2 + 1;
		int rightIndex = parentIndex * 2 + 2;
		int biggestIndex = parentIndex;
		if (rightIndex <= lastIndex && arr[rightIndex] > arr[biggestIndex])
			biggestIndex = rightIndex;
		if (leftIndex <= lastIndex && arr[leftIndex] > arr[biggestIndex])
			biggestIndex = leftIndex;
		if (biggestIndex != parentIndex) {
			swap(arr, parentIndex, biggestIndex);
			heap(arr, biggestIndex, lastIndex);
		}

	}

	private static void swap(int[] arr, int parentIndex, int biggestIndex) {
		// TODO Auto-generated method stub
		int temp = arr[biggestIndex];
		arr[biggestIndex] = arr[parentIndex];
		arr[parentIndex] = temp;
	}

	private static int getParentIndex(int size) {
		// TODO Auto-generated method stub
		int parentIndex = size - 1;
		return parentIndex / 2;
	}
}
