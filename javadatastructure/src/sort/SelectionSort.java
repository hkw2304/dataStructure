package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("선택 정렬을 합시다!!!");
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));

		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectSort(int[] arr) {
		// TODO Auto-generated method stub
		int min;
		int temp;
		int index = 0;
		int com = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			min = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					com++;
					min = arr[j];
					index = j;
					flag = true;
				}
			}
			if (flag) {
				temp = arr[i];
				arr[i] = min;
				arr[index] = temp;
			}
			flag = false;
			

		}
		System.out.println(com);
	}
}
