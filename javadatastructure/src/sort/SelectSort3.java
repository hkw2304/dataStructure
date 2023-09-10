package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectSort3 {
	static int count = 0;
	static int exchange = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) 
			arr[i] = r.nextInt(10);
		
		
		System.out.println(Arrays.toString(arr));
		Select(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(count + "////" + exchange);
	}
	public static void Select(int[] arr) {
		int indexMin, temp;
		for(int i = 0; i < arr.length - 1; i++) {
			count++;
			indexMin = i;
			for(int j = i + 1; j < arr.length; j++) {
				count++;
				if(arr[j] < arr[indexMin]) {
					count++;
					exchange++;
					indexMin = j;
				}
			}
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
	}
}
