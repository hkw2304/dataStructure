package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort2 {
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
		System.out.println("==================");
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		int[] temp = new int[arr.length];
		mergeSort(arr, temp, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int[] temp, int start, int end) {
		// TODO Auto-generated method stub
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid + 1, end);
			Sort(arr, temp, start, mid, end);
		}
	}
	private static void Sort(int[] arr, int[] temp, int start, int mid, int end) {
		// TODO Auto-generated method stub
		for (int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}
		int part = start;
		int part2 = mid + 1;
		int index = start;

		while (part <= mid && part2 <= end) {
			if (temp[part] <= temp[part2]) {
				arr[index] = temp[part];
				part++;
			} else {
				arr[index] = temp[part2];
				part2++;
			}
			index++;
		}
		for(int i = 0; i <= mid - part; i++) {
			arr[index + i] = temp[part + i];
		}
		
	}
}
