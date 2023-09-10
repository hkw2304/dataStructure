package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort2 {
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
		Bubble(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(count + "////" + exchange);
	}
	public static void Bubble(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length-i - 1; j++) {
				count++;
				if(arr[j] > arr[j + 1]) {
					Sort(arr, j, j + 1);
					System.out.println("=====================");
					System.out.println(Arrays.toString(arr));
					System.out.println("=====================");
				}
			}
			
		}
	}
	public static void Sort(int[] arr, int min, int max) {
		exchange++;
		int temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
	}
	
}
