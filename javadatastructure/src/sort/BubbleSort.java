package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("버블정렬을 합시다!!!!");
		System.out.print("배열의 길이 : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		int[] newArr = new int[len];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));
		newArr = bubble(arr);
		System.out.println(Arrays.toString(newArr));
		
	}
	static int[] bubble(int[] arr) {
		int temp = 0;
		int compare = 0;
		int exchange = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					exchange++;
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
				else
					compare++;
			}
		}
		System.out.println("비교 : " + compare + "교환 : " + exchange);
		return arr;
	}
}
