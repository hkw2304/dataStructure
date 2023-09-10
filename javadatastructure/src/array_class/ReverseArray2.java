package array_class;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		reverse(arr);
		System.out.println("요소를 역순으로 정렬했습니다.");
		System.out.println(Arrays.toString(arr));
	}

	private static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length/2; i++) {
			swap(arr, i, arr.length -i -1);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
}
