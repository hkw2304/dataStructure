package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectSort2 {
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
	private static void Select(int[] arr) {
		// TODO Auto-generated method stub
		int indexMin = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			indexMin = i;
			for(int j = i + 1; j < arr.length; j++) {
				count++;
				if(min > arr[j]) {
					min = arr[j];
					indexMin = j;
					
				}
			}
			Sort(arr, i, indexMin);
			
		}
	}
	public static void Sort(int[] arr, int min, int max) {
		exchange++;
		int temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
	}
}
