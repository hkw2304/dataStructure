package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("삽입 정렬을 합시다!!!");
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));
//		insectionSort(arr);
//		System.out.println(Arrays.toString(arr));
	}
	public static void insectionSort(int[] arr) {
		int temp = 0;
		int com = 0;
		int exchange = 0;
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				com++;
				if(arr[j] > arr[i]) {
					exchange++;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					}
			}
		}
		System.out.println(com + " / " + exchange);
	}
}
