package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort3 {
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
		Quick(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void Quick(int[] arr) {
		Quick(arr, 0, arr.length - 1);
		
	}
	private static void Quick(int[] arr, int startIndex, int lastIndex) {
		int part = QuickSort(arr, startIndex, lastIndex);
		if(startIndex < part - 1)
			QuickSort(arr, startIndex, part-1);
		if(part < lastIndex)
			QuickSort(arr, part, lastIndex);
	}
	private static int QuickSort(int[] arr, int startIndex, int lastIndex) {
		// TODO Auto-generated method stub
		int pivot = arr[(startIndex + lastIndex) / 2];
		while (startIndex <= lastIndex) {
			while (arr[startIndex] < pivot)
				startIndex++;
			while (arr[lastIndex] > pivot)
				lastIndex--;
			if (startIndex <= lastIndex) {
				swap(arr, startIndex, lastIndex);
				startIndex++;
				lastIndex--;
			}
		}
		return startIndex;
	}

	private static void swap(int[] arr, int startIndex, int lastIndex) {
		// TODO Auto-generated method stub
		int temp = arr[startIndex];
		arr[startIndex] = arr[lastIndex];
		arr[lastIndex] = temp;
	}
}
