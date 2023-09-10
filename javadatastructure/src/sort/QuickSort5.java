package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++)
			arr[i] = r.nextInt(10);

		System.out.println(Arrays.toString(arr));
		quickSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void quickSort(int[] arr) {
		// TODO Auto-generated method stub
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int part = partition(arr, start, end);
			if(start < part - 1)
				quickSort(arr, start, part - 1);
			if (part < end)
				quickSort(arr, part, end);
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = arr[(start + end) / 2];
		while (start <= end) {
			while (arr[start] < pivot)
				start++;
			while (arr[end] > pivot)
				end--;
			if (start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}

	private static void swap(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
