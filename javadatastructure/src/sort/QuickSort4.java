package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort4 {
	static int CNT = 0;
	static int EXCHANGE = 0;
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
		System.out.println("-------------------------");
		Quick(arr);
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(arr));
		System.out.println(CNT + "--------" + EXCHANGE);
	}

	static void Quick(int[] arr) {
		Quick(arr, 0, arr.length - 1);
	}

	static void Quick(int[] arr, int startIndex, int lastIndex) {
		int part = Partition(arr, startIndex, lastIndex);

		if (part -1 > startIndex) {
			Quick(arr, startIndex, part - 1);
		}
		if (part < lastIndex) {
			Quick(arr, part, lastIndex);
		}
		CNT++;
	}

	static int Partition(int[] arr, int startIndex, int lastIndex) {
		int pivot = arr[(startIndex + lastIndex) / 2];
		while (startIndex <= lastIndex) {
			while (arr[startIndex] < pivot)
				startIndex++;
			while (arr[lastIndex] > pivot)
				lastIndex--;
			if (startIndex <= lastIndex) {
				Swap(arr, startIndex, lastIndex);
				startIndex++;
				lastIndex--;
			}
		}
		return startIndex;
	}

	static void Swap(int[] arr, int startIndex, int lastIndex) {
		int temp = arr[startIndex];
		arr[startIndex] = arr[lastIndex];
		arr[lastIndex] = temp;
		EXCHANGE++;
	}
}
