package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	static int CNT = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("퀵 정렬을 합시다!!!");
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(CNT);
	}

	private static void quickSort(int[] arr) {
		// TODO Auto-generated method stub
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		CNT++;
		int part2 = partition(arr, start, end);
		if(start < part2 - 1) {
			quickSort(arr, start, part2 - 1);
		}
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = arr[(start +  end) / 2];
		while(start <= end) {
			while(arr[start] < pivot) start++;
			while(arr[end] > pivot) end--;
			if(start <= end) {
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
