package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		int[] temp = new int[arr.length];
		mergeSort(arr,temp, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr,int[] temp, int start, int end) {
		// TODO Auto-generated method stub
		
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr,temp, start, mid);
			mergeSort(arr,temp, mid + 1, end);
			partition(arr, temp, start, mid, end);
		}
	}

	private static void partition(int[] arr, int[] temp, int start, int mid, int end) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		int startIndex = start;
		int midIndex = mid + 1;
		int arrIndex = start;
		while (startIndex <= mid && midIndex <= end) {
			if (temp[startIndex] <= temp[midIndex]) {
				arr[arrIndex] = temp[startIndex];
				startIndex++;
			} else {
				arr[arrIndex] = temp[midIndex];
				midIndex++;
			}
			arrIndex++;
		}
		for (int i = 0; i <= mid - startIndex; i++) {
			arr[arrIndex + i] = temp[startIndex + i];
		}
	}
}
