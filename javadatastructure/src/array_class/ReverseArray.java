package array_class;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(20);
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println("배열을 역순으로 정렬 합니다.");
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		int endLength = arr.length - 1;
		int temp = 0;
		for(int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[endLength];
			arr[endLength] = temp;
			endLength--;
		}
		
	}
}
